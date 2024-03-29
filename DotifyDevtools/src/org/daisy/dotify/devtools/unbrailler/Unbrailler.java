package org.daisy.dotify.devtools.unbrailler;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;

import org.daisy.braille.table.BrailleConverter;
import org.daisy.braille.table.Table;
import org.daisy.braille.table.TableCatalog;
import org.daisy.factory.FactoryProperties;

public class Unbrailler {
	private final XMLInputFactory inFactory;
	private final BrailleConverter bc;
	
	public Unbrailler(String tableId) {
        inFactory = XMLInputFactory.newInstance();
		inFactory.setProperty(XMLInputFactory.IS_COALESCING, Boolean.TRUE);        
        inFactory.setProperty(XMLInputFactory.IS_NAMESPACE_AWARE, Boolean.TRUE);
        inFactory.setProperty(XMLInputFactory.SUPPORT_DTD, Boolean.TRUE);
        inFactory.setProperty(XMLInputFactory.IS_SUPPORTING_EXTERNAL_ENTITIES, Boolean.TRUE);
        TableCatalog tc = TableCatalog.newInstance();
        for (FactoryProperties t : tc.list()) {
        	System.out.println(t.getIdentifier());
        }
		Table t = tc.get(tableId);
        this.bc = t.newBrailleConverter();
	}

	/**
	 * @param args
	 * @throws XMLStreamException 
	 * @throws IOException 
	 */
	public static void main(String[] args) throws XMLStreamException, IOException {
		if (args.length<2) {
			System.out.println("Expected two arguments, path to input file and table identifier.");
			for (FactoryProperties t : TableCatalog.newInstance().list()) {
				System.out.println(t.getIdentifier());
			}
			System.exit(-1);
		}
		File input = new File(args[0]);

		Unbrailler ub = new Unbrailler(args[1]);

		ub.run(input);
	}

	public void run(File inputFolder) {
		if (!inputFolder.isDirectory()) {
			throw new IllegalArgumentException("Input is not a directory: " + inputFolder);
		}

		File outputFolder = new File(inputFolder, "unbrailler");
		outputFolder.mkdirs();
		FilenameFilter ff = new FilenameFilter() {

			public boolean accept(File dir, String name) {
				return name.endsWith(".pef");
			}};
		for (File input : inputFolder.listFiles(ff)) {
			try {
				convert(input, outputFolder);
			} catch (Exception e) {// continue with next file
				e.printStackTrace();
			}
		}
	}
	
	public boolean convert(File input) {
		File outputFolder = new File(input.getParentFile(), "unbrailler");
		if (!outputFolder.isDirectory()) {
			outputFolder.mkdirs();
		}
		return convert(input, outputFolder);
	}

	public boolean convert(File input, File outputFolder) {
		if (!outputFolder.isDirectory()) {
			throw new IllegalArgumentException("Output folder is not a directory: " + outputFolder);
		}
		File output = new File(outputFolder, input.getName().substring(0, input.getName().length() - 4) + ".xml");
		try {
			XMLEventReader r = inFactory.createXMLEventReader(new FileInputStream(input));
			FileOutputStream os = new FileOutputStream(output);

			UnbrailleFilter f = new UnbrailleFilter(r, os, bc);
			f.setFiltering(true);
			f.filter();
			f.close();
			return true;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		} catch (XMLStreamException e) {
			e.printStackTrace();
			return false;
		}
	}

}

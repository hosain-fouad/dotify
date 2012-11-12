package org.daisy.dotify.formatter;

import org.daisy.dotify.formatter.FormattingTypes.BreakBefore;
import org.daisy.dotify.formatter.FormattingTypes.Keep;
/**
 * Provides a block of rows and the properties
 * associated with it.
 * @author Joel Håkansson
 */
public interface Block {

	/**
	 * Gets the number of empty rows that should precede the 
	 * rows in this block.
	 * @return returns the number of empty rows preceding the rows in this block
	 */
	public int getSpaceBefore();
	public int getSpaceAfter();
	public int getKeepWithNext();
	public String getIdentifier();
	public Keep getKeepType();
	public BreakBefore getBreakBeforeType();
	public BlockContentManager getBlockContentManager(CrossReferences refs);
	public String getBlockIdentifier();
	
	public int getKeepWithPreviousSheets();
	public int getKeepWithNextSheets();
	
}
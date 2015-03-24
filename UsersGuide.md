# Introduction #
Dotify is a braille translator written in Java.

# Running the Command Line UI #
To run the command line UI, download and extract the latest release of Dotify. If you do not have Java installed on your machine, you have to download and install that as well.

On the command line, navigate to the extracted folder and type: `java -jar dotify-cli.jar`. Press enter.

This will bring up the embedded help. The options are explained in detail below.

## Required Arguments ##
Dotify requires four arguments to run:
  * path to an input file
  * path to the output file
  * name of a formatting style
  * the target locale (i.e. language/region)

### Input File Requirements ###
The input file should, of course, be something that Dotify understands. Because Dotify has been developed for and funded by [Swedish Agency for Accessible Media, MTM](http://www.mtm.se), the current capabilities may seem odd to an average user. Dotify supports:
  * DTBook (with the exception of table and note elements)
  * XML
  * Plain text
  * OBFL

DTBook is the most developed input format, and it produces a result that meets MTM's braille standards.

The generic XML support is very basic. Dotify attempts to render the file without understanding the content, which is unlikely to produce a satisfactory result. However, the feature could be useful in some cases.

A plain text can also be used, with similar capabilities as for general XML, i.e. containing very limited formatting.

OBFL is the intermediary format used by Dotify, and is likely only of interest to developers.

### Output File Formats ###
The output format is determined by examining the extension of the specified output file name. Supported extensions are:
  * pef
  * txt
  * obfl

PEF is the main output format. Dotify produces high quality PEF-files.

Text produces a plain text file.

OBFL is the intermediary format used by Dotify, and is likely only of interest to developers.

### Formatting Style (setup) ###
The formatting style specifies some key properties of the finished product, such as row spacing, characters/line, rows/page and sheets/volume.

### Locale ###
The locale is very important, because it determines the fall-back language used for braille translation and hyphenation.

## Optional Arguments ##
The following optional arguments are available:
  * outputFormat
  * identifier
  * writeTempFiles
  * tempFilesDirectory
  * date
  * dateFormat
  * table

### outputFormat ###
If specified, the output format is determined by the value of this parameter, instead of from the file name extension.

### identifier ###
Sets the identifier in the output file (if supported).

### writeTempFiles ###
Set to true to write temp files.

### tempFilesDirectory ###
Sets the directory to write temp data. If not specified, the user default is used.

### date ###
Sets the date in the output file (if supported).

### dateFormat ###
Sets the date format to use when writing the current date in meta data (if supported). The syntax is as specified by [SimpleDateFormat](http://docs.oracle.com/javase/6/docs/api/java/text/SimpleDateFormat.html)

### table ###
If specified, an ASCII-braille file is generated in addition to the PEF-file (requires that the output format is PEF).

# Example Workflow #
  1. Markup using a format of choice
  1. Process format into PEF (with Dotify)
  1. Emboss using [Braille Utils](http://code.google.com/p/brailleutils/), [Easy Embossing Utility](http://code.google.com/p/easy-embossing-utility/), **Daisy Pipeline** or **CX for Word**
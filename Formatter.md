# Formatter #
## Description ##
The formatting step aims to produce formatted braille using the OBFL-file as its input.

## Techniques ##
Java, StAX, OBFL, Java SPI, OSGi

## Functionality and features ##
  * Implements most aspects of OBFL (including some experimental additions)
  * Design enables support for complex braille rules
  * Design enables support for different output formats
  * Extends the currently described specification for the evaluation language with features such as:
    * Converting numbers to text, e.g. 1 becomes “one”.
    * Formatting localized messages
    * Formatting dates

## Design ##
There are several places where translation has to be done while formatting. Therefore, the translation and hyphenation components are accessed from within the formatter.

![https://docs.google.com/drawings/d/1EivBBGtQBnX1TvCvyO8u3-TjpuwS6vNZ5HGDdlgUt6M/pub?w=1048&h=457&dummy=.jpg](https://docs.google.com/drawings/d/1EivBBGtQBnX1TvCvyO8u3-TjpuwS6vNZ5HGDdlgUt6M/pub?w=1048&h=457&dummy=.jpg)

## Limitations ##
Some parts of the code need work for maintenance reasons.
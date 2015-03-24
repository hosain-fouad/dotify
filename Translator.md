# Translator #
## Description ##
The translator component includes both translation and line breaking.

## Techniques ##
Java, Java SPI, OSGi

## Functionality and features ##
  * Design allows support for a variety of co-existing implementations besides Java, e.g. based on
    * JavaScript
    * Liblouis tables
  * Hyphenation component design allows support for non-standard hyphenation
  * Translation component design allows support for complex/specialized translation rules, e.g.
    * Swedish capitalization rules
    * use cases that are dependent on hyphenation/line breaking, such as number continuation sign and hyphenation point dependent translation
  * Marker processing component design allows support for:
    * complex contents and structure dependent braille markers
    * application filters (apply braille marker based on some criteria of the structure or contents)

## Design ##
Java API with factory. Implementations can register using SPI and/or OSGi. The component is responsible for:
  * translating
  * braille style marker processing
  * hyphenation
  * line breaking

The component is responsible for hyphenating and line breaking because doing so allows for special translation use cases that require knowledge about line breaking and hyphenation.

## Limitations ##
Currently, braille translation is implemented for Swedish only.
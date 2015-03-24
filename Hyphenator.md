# Hyphenator #
## Description ##
The default hyphenation implementation is based on Franklin Mark Liang's hyphenation algorithm as used in TeX and contains patterns for about 50 languages.

## Techniques ##
  * Java, Java SPI, OSGi
  * Franklin Mark Liang's hyphenation patterns

## Functionality and features ##
  * Supports hyphenation for about 50 languages
  * Widely used format for hyphenation description

## Design ##
Java API with factory. Implementations can register using SPI and/or OSGi.

## Limitations ##
Franklin Mark Liang's hyphenation algorithm does not support non-standard hyphenation.
# Introduction #
Dotify Braille Translation System is an open source Braille translator written in Java.  Dotify is designed for collaborative, open source braille software development. It is maintained by the [Swedish Agency for Accessible Media](http://www.mtm.se) and it is used daily.

Out of the box, only Swedish braille is supported. However, depending on your requirements, it may be quite simple to add support for another locale. In addition, if you only want to extract formatted text from an XML-document, you should give it a try, regardless of language (well, almost). Dotify supports hyphenation of over 50 languages.

# Project Objectives #
The main Dotify Objectives are:
  1. To provide an open source Braille translation system for Java
  1. To define components for Braille translation systems sharing and to provide a proof of concept implementation for these components
  1. To provide the functionality needed by participating organizations

# Why Develop for Dotify? #
Dotify delivers a unique set of abilities that, once combined, no other Braille production framework can offer today.

## Java Based ##
Dotify is a pure Java framework which makes it suitable for various applications including workstations, servers and embedded systems without changes to the code. Run on a server today and embed the same code in a device tomorrow.

## Designed for High-Volume, Automated Use ##
Dotify has been designed for high-volume, automated use from the very beginning, prioritizing reliability and error free output over a "best effort" approach typically utilized in end-user systems.

## Designed for High Quality Braille ##
Dotify does not compromise with braille quality in order to fit a set of predetermined design restrictions. If a feature is required for a locale, we aim to make it possible to implement. Dotify does not tell you what good Braille should be like.

## Open Source ##
Dotify is Open Source, this means that everyone has the right to use it and change it.

## Modular ##
Dotify aims at a modular design of functional units that can be replaced or integrated into other solutions individually. The core components are compatible with both OSGi and SPI environments.
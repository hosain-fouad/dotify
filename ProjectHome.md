**Project is moving to GitHub. Do not submit new issues here.**

# Dotify #
Dotify Braille Translation System is an open source Braille translator written in Java.  Dotify is designed for collaborative, open source braille software development. It is maintained by the [Swedish Agency for Accessible Media](http://www.mtm.se) and it is used daily.

## Features ##
Dotify delivers a unique set of abilities that, once combined, no other Braille production framework can offer today.

### Java Based ###
Dotify is a pure Java framework which makes it suitable for various applications including workstations, servers and embedded systems without changes to the code. Run on a server today and embed the same code in a device tomorrow.

### Designed for High-Volume, Automated Use ###
Dotify has been designed for high-volume, automated use from the very beginning, prioritizing reliability, speed and error free output over a "best effort" approach typically utilized in end-user systems.

### Designed for High Quality Braille ###
Dotify does not compromise with braille quality in order to fit a set of predetermined design restrictions. If a feature is required for a locale, we aim to make it possible to implement. Dotify does not tell you what good Braille should be like.

### Open Source ###
Dotify is Open Source, this means that everyone has the right to use it and change it.

### Modular ###
Dotify aims at a modular design of functional units that can be replaced or integrated into other solutions individually. The core components are compatible with both OSGi and SPI environments.


## Performance ##
Less than 10 seconds/book or 70 braille pages/second (based on a selection of novels) utilizing a single core of a modern PC (including JVM startup). This value could be reduced significantly by reusing the JVM for consecutive conversions and by utilizing more than one core.

## Limitations ##
Out of the box, only Swedish braille is supported. However, depending on your requirements, it may be quite simple to add support for another locale. In addition, if you only want to extract formatted text from an XML-document, you could give it a try, regardless of language (well, almost). Dotify supports hyphenation of over 50 languages.

## System requirements ##
Java 1.6 or later

## Download ##
[Click here to visit the download page](http://pef-format.org/?page_id=157) (hosted by pef-format.org).
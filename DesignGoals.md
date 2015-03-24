# Design #
## Main technology ##
Java 1.6 or later

## Additional technologies ##
Java SPI, StAX, OSGi, XSLT, Schematron, Relax NG

Building and testing: JUnit, Ant, SVN

## Design Goals ##
### Reliable ###
As Dotify is intended for high-volume, automated use, reliability and an error free output should be key aspects in any design choice. For example, loss of text or debug messages in the braille output are of course unacceptable.

### Modular ###
One design goal of Dotify is to establish a more [modular approach](Components.md) to Braille translation and formatting.

### Server friendly ###
As multi core hardware is becoming commonplace it is desired to aim for thread safe implementations and use shared resources efficiently. In addition, the lifespan of objects should be carefully considered in order to avoid problems when running for an extended period of time.

### Correct braille ###
Anyone can make a braille system that gets 80% of a braille translation right.
That's why one important design goal for Dotify is allowing braille to be as complex as it is. There will always be a limit to what can be implemented, but it shouldn't be by design.
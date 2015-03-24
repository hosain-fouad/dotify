# Source format interpreter #
## Description ##
As the name suggests, the source format interpreter acts as an interpreter between the source format and the formatter, so that the formatter can understand how to perform the layout.

## Techniques ##
Java, StAX, XSLT, OBFL, Schematron, RelaxNG

## Functionality and features ##
  * Configurable parameters
    * page dimensions
    * inner and outer margins
    * row spacing
    * maximum volume size
    * duplex/simplex
  * Configuration presets (a group of configurable parameters)
  * Localization of texts added in this step, e.g. “caption”, “table of contents”, “image description”. The localizations can include variable data, such as volume number, page number etc, e.g. “volume 1”, “volume three”
  * Handling of all dtbook elements except elements in the note and table categories
## Design ##
This component is designed to accept any file format and to delegate to different implementations depending on type. Typically, each format requires a completely different implementation.

![https://docs.google.com/drawings/d/1u4GGmxszKkIZySu1Fw4lIWGn_jMbAYt6cdQk0u4mgME/pub?w=814&h=592&dummy=.jpg](https://docs.google.com/drawings/d/1u4GGmxszKkIZySu1Fw4lIWGn_jMbAYt6cdQk0u4mgME/pub?w=814&h=592&dummy=.jpg)

### XML processing ###
The XML-component can handle any XML-based format if an XSLT-transformation and a validation (optional) is provided for it. Two things determine which implementation to run on the input:
  * The root element and namespace (if available)
  * The selected template option

Although a generic XML transform can be applied if no implementation is found, the root element and namespace should be considered mandatory, as they are required to interpret the contents in a non trivial manner. The template option is provided to support implementations for the same format that are profoundly different and cannot be expressed using parameters (e.g. page width, page height, etc).
## Limitations ##
A single file is required as input.
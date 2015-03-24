# Processing steps #
The processing process in Dotify has over time evolved to a much simpler structure than we initially thought necessary.

![https://docs.google.com/drawings/d/1HduCLj3bXulcgdDwWaHuAM4Pfx0SM4V91JtZ9xXq2HQ/pub?w=1014&h=468&dummy=.jpg](https://docs.google.com/drawings/d/1HduCLj3bXulcgdDwWaHuAM4Pfx0SM4V91JtZ9xXq2HQ/pub?w=1014&h=468&dummy=.jpg)

## Preprocessing ##
The preprocessing steps aim to interpret the input format so that the Dotify formatter can understand it.

First, the type of input is determined. Once the appropriate handler has been selected, it will proceed by validating the input to ensure that it is correct. After that, the input is interpreted by the handler and expressed as [OBFL](http://code.google.com/p/obfl/) (format conversion).

![https://docs.google.com/drawings/d/1u4GGmxszKkIZySu1Fw4lIWGn_jMbAYt6cdQk0u4mgME/pub?w=814&h=592&dummy=.jpg](https://docs.google.com/drawings/d/1u4GGmxszKkIZySu1Fw4lIWGn_jMbAYt6cdQk0u4mgME/pub?w=814&h=592&dummy=.jpg)

The image above depicts the currently implemented preprocessing conversions, including OBFL, DTBook, any XML and text.

## Formatting ##
The formatting step aims to produce formatted braille using the OBFL-file as its input. Since there are several places where translation has to be done while formatting, the translation and hyphenation components are accessed from within the formatter. Even so, they are firmly separated from the formatting logic.

![https://docs.google.com/drawings/d/1EivBBGtQBnX1TvCvyO8u3-TjpuwS6vNZ5HGDdlgUt6M/pub?w=1048&h=457&dummy=.jpg](https://docs.google.com/drawings/d/1EivBBGtQBnX1TvCvyO8u3-TjpuwS6vNZ5HGDdlgUt6M/pub?w=1048&h=457&dummy=.jpg)

### Translation ###
Currently, braille translation is implemented for Swedish only. It should be possible to implement support for other languages by adding support for Liblouis translation tables.

### Hyphenation ###
The default hyphenation implementation is based on Franklin Mark Liang's hyphenation algorithm as used in TeX and contains patterns for about 50 languages.

## Post processing ##
The post processing step has been reduced to simply validate the output produced (if possible) and optionally perform conversion into additional formats. In the case of PEF, the result can, for example, be transformed into a typical ASCII-braille file, if desired.

![https://docs.google.com/drawings/d/1ScJRJP701i2Gpe5XsJ4HqEpuU6EUs8KHx6Vo7NX6kc0/pub?w=713&h=432&dummy=.jpg](https://docs.google.com/drawings/d/1ScJRJP701i2Gpe5XsJ4HqEpuU6EUs8KHx6Vo7NX6kc0/pub?w=713&h=432&dummy=.jpg)
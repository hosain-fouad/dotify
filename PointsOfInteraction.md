# Points of interaction #

## OBFL ##
As described in DotifyHistory, we have adopted an approach similar to XSL-FO for print formatting, using a specific language for Braille formatting rather than an xml+stylesheet approach. This has the advantage of being very flexible and streamlined to the task at hand. The possible downside is that it is perhaps more difficult to understand for non-developers than xml+stylesheet. However, an xml+stylesheet approach can always be appended to a formatting language implementation as a pre-processing step, if needed.

The format is called "Open Braille Formatting Language" (OBFL). For more information, see the [Google Code project for OBFL](http://code.google.com/p/obfl/)

## PEF ##
We have used PEF as the output format, since it was designed for that purpose.

## Translation/Hyphenation ##
Perhaps the most interesting parts to interchange are the translation algorithms.

Our aim is to create an interface flexible enough to be able to benefit from existing translations in Dotify (and the other way around). One possible model for communication is using web services.

## Other points of interaction ##
In addition, there are several possible file types that can be shared between implementations. These, and all the points of interaction described above, have been included in the drawing below.

![https://docs.google.com/drawings/pub?id=1QUPWdUXNLnNuCbQ8kDpPdSFhcR8j2LYvalFYHrcRwIw&w=960&h=720&nonsense=image.png](https://docs.google.com/drawings/pub?id=1QUPWdUXNLnNuCbQ8kDpPdSFhcR8j2LYvalFYHrcRwIw&w=960&h=720&nonsense=image.png)
# OBFL #
## Description ##
OBFL is the format used in Dotify to describe the layout of a document. It is included here as a component in order to isolate the functionality of the format from the other components; thereby avoiding duplicate feature descriptions.
## Techniques ##
XML, DTD
## Functionality and features ##
OBFL provides a braille formatting language. A change in locale or hyphenation policy (hyphenate or not) can be specified at any level.

The main features of this component is described in the following sections.
### Blocks ###
A block of text can have the following properties:
  * first line indent, text indent
  * page control
    * break before page
    * keep all/none
    * keep with a number of following lines
  * volume control
    * keep this block away from a volume boundary with a specified number of sheets (forward and backward)
  * lists
    * unordered
    * ordered (decimal)
    * preformatted
  * positioning
    * text alignment (left, center, right)
    * vertical position and alignment (before, center, after)
  * borders
  * margins
  * row spacing
A block can have the following content:
  * Text
  * Leaders
    * align (left, center, right)
    * fill pattern
    * position
  * Markers
  * Line breaks
  * Page number references (decimal, roman, upper-roman, lower-roman, upper-alpha, lower-alpha)
  * Evaluation
  * Span (a piece of text that is in a different language or has another hyphenation policy compared to the surrounding text)
  * Style (a named style that affects the appearance of braille, e.g. emphasis, bold, etc)
### Page templates ###
  * Section properties
    * duplex/simplex
    * margins
    * borders (individually controllable)
    * page dimensions
    * row spacing
  * Header/footer
    * marker references
    * fixed text
    * current page number
    * expression evaluation

### Markers and marker references ###
Markers and marker references are used together to provide e.g. running headers.
Markers occur in the text flow as hidden elements. They belong to a named group and each carry a specified value, but they do not show up in the resulting document directly. Instead, a marker reference will insert text where it is placed based on the value of the closest marker that matches the conditions given by the marker reference.

### Volume template ###
A volume template can be used to specify contents that should precede or follow the text body of a volume. This is useful for e.g. cover pages, table of contents, etc.

  * The volume template can be applied based on a condition
  * It is required to specify the maximum number of sheets allowed in a volume using the template

### Table of contents ###
The support for table of contents in OBFL is quite extensive.

It supports multiple data sets, meaning that more than one list of entries can be defined and later used in different contexts. For example: suppose that a TOC that includes only the top level headings is desired for the first braille volume and that a TOC that includes all headings is desired in the other braille volumes (but probably only the entries that are present in the volume in question). This can be accomplished in OBFL by defining two entry lists, one containing all headings, and one containing only the top level headings.

It supports selection of the entire set or only entries found in the current volume. For example, this is useful in the case described above where only the first volume should contain headings from the entire document and the other volumes should contain headings from the current volume.

It supports inserting additional text into the TOC at various places. Typically a TOC is preceded by some content, such as a heading (“Table of Contents”). In braille, this can also be useful to insert a text between volumes (if the full document scope is specified), e.g. allowing a heading for each group of entries collected from the same volume.

### OBFL Evaluation Language ###
The OBFL Evaluation Language provides basic logic and comparison functionality and is used for two distinct purposes:
To choose items that depend on some context, e.g. templates
To render dynamic content, i.e. the result of a computation

## Design ##
Originally modelled as a text-only subset of XSL-FO, but over time features exclusive to braille formatting have been included, such as volume templates and table of contents support. The aim is to be agnostic about braille, yet support all requirements of braille book formatting. In addition, OBFL aims to be declarative, like XSL-FO.

## Limitations ##
DTD lacks expressiveness that would be useful when enforcing the intent of the format.
Currently, no explicit support for tables or footnotes. However, not all possible renderings of these concepts require specialized support.
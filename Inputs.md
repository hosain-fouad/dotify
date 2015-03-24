# Input formats #
## DTBook ##
DTBook is currently the main input format.
## OBFL ##
OBFL is the format used in Dotify to express the formatting.
## XML ##
Rudimentary support for any well-formed XML is implemented using a heuristic block detection: elements that contain text (but don’t have ancestors that do) are considered blocks (paragraphs). All other elements are ignored, but text content is always preserved.
## Plain text ##
Support for plain text is implemented by looking for new line characters (CR/LF). The output is designed to mimic the layout of the input, but with hyphenation, translation and pagination applied to it.
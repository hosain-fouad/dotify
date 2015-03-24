# Repository Layout #
The code is organized in these sub-projects:
  * [Dotify](DotifyAssembly.md)
  * DotifyDevtools
  * [DotifyDevtoolsGUI](DotifyDevtoolsGUI.md)
  * DotifyShared
  * DotifyTranslator
  * EpubTools

The most important being [Dotify](DotifyAssembly.md), DotifyTranslator and DotifyShared.

## OSGi compatible projects ##
A number of projects have been created for the transition to an OSGi compatible structure. Code has been moved from other locations and the build scripts in the original locations have been updated to collect code from the new locations in order to maintain the build of the original jar-files.

The OSGi compatible projects are:
  * [dotify.api](DotifyAPI.md)
  * [dotify.common](DotifyCommon.md)
  * [dotify.devtools.gui](DotifyOsgiDevtools.md)
  * [dotify.formatter.impl](DotifyFormatterImpl.md)
  * [dotify.hyphenator.impl](DotifyHyphenatorImpl.md)
  * [dotify.text.impl](DotifyTextImpl.md)
  * [dotify.translator.impl](DotifyTranslatorImpl.md)

## Encoding ##
All code is encoded in UTF-8. This is particularly important in translation for two reasons:
  1. different languages require different sets of characters
  1. Unicode braille patterns are used to represent braille
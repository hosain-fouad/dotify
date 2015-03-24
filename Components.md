# Introduction #
We have tried to identify possible points of implementation interchange by looking at the overall process involved when creating a Braille document.

# Classic work-flow #
In a classic braille work-flow, documents are created, edited and embossed in a Braille editor. This work-flow is fine for personal use, but it is inefficient for large scale production where several products might be created from the same source.

![https://docs.google.com/drawings/d/1OujUaDDdmyntxvpitcBL_Fel98ARItqZGmjH_76OnE8/pub?w=1284&h=511&nonsense=image.png](https://docs.google.com/drawings/d/1OujUaDDdmyntxvpitcBL_Fel98ARItqZGmjH_76OnE8/pub?w=1284&h=511&nonsense=image.png)

# Modular work-flow #
In a modular work-flow, each module is focused on a specific task. Dotify is designed with this work-flow in mind. However, Dotify does not extend to all these components, and that is part of the point: _it shouldn't!_

![https://docs.google.com/drawings/d/1oXfr8_f0lKkomut69qySAMKKkf35cofmwXPWBH9PZSA/pub?w=1670&h=528&nonsense=image.png](https://docs.google.com/drawings/d/1oXfr8_f0lKkomut69qySAMKKkf35cofmwXPWBH9PZSA/pub?w=1670&h=528&nonsense=image.png)

## Scope of Dotify ##
The scope of Dotify includes the following top level components:
  1. [Source format interpreter](SourceFormatInterpreter.md)
  1. [Formatter](Formatter.md)
  1. [Translator](Translator.md)
  1. [Hyphenator](Hyphenator.md)

The image below shows the relevant components in isolation.

![https://docs.google.com/drawings/d/1HduCLj3bXulcgdDwWaHuAM4Pfx0SM4V91JtZ9xXq2HQ/pub?w=1014&h=468&dummy=.jpg](https://docs.google.com/drawings/d/1HduCLj3bXulcgdDwWaHuAM4Pfx0SM4V91JtZ9xXq2HQ/pub?w=1014&h=468&dummy=.jpg)

### OBFL ###
[OBFL](OBFL.md) also plays an important role in Dotify as it acts as a reference implementation for OBFL, but they are otherwise independent. Describing OBFL here helps avoid duplication when describing the other components.




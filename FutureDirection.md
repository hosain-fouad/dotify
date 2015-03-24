# Introduction #
Dotify has reached a point where it can be used reliably for daily production of most simple books. Yet, it still lacks support for some commonly used constructs such as tables, footnotes and mathematics. In addition, the context in which Dotify was born - the Daisy Pipeline - has since been rebuilt from scratch based on new technologies such as OSGi and XProc. Furthermore, the accomplishments of the Liblouis-project and the Braille modules of DP2 cannot, and should not, be ignored.

# Areas of interest #
## Integrating with Daisy Pipeline 2 ##
Dotify has a history with Daisy Pipeline. It was born there. And new versions of Dotify are still added to the Daisy Pipeline project. However, the original Daisy Pipeline has been superseded by a new version, which is largely incompatible with the old one. Therefore, some work must be done to integrate Dotify with Daisy Pipeline 2.

For the time being, this has to be accomplished without breaking compatibility with the original Daisy Pipeline. That means:
  * remaining compatible with a non-OSGi environment, e.g. discovery via the Java SPI
  * keeping dependencies compatible

The image below shows an outline of possible integrations between Dotify and Daisy Pipeline 2.

![https://docs.google.com/drawings/d/1Z5E7UU5T3UfmenNyv10m_yfEbPss2KvrRpYSNvMHiwc/pub?w=1657&h=773&dummy=.jpg](https://docs.google.com/drawings/d/1Z5E7UU5T3UfmenNyv10m_yfEbPss2KvrRpYSNvMHiwc/pub?w=1657&h=773&dummy=.jpg)

## Extending the feature set ##
An obvious direction for future releases of Dotify is to implement support for all constructs needed in the representation of books in braille. This includes:
  * tables
  * footnotes `[Done]`
  * mathematics

Support for other input formats, such as EPub3, is also part of the probable future for Dotify.

## Updating the platform ##
In order to continue to evolve and grow, the platform on which Dotify is built needs to be updated. The most pressing matters involve:
  * Reevaluating the boundary and contents of all APIs `[Done]`
  * Removing dependency on org.daisy.util `[In progress]`
  * Removing the compatibility requirement towards Daisy Pipeline 1 `[In progress]`
  * Isolate the use of Java SPI and establish an OSGi compatible solution `[Done]`

In order to be relevant to other organizations in the Daisy community, compatibility with the Daisy Pipeline 2 should be established. This would involve the following:
  * Evaluate the use of a standardized framework for task execution within Dotify
  * Support the use of Dotify formatter in an OSGi context `[Done]`
  * Support the use of all Dotify components in an OSGi context
  * Maintain the option to use Dotify separate from Daisy Pipeline 2

As part of the platform update, a review of the developer environment is needed. In particular, a dependency management solution will be needed for fine grained modularization and the build technology should be updated to Gradle. [Migration to Git](MoveToGit.md) is also planned.

## Integration and interchange ##
  * Add support for Liblouis translation tables
  * Add support for Open Office extended hyphenation patterns (non-standard hyphenation)
  * Add support for [Braille CSS](http://code.google.com/p/daisy-pipeline/wiki/BrailleCSSProperties)
  * Maintain and improve support for consuming PEF-files in Braille Utils and Easy Embossing Utility
  * Improve the use of Dotify in a fully automatic setting

### Liblouis translation tables ###
By implementing support for the Liblouis table format in Java, Dotify users can enjoy support for all the languages developed in Liblouis over the years while remaining technically coherent and highly portable.

**Why not use the existing implementation?**

Writing an additional implementation for the Liblouis translation tables strengthens the format and highlights potential problematic areas. This will give implementors a better basis for adding, improving and maintaining the tables and braille readers will get better braille with fewer errors.

Dotify can be integrated with environments that use a multitude of technologies, both on the application level as well on the operating system level. Adding additional technologies to a project is inherently problematic and will eventually cause maintenance issues to some degree. By creating and using an intermediary interface (a specification), investments made in implementations as well as in translation definitions can be better secured.
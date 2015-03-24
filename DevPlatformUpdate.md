# Background #
Several unresolved issues comes from the fact that Dotify is used in Daisy Pipeline 1. DP1 isn't compatible with current software development practices and any updates towards that end are unlikely as the project is nearing its end of life. In addition, a major platform update is currently in progress at MTM (the maintainer of this project), including moving to GIT (from SVN) and Gradle (from Ant).

# Problem #
Moving from SVN to GIT is not trivial, despite what GIT groupies tell you. And, let's face it, GIT does not play well with checked-in dependencies. Therefore, a clean break without history is desired, but as long as the dependencies are still there, it makes less sense to make the switch. One could always argue that the process can be repeated later, throwing away the first couple of months of history in GIT, but doing that is actually even worse, since yet another source is required to do  historical research (to the extent that is needed).

This means that moving to GIT implies solving the dependency management first. This in turn implies that the bundles created for OSGi compatibility should be used in the new (dependency managed) builds. This implies that either:
  * the DP1 class path has to be updated in order to make use of these new bundles **OR**
  * a new compound build has to be created specifically for DP1.

Non of these options seem very attractive.

# Plan #
In order to maintain support for DP1 while cutting off the environmental dependency completely, there is really only one feasible option: to call Dotify in a separate process from DP1. This solution has already been discussed with the maintainer of DP1, but voted against because the solution included additional checked-in dependencies in DP1! However, if Dotify isn't distributed with DP1 at all, that argument is void. Hence, Dotify could be an optional installed application, comparable to other third party software used by DP1, such as ImageMagick. In this scenario, the Dotify CLI is called in a separate process within DP1 using a path configured by the user. While this will reduce the usability somewhat, it should be acceptable due to the locked in situation that this requirement has brought on us.

Once this issue has been addressed, we are free to do any changes needed to move forward!

Subsequent task:
  1. Create Gradle script to build all OSGi modules using external dependencies
  1. Update the CLI build to Gradle and use the new jar structure (but perhaps not the OSGi bundle versions)
  1. Find another source (e.g. the DP1 repo it self) for the remaining DP1 jars used in the CLI environment
  1. Delete all checked-in dependencies
  1. Migrate to GIT
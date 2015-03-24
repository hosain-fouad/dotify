# Migrate to Git #
Outlines steps to take when migrating from SVN to Git. Two-way sync is not considered.

## Make a plan ##
Things to consider before migrating.

### Should history be preserved? ###
Preserving history is a good idea if you want to replace the SVN repo with a Git repo, but since every Git clone has to carry the full history, it may become a problem in some situations. In addition, accurately converting the full history of an SVN repo into GIT can be very difficult.

If history should be removed, also check for big files that can be removed from the codebase beforehand, such as third-party jar files.

### Should svn metadata be preserved? ###
SVN metadata is useful if you preserve history and retain the possibility to access the SVN repo, as is the case with Google code. However, if the SVN repo is closed down, this information will probably not be useful for anything.

### Which Git repos should be created? ###
Should the SVN repo be split into smaller parts? For Google code projects, there are typically at least two parts that should be separated into separate Git repos: code and wiki.

### Should some changes be made to author info? ###
Make a list of authors and decide if modifications are needed for some reason.

### Work currently in progress ###
Check your workspaces for things that can should be checked in beforehand.


## SVN to Git checklist ##
After migrating, answer these questions:
  * Is everything there?
  * Are authors converted as desired?
  * Are svnignore files properly converted into gitignore?
  * Have empty folders been preserved?
  * Have branches and tags been properly converted (specifically reintegrated and partial branches)?
  * Has the history been preserved/removed?
  * Has SVN metadata been preserved/removed?
  * Is the scope of each Git repo correct?
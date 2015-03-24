# Building and Running #

## Building the Project ##
The distribution is built by running "build.xml" with Ant. "build.xml" can also generate Javadoc and run unit tests. All files related to this process should be placed in the "ant-build" folder. Files created as a result of running "build.xml" should be placed in "ant-build/output" and should not be added to the repository.

### Building OSGi bundles ###
OSGi bundles are currently built using Bndtools in Eclipse. While a standalone build is desired, it is not yet available. While the bundles are compatible with a non-OSGi environment, the original Daisy Pipeline has an extensive class-path as it is. Therefore, the original jar division must be retained for that environment.

All of this adds a level of complexity to the build process and completely separates the automated build from the workspace build, which is not ideal, but it is necessary for the reasons stated above.

## Testing ##
Unit tests can performed by running "build.xml" with Ant.

## Committing code ##
If applicable, add unit tests to verify your changes and make sure that all unit tests pass before committing code to the project. Also, remember to enter a descriptive commit comment, describing the key aspects of your work.
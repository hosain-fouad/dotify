# Version Numbering #
Version numbers must be updated whenever changes to the code are published or deployed (updated in other projects).

Future versioning aims to be compatible with OSGi versioning, see [Semantic Versioning](http://www.osgi.org/wiki/uploads/Links/SemanticVersioning.pdf) or http://semver.org/. In summary:

## When to change the major segment ##
The major segment should change when the API changes such that consumers of the API must update their code.

## When to change the minor segment ##
The minor segment should change when the API changes such that only implementers of the API must update their code. E.g. when additional features have been added.

## When to change the service segment ##
The service segment should change when no changes to the API have taken place. E.g. when bugs are fixed (that do not change the API).
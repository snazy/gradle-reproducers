
Illustrates that dependency substitution for projects using the "shadow" plugin does not work.

The `iceberg-bundled-guava` artifact (think: on Maven Central) contains relocated Guava classes.

The dependency to `iceberg-bundled-guava` from the included build however does not "export" the
relocated Guava classes.

In this case, the included project `iceberg-bundled-guava` is semantically different.

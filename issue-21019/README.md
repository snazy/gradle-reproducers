

1. Run `setup.sh` (just a `git clone`)
2. Run `./gradlew :iceberg:iceberg-nessie:dependencies --configuration runtimeClasspath`
   --> OK
3. Run `./gradlew dependencies --configuration runtimeClasspath`
   --> Dependency resolution fails!
   ```
   ./gradlew dependencies --configuration runtimeClasspath
   Starting a Gradle Daemon, 6 stopped Daemons could not be reused, use --status for details
   Configuration on demand is an incubating feature.
   
   > Task :dependencies
   
   ------------------------------------------------------------
   Root project 'issue-21019'
   ------------------------------------------------------------
   
   runtimeClasspath - Runtime classpath of source set 'main'.
   \--- org.apache.iceberg:iceberg-nessie -> project :iceberg:iceberg-nessie
        +--- project :iceberg:iceberg-api
        |    +--- org.slf4j:slf4j-api FAILED
        |    +--- com.github.stephenc.findbugs:findbugs-annotations FAILED
        |    \--- project :iceberg:iceberg-bundled-guava
        +--- org.slf4j:slf4j-api FAILED
        +--- com.github.stephenc.findbugs:findbugs-annotations FAILED
        +--- project :iceberg:iceberg-common
        |    +--- org.slf4j:slf4j-api FAILED
        |    +--- com.github.stephenc.findbugs:findbugs-annotations FAILED
        |    \--- project :iceberg:iceberg-bundled-guava
        +--- project :iceberg:iceberg-core
        |    +--- project :iceberg:iceberg-api (*)
        |    +--- org.slf4j:slf4j-api FAILED
        |    +--- com.github.stephenc.findbugs:findbugs-annotations FAILED
        |    +--- project :iceberg:iceberg-common (*)
        |    +--- project :iceberg:iceberg-bundled-guava
        |    +--- org.apache.avro:avro FAILED
        |    +--- io.airlift:aircompressor FAILED
        |    +--- org.apache.httpcomponents.client5:httpclient5 FAILED
        |    +--- com.fasterxml.jackson.core:jackson-databind FAILED
        |    +--- com.fasterxml.jackson.core:jackson-core FAILED
        |    +--- com.github.ben-manes.caffeine:caffeine FAILED
        |    \--- org.roaringbitmap:RoaringBitmap FAILED
        +--- project :iceberg:iceberg-bundled-guava
        +--- org.projectnessie:nessie-client FAILED
        +--- com.fasterxml.jackson.core:jackson-databind FAILED
        \--- com.fasterxml.jackson.core:jackson-core FAILED
   
   (*) - dependencies omitted (listed previously)
   
   A web-based, searchable dependency report is available by adding the --scan option.
   ```

There are two files to be analysed here:

### [bom.jbom.json](bom.jbom.json)

> jbom v1.2.1

It is generated using [jbom](https://github.com/eclipse/jbom). I suspended
Main's thread for some time and then I ran jbom on it. It successfully
detects the presence of spoon-core and its dependcies.

### [trace.json](trace.json)

> GraalVM 22.3.0 for Java 11

It is generated using [GraalVM trace agent](https://www.graalvm.org/22.0/reference-manual/native-image/Agent/).
Steps followed:

1. Compiled the code.

```sh
$JAVA_HOME/bin/javac Main.java
```

2. Collected trace.
```sh
$JAVA_HOME/bin/java -agentlib:native-image-agent=trace-output=trace.json Main
```

The trace does contain invocations in the spoon library.

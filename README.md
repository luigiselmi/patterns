Java Design Patterns
====================
Object-Oriented Design Patterns in Java: behavioral, structural and creational.

This project contains almost all the GoF patterns written in Java.

### Compile the Java code
From the project root create the target folder and its sub-folder classes that will contain the compiled classes

```
$ mkdir -p target/classes
```

Compile the Java code using the command

```
$ javac -d target/classes $(find src/main/java -name '*.java')
```

### Run the Java code
To execute the patterns run a command like in the example for the Singleton pattern

```
$ java -cp "target/classes" patterns.creational.singleton.WeddingManager
```

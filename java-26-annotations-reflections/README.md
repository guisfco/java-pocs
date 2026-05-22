# Java 26 Annotations and Reflection POC

This POC explores the power of Java Annotations and the Reflection API. It demonstrates how to create custom annotations, scan classes at runtime to discover annotated methods, and execute them dynamically. It includes a simplified routing system implementation inspired by modern web frameworks.

## Topics

- [Custom Annotation Definition (GetMapping)](https://github.com/guisfco/java-pocs/blob/main/java-26-annotations-reflections/src/main/java/com/guisfco/GetMapping.java#L8)
- [Marker Annotation Definition (SpecialAnnotation)](https://github.com/guisfco/java-pocs/blob/main/java-26-annotations-reflections/src/main/java/com/guisfco/SpecialAnnotation.java#L8)
- [Processing Annotations at Runtime](https://github.com/guisfco/java-pocs/blob/main/java-26-annotations-reflections/src/main/java/com/guisfco/Router.java#L17)
- [Dynamic Method Invocation](https://github.com/guisfco/java-pocs/blob/main/java-26-annotations-reflections/src/main/java/com/guisfco/Router.java#L33)
- [Annotated Record Methods](https://github.com/guisfco/java-pocs/blob/main/java-26-annotations-reflections/src/main/java/com/guisfco/User.java#L5)
- [Practical Example: Controller Routes](https://github.com/guisfco/java-pocs/blob/main/java-26-annotations-reflections/src/main/java/com/guisfco/ControllerExample.java#L7)
- [Manual Annotation Discovery and Invocation](https://github.com/guisfco/java-pocs/blob/main/java-26-annotations-reflections/src/main/java/com/guisfco/Main.java#L11)

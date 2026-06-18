# Java 26 GoF Design Patterns POC

This POC provides a comprehensive collection of Gang of Four (GoF) Design Patterns implemented in Java. It serves as a practical reference for understanding and applying these foundational architectural patterns in modern Java development.

## Patterns Covered

### Creational Patterns
These patterns deal with object creation mechanisms, trying to create objects in a manner suitable to the situation.

- [Abstract Factory](https://github.com/guisfco/java-pocs/tree/main/java-26-gof-design-patterns/src/main/java/com/guisfco/creational/abstractfactory): Provide an interface for creating families of related or dependent objects without specifying their concrete classes.
- [Builder](https://github.com/guisfco/java-pocs/tree/main/java-26-gof-design-patterns/src/main/java/com/guisfco/creational/builder): Separate the construction of a complex object from its representation so that the same construction process can create different representations.
- [Factory Method](https://github.com/guisfco/java-pocs/tree/main/java-26-gof-design-patterns/src/main/java/com/guisfco/creational/factorymethod): Define an interface for creating an object, but let subclasses decide which class to instantiate.
- [Prototype](https://github.com/guisfco/java-pocs/tree/main/java-26-gof-design-patterns/src/main/java/com/guisfco/creational/prototype): Specify the kinds of objects to create using a prototypical instance, and create new objects by copying this prototype.
- [Singleton](https://github.com/guisfco/java-pocs/tree/main/java-26-gof-design-patterns/src/main/java/com/guisfco/creational/singleton): Ensure a class only has one instance, and provide a global point of access to it.

### Structural Patterns
These patterns deal with object composition, or the manner in which classes and objects are combined to form larger structures.

- [Adapter](https://github.com/guisfco/java-pocs/tree/main/java-26-gof-design-patterns/src/main/java/com/guisfco/structural/adapter): Convert the interface of a class into another interface clients expect.
- [Bridge](https://github.com/guisfco/java-pocs/tree/main/java-26-gof-design-patterns/src/main/java/com/guisfco/structural/bridge): Decouple an abstraction from its implementation so that the two can vary independently.
- [Composite](https://github.com/guisfco/java-pocs/tree/main/java-26-gof-design-patterns/src/main/java/com/guisfco/structural/composite): Compose objects into tree structures to represent part-whole hierarchies.
- [Decorator](https://github.com/guisfco/java-pocs/tree/main/java-26-gof-design-patterns/src/main/java/com/guisfco/structural/decorator): Attach additional responsibilities to an object dynamically.
- [Facade](https://github.com/guisfco/java-pocs/tree/main/java-26-gof-design-patterns/src/main/java/com/guisfco/structural/facade): Provide a unified interface to a set of interfaces in a subsystem.
- [Flyweight](https://github.com/guisfco/java-pocs/tree/main/java-26-gof-design-patterns/src/main/java/com/guisfco/structural/flyweight): Use sharing to support large numbers of fine-grained objects efficiently.
- [Proxy](https://github.com/guisfco/java-pocs/tree/main/java-26-gof-design-patterns/src/main/java/com/guisfco/structural/proxy): Provide a surrogate or placeholder for another object to control access to it.

### Behavioral Patterns
These patterns are specifically concerned with communication between objects.

- [Command](https://github.com/guisfco/java-pocs/tree/main/java-26-gof-design-patterns/src/main/java/com/guisfco/behavioral/command): Encapsulate a request as an object, thereby letting you parameterize clients with different requests.
- [Mediator](https://github.com/guisfco/java-pocs/tree/main/java-26-gof-design-patterns/src/main/java/com/guisfco/behavioral/mediator): Define an object that encapsulates how a set of objects interact.
- [Memento](https://github.com/guisfco/java-pocs/tree/main/java-26-gof-design-patterns/src/main/java/com/guisfco/behavioral/memento): Without violating encapsulation, capture and externalize an object's internal state so that the object can be restored to this state later.
- [Observer](https://github.com/guisfco/java-pocs/tree/main/java-26-gof-design-patterns/src/main/java/com/guisfco/behavioral/observer): Define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.
- [State](https://github.com/guisfco/java-pocs/tree/main/java-26-gof-design-patterns/src/main/java/com/guisfco/behavioral/state): Allow an object to alter its behavior when its internal state changes.
- [Strategy](https://github.com/guisfco/java-pocs/tree/main/java-26-gof-design-patterns/src/main/java/com/guisfco/behavioral/strategy): Define a family of algorithms, encapsulate each one, and make them interchangeable.
- [Template Method](https://github.com/guisfco/java-pocs/tree/main/java-26-gof-design-patterns/src/main/java/com/guisfco/behavioral/templatemethod): Define the skeleton of an algorithm in an operation, deferring some steps to subclasses.

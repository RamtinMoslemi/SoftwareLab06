# SoftwareLab06

1. GoF Patterns can be divided into three separate categories:

    **Creational Patterns**: Deal with initializing and configuring classes and objects. Creational design patterns abstract the instantiation process. They help make a system independent of how its objects are created, composed, and represented. A class creational pattern uses inheritance to vary the class that's instantiated, whereas an object creational pattern will delegate instantiation to another object.

    **Structural Patterns**: Deal with decoupling interface and implementation of classes and objects. Structural patterns are concerned with how classes and objects are composed to form larger structures. Structural class patterns use inheritance to compose interfaces or implementations.

    **Behavioral Patterns**: Deal with dynamic interactions among societies of classes and objects. Behavioral patterns are concerned with algorithms and the assignment of responsibilities between objects. Behavioral patterns describe not just patterns of objects or classes but also the patterns of communication between them. These patterns characterize complex control flow that's difficult to follow at run-time. They shift your focus away from flow of control to let you concentratejust on the way objects are interconnected.

We can classify the 23 GoF patterns based on their purpose and scope as:
| Purpose | Class Scope | Object Scope |
| :-----: | :---------: | :----------: |
| **Creational** | Factory Method | Abstract Factory, Builder, Prototype, Singleton | 
| **Structural** | Adapter (class) | Adapter (object), Bridge, Composite, Decorator, Facade, Flyweight, Proxy|
| **Behavioral** | Interpreter, Template Method | Chain of Resposibility, Command, Iterator, Mediator, Memento, Observer, State, Strategy, Visitor |

2. Both **_State_** and **_Strategy_** are **Behavioral Patterns**:

    **_State_**: Allow an object to alter its behavior when its internal state changes. The object will appear to change its class.

    **_Strategy_**: Define a family of algorithms, encapsulate each one, and make them interchangeable; lets the algorithm vary independently from clients that use it.

Here we use the **_State_** pattern for implementing the different states of a packaste (`in-transit` and `delivered`), and we use the **_Strategy_** pattern for implementing the different strategies of sending a package (`Standard` or `Express`).

4. **_Singleton_**: Ensure a class only has one instance, and provide a global point of access to it.

   a. _Ensuring a unique instance_. The Singleton pattern makes the sole instance a normal instance of a class, but that class is written so that only one instance can ever be created. A common way to do this is to hide the operation that creates the instance behind a class operation (that is, either a static member function or a class method) that guarantees only one instance is created. This operation has access to the variable that holds the unique instance, and it ensures the variable is initialized with the unique instance before returning its value. This approach ensures that a singleton is created and initialized before its first use.

   b. _Subclassing the Singleton class_. The main issue is not so much defining the subclass but installing its unique instance so that clients will be able to use it. In essence, the variable that refers to the singleton instance must get initialized with an instance of the subclass. The simplest technique is to determine which singleton you want to use in the Singleton's Instance operation. An example in the Sample Code shows how to implement this technique with environment variables.

5. For a class to be "open" it must be possible to inherit from it. Inheritance is an "is-a" relationship. If you inherit from a singleton-class then instances of the child-class are also instances of the parent class due to the "is-a" relationship, meaning you can suddenly have multiple instances of the singleton class. If the singleton class inhibits inheritance, it's no longer "open". If a singleton class allows inheritance, and is "open" for extension, then it can no longer enforce the singleton pattern.

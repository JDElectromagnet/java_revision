# Java OOP Basics: Interfaces vs Abstract Classes

This document summarizes core Java object-oriented programming concepts, focusing on **interfaces**, **abstract classes**, and their use in **system design**.

---

## Java Interface

### What is an Interface?

A Java interface is a reference type used to define a **contract** that other classes can implement. It contains abstract methods and may also include default methods, static methods, constants, and nested types.

### Why We Use It:

* To achieve abstraction and decouple implementation.
* To allow multiple unrelated classes to follow the same contract.
* To enable multiple inheritance of type.

---

## Java Abstract Class

### What is an Abstract Class?

An abstract class is a partially implemented class that may include both abstract methods (no body) and concrete methods (with body). It serves as a blueprint for subclasses.

### Why We Use It:

* To share common implementation code among related classes.
* To enforce a standard structure while allowing flexibility in implementation.
* To use constructors and maintain state across subclasses.

---

## Similarities and Differences

### Similarities:

* Both define method signatures.
* Both cannot be instantiated directly.
* Both are used to enforce a design structure in OOP.

### Differences:

| Feature       | Interface                                       | Abstract Class                              |
| ------------- | ----------------------------------------------- | ------------------------------------------- |
| Inheritance   | Can extend multiple interfaces                  | Can extend only one class                   |
| Method Bodies | Only `default` and `static` methods have bodies | Can have both abstract and concrete methods |
| Fields        | Only `public static final` constants allowed    | Can have instance variables and constants   |
| Constructors  | Not allowed                                     | Allowed                                     |
| Usage         | Behavior contract                               | Partial implementation and shared logic     |

---

## Java Keywords Explained

### `default`

Defines a method with a body in an interface. It provides a base implementation that implementing classes may override.

### `static`

Denotes class-level variables or methods. Static members are shared among all instances and can be accessed without creating an object.

### `const`

Reserved in Java but not used. Instead, Java uses `final` to define constants.

### `final`

Used to declare constants, prevent method overriding, or stop class inheritance. It enforces immutability and design safety.

### `super`

Refers to the immediate superclass of the current class. Used to access parent methods, variables, or constructors.

---

This repository contains code examples that illustrate each of these concepts.

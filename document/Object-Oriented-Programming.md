# Object-Oriented Programming (OOP) in Java

Object-Oriented Programming (OOP) is a programming paradigm centered around the concept of **objects**, which can contain data and behavior. Java is a fully object-oriented language that embraces OOP principles for structuring software.

## Core Principles of OOP

The four foundational concepts of OOP are:

* **Encapsulation**
* **Inheritance**
* **Polymorphism**
* **Abstraction**

Each principle helps in creating modular, scalable, and maintainable code.

# Inheritance in Java

Inheritance is one of the core concepts of Object-Oriented Programming (OOP). It allows a class to inherit properties and behavior (fields and methods) from another class.

## Why We Use Inheritance:

* To promote code reuse by sharing common logic
* To create a hierarchical classification of classes
* To extend or specialize base class behavior

## Key Points:

* The class being inherited from is called the **superclass** or **parent class**.
* The class that inherits is called the **subclass** or **child class**.
* Java supports **single inheritance** (a class can only inherit from one superclass).
* Inherited methods can be **overridden** in the subclass for custom behavior.
* The `super` keyword is used to refer to the superclass.


# Abstraction in Java

Abstraction is a fundamental principle of Object-Oriented Programming (OOP) that allows you to focus on **what an object does** instead of **how it does it**.

## Why We Use Abstraction:

* To hide complex implementation details
* To define clear interfaces and contracts
* To reduce code complexity and improve maintainability

## Key Points:

* Abstraction can be achieved using **abstract classes** and **interfaces**.
* An **abstract class** can have both abstract and concrete methods.
* An **interface** only defines method signatures (and optionally default/static methods).
* Abstraction enhances flexibility in design and promotes loose coupling.


# Polymorphism in Java

Polymorphism is a core concept in Object-Oriented Programming (OOP) that allows objects to be treated as instances of their parent type, enabling flexibility and dynamic behavior.

## Why We Use Polymorphism:

* To write code that works on the superclass level while executing subclass behavior
* To support dynamic method dispatch at runtime
* To simplify code and improve extensibility

## Key Points:

* **Compile-time polymorphism** is achieved through **method overloading**.
* **Runtime polymorphism** is achieved through **method overriding**.
* Polymorphism relies on **inheritance** and **interfaces** to work.
* Promotes open/closed principle (open for extension, closed for modification).


# Encapsulation in Java

Encapsulation is a key principle of Object-Oriented Programming (OOP) that refers to **bundling data and methods** that operate on that data within a single unit (class) and **restricting direct access** to some of the object's components.

## Why We Use Encapsulation:

* To protect internal object state from unintended interference
* To enforce controlled access using getters and setters
* To increase modularity, security, and maintainability

## Key Points:

* Data is made private and accessed through **public getter/setter methods**.
* Helps in achieving **data hiding**.
* Makes classes easier to change without affecting external code.
* Supports cleaner and more robust object design.


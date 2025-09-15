### Class inheritance 
Learning Objectives
- You know that in the Java programming language every class inherits the Object class, and you understand why every object has methods toString, equals, and hashCode.- 
- You are familiar with the concepts of inheritance, superclass, and subclass.- 
- You can create classes that inherit some of their properties from another class.- 
- You can call a constructor or method that is defined in a superclass.- 
- You know how an object's executed method is determined, and you are familiar with the concept of polymorphism.- 
- You can assess when to use inheritance, and you can come up with an example that is ill-suited for inheritance

Classes are used to clarify the concepts of the problem domain in object-oriented programming. Every class we create adds functionality to the programming language. This functionality is needed to solve the problems that we encounter. An essential idea behind object-oriented programming is that solutions rise from the interactions between objects which are created from classes.An object in object-oriented programming is an independent unit that has a state, which can be modified by using the methods that the object provides. Objects are used in cooperation; each has its own area of responsibility. For instance, our user interface classes have so far made use of Scanner objects.
Every Java class extends the class Object, which means that every class we create has at its disposal all the methods defined in the Object class. If we want to change how these methods are defined in Object function, they must be overriden by defining a new implementation for them in the newly created class. The objects we create receive the methods equals and hashCode, among others, from the Object class.
Every class derives from Object, but it's also possible to derive from other classes. When we examine the API (Application Programming Interface) of Java's ArrayList, we notice that ArrayList has the superclass AbstractList. AbstractList, in turn, has the class Object as its superclass.

  java.lang.Object
  java.util.AbstractCollection<E>
    java.util.AbstractList<E>
       java.util.ArrayList<E>
Each class can directly extend only one class. However, a class indirectly inherits all the properties of the classes it extends. So the ArrayList class derives from the class AbstractList, and indirectly derives from the classes AbstractCollection and Object. So ArrayList has at its disposal all the variables and methods of the classes AbstractList, AbstractCollection, and Object. I.e ArrayList extends from AbstractList which extends from AbstractCollection which extends from Object. 
We use the extends keyword to inherit the properties of a class. With this the new class has access to all the properties of the class it extends. The new class that inherits is called subclass while the class which properties are inherited is called superclass.
The class definition public class Engine extends Part indicates that the class Engine inherits the functionality of the class Part. We also define an object variable engineType in the class Engine.
The constructor of the Engine class is worth some consideration. On its first line we use the keyword super to call the constructor of the superclass. The call super(identifier, manufacturer, description) calls the constructor public Part(String identifier, String manufacturer, String description) which is defined in the class Part. Through this process the object variables defined in the superclass are initiated with their initial values. After calling the superclass constructor, we also set the proper value for the object variable engineType.
The super call bears some resemblance to the this call in a constructor; this is used to call a constructor of this class, while super is used to call a constructor of the superclass. If a constructor uses the constructor of the superclass by calling super in it, the super call must be on the first line of the constructor. This is similar to the case with calling this (must also be the first line of the constructor).

## Access modifiers private, protected, and public

If a method or variable has the access modifier private, it is visible only to the internal methods of that class. Subclasses will not see it, and a subclass has no direct means to access it. So, from the Engine class there is no way to directly access the variables identifier, manufacturer, and description, which are defined in the superclass Part. The programmer cannot access the variables of the superclass that have been defined with the access modifier private.

A subclass sees everything that is defined with the public or protected access modifier in the superclass. If we want to define some variables or methods that are visible to the subclasses but Invisible to everything else, we can use the access modifier protected to achieve this.

# Calling the constructor of the superclass
You use the keyword super to call the constructor of the superclass. The call receives as parameters the types of values ​​that the superclass constructor requires. If there are multiple constructors in the superclass, the parameters of the super call dictate which of them is used just like it is if we were instantiating an object of the superclass. The super call must be on the first line of the constructor.
When the constructor (of the subclass) is called, the variables defined in the superclass are initialized. The events that occur during the constructor call are practically identical to what happens with a normal constructor call. If the superclass doesn't provide a non-parameterized constructor, there must always be an explicit call to the constructor of the superclass in the constructors of the subclass.
# Calling a superclass method
You can call the methods defined in the superclass by prefixing the call with super, just as you can call the methods defined in this class by prefixing the call with this. For example, when overriding the toStringmethod, you can call the superclass's definition of that method in the following manner:

@Override
public String toString() {
    return super.toString() + "\n  And let's add my own message to it!";}

### Polymorphism
Regardless of the type of the variable, the method that is executed is always chosen based on the actual type of the object. Objects are polymorphic, which means that they can be used via many different variable types. The executed method always relates to the actual type of the object. This phenomenon is called polymorphism.
# The actual type of an object dictates which method is executed
An object's type decides what the methods provided by the object are. For instance, we implemented the class Student earlier. If a reference to a Student type object is stored in a Person type variable, only the methods defined in the Person class (and its superclass and interfaces) are available
So an object has at its disposal the methods that relate to its type, and also to its superclasses and interfaces. The Student object above offers the methods defined in the classes Person and Object. So if an object(a subclass) method is accessed, the methods in the subclass i.e the current object is first used and in it absence the superclass methods is used i.e even the subclass methods will override the methods of superclass if both subclass and super has the methods defined in each. Even if we type cast either upcast or downcast between a subclass to it super class, the methods of the subclass will always override those in the superclass.
The method to be executed is chosen based on the actual type of the object, which means the class whose constructor is called when the object is created. If the method has no definition in that class, the version of the method is chosen from the class that is closest to the actual type in the inheritance hierarchy. The actual class of the object is permanent even if we used it as a variable to another object or casting it. This make the object to always try in retaining it methods if possible.
In the last exercise we wrote a new toString implementation for Student to override the method that it inherits from Person. The class Person had already overridden the toString method it inherited from the class Object
 Manhattan distance means the distance between two points if you can only travel in the direction of the coordinate axes. It is used in many navigation algorithms, for example.
 As we can see, the sequence of events caused by the method call has multiple steps. The principle, however, is clear: The definition for the method is first searched for in the class definition of the actual type of the object. If it is not found, we next examine the superclass. If the definition cannot be found there, either, we move on to the superclass of this superclass, etc...

 ## When is inheritance worth using?
 Inheritance is a tool for building and specializing hierarchies of concepts; a subclass is always a special case of the superclass. If the class to be created is a special case of an existing class, this new class could be created by extending the existing class. For example, in the previously discussed car part scenario an engine is a part, but an engine has extra functionality that not all parts have.
 When inheriting, the subclass receives the functionality of the superclass. If the subclass doesn't need or use some of the inherited functionality, inheritance is not justifiable. Classes that inherit will inherit all the methods and interfaces from the superclass, so the subclass can be used in place of the superclass wherever the superclass is used. It's a good idea to keep the inheritance hierarchy shallow, since maintaining and further developing the hierarchy becomes more difficult as it grows larger. Generally speaking, if your inheritance hierarchy is more than 2 or 3 levels deep, the structure of the program could probably be improved.
 Inheritance is not useful in every scenario. For instance, extending the class Car with the class Part (or Engine) would be incorrect. A car includes an engine and parts, but an engine or a part is not a car. More generally, if an object owns or is composed of other objects, inheritance should not be used.

 _When using inheritance, you should take care to ensure that the Single Responsibility Principle holds true. There should only be one reason for each class to change. If you notice that inheriting adds more responsibilities to a class, you should form multiple classes of the class._

 ch = new ChangeHistory();
ch.toString();

ChangeHistory ch = new ChangeHistory();
ch.add(99);
ch.minValue();
 expected:<99.0> but was:<0.0>
 
 StackOverflowError, in call toString(). ChangeHistory ch = new ChangeHistory();
ch.add(3);
ch.add(5);
ch.add(1);
ch.maxValue();
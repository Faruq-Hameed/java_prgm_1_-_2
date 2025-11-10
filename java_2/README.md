### Class diagrams
# Learning Objectives
- Know how to draw class diagrams and how to describe classes and their attributes, constructors, and methods
- Know how to describe connections between classes and describe inheritance and interface implementation
- Can implement a class based on a class diagram

A class diagram is a diagram used in designing and modeling software to describe classes and their relationships. Class diagrams enable us to model software in a high level of abstraction and without having to look at the source code.

Classes in a class diagram correspond with classes in the source code. The diagram shows the names and attributes of the classes, connections between the classes, and sometimes also the methods of the classes.

# Describing class and class attributes
In a class diagram, a class is represented by a rectangle with the name of the class written on top.  A line below the name of the class divides the name from the list of attributes (names and types of the class variables). The attributes are written one attribute per line.
In a class diagram, class attributes are written "attributeName: attributeType". A + before the attribute name means the attribute is public, and a - means the attribute is private.

[Person|-name:String;-age:int]
![alt text](image.png)

# Describing class constructor
In a class diagram, we list the constructor (and all other methods) below the attributes.
A line below the attributes list separates it from the method list.  Methods are written with +/- (depending on the visibility of the method), method name, parameters, and their types. The constructor above is written +Person(initialName:String). The parameters are written the same way class attributes are — "parameterName: parameterType".
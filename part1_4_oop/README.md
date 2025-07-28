## Classes and Objects
A class defines the attributes of objects, ie, the information related to them (instance variables), and their commands, ie, their methods. The values of instance (ie, object) variables define the internal state of an individual object, whereas methods define the functionality it offers.
A Method is a piece of source code written inside a class that's been named and has the ability to be called. A method is always part of some class and is often used to modify the internal state of an object instantiated from a class.
As an example, ArrayListis a class offered by Java, and we've made use of objects instantiated from it in our programs. An object is always instantiated by calling a method that created an object, ie, a constructor by using the new keyword.

# The Relationship Between a Class and an Object
A class lays out a blueprint for any objects that are instantiated from it. A class is a blueprint. In other words, it specifies what kinds of objects can be instantiated from it

## Creating Classes
A class specifies what the objects instantiated from it are like.
A class is defined to represent some Meaningful entity, where a "meaningful entity" often refers to a real-world object or concept.
A class defines the attributes and behaviors of objects that are created from it.
The object's variables (instance variables) specify the internal state of the object
The object's methods specify what the object does
The object's constructor specifies how the object is created
Variables defined inside a class are called instance variables , or object fields or object attributes. Other names also seem to exist.
The methods defined inside a class are called object methods or object functions or object operations or object behaviors. Other names also seem to 
Instance variables are written on the lines following the class definition
private key word is used to hide the instance variables in the class such that it can only be accessed from within the class. This is what encapsulation is all about.
In the class diagram, the variables associated with the class are defined as "variableName: variableType". The minus sign before the variable name indicates that the variable is Encapsulated (it has the keyword private).
Instance variables are referred to with the prefix this. All of the object's variables are visible and available from within the method.

## Defining a Constructor
We want to set an initial state for an object that's created. Custom objects are created the same way as objects from pre-made Java classes, such as ArrayList, using the newkeyword.This is achieved by defining the method that creates the object, ie, its constructor. The constructor is defined after the instance variables. 
The constructor's name is always the same as the class name.
Objects are always created using a constructor.
If the programmer does not define a constructor for a class, Java automatically creates a default one for it
A default constructor is a constructor that doesn't do anything apart from creating the object. The object's variables remain uninitialized (generally, the value of any object References will be null, meaning that they do not point to anything, and the values of primitives will be 0)

A method is written inside the class beneath the constructor. The method name is preceded by public void(if it returns nothing), since the method is intended to be visible to the outside world ( public), and it does not return a value ( void).

# Objects and the Static Modifier
The staticmodifier indicates that the method in question does not belong to an object and thus cannot be used to access any variables that belong to objects.

It is the convention in Java to name a method that returns an instance variable exactly this way, i.e., getVariableName. Such methods are often referred to as "getters".
The method returning the string representation is always toString
The call to the toString method returning the string representation does not have to be written explicitly, as Java adds it automatically.
## Object
An Object refers to an independent entity that contains both data (instance variables) and behavior (methods). Objects may come in lots of different forms: some may describe problem-domain concepts, others are used to coordinate the interaction that happens between objects. Objects interact with one another through method calls — these method calls are used to both request information from objects and give instructions to them.
Generally, each object has clearly defined boundaries and behaviors and is only aware of the objects that it needs to perform its task. In other words, the object hides its internal operations, providing access to its functionality through clearly defined methods. Moreover, the object is independent of any other object that it doesn't require to accomplish its task. Reminder about class; a class contains the blueprint needed to create objects, and also defines the objects' variables and methods. An object is created on the basis of the class constructor. when building an application that deals with people, the functionality and features related to a person are gathered based on the application's use case. For example, an application focused on personal health and well-being would probably keep track of the variables mentioned earlier, such as age, weight, and height, and also provide the ability to calculate a body mass index and a maximum heart rate. On the other hand, an application focused on communication could store people's email addresses and phone numbers, but would have no need for information such as weight or height.
# The state of an object is the value of its internal variables at any given point in time.

## Class
A class defines the types of objects that can be created from it. It contains instance variables describing the object's data, a constructor or constructors used to create it, and methods that define its behavior. Objects are created from the class through constructors by using the new command.

## Constructor Overloading
With Constructor Overloading We can have multiple  alternative ways to create objects from a class. This is possible since a class may have multiple constructors. The technique of having two (or more) constructors in a class is known as constructor overloading. A class can have multiple constructors that differ in the number and/or type of their parameters. It's not, however, possible to have two constructors with the exact same parameters.

A constructor can be called from another constructor using the this keyword, which refers to this object in question!. If a constructor calls another constructor, the constructor call must be the first command in the constructor. If any Constructor call must be the first statement in a constructor

# Method Overloading
Methods can be overloaded in the same way as constructors, i.e., multiple versions of a given method can be created. Once again, the parameters of the different versions must be different. The one that gets executed depends on the number of parameters provided.

## Primitive and reference variables
Variables in Java are classified into primitive and reference variables. From the programmer's perspective, a primitive variable's information is stored as the value of that variable, whereas a reference variable holds a reference to information related to that variable. reference variables are practically always objects in Java.
A reference to an object is returned by the constructor of the Name class when we call it, and this reference is stored as the value of the variable. 
The previous situation applies whenever the programmer has not altered an object's default print format. You can modify the default print by defining the toString method within the class of the given object, where you specify what the objects print should look like

# Primitive Variables
Java has eight different primitive variables. These are: boolean (a truth value: either true or false), byte (a byte containing 8 bits, between the values -128 and 127), char (a 16-bit value representing a single character), short (a 16-bit value that represents a small integer, between the values -32768 and 32767), int (a 32-bit value that represents a medium-sized integer, between the values -231 and 231-1), long (a 64-bit value that represents a large integer, between values -263 and 263-1), float (a floating-point number that uses 32 bits), and double (a floating-point number that uses 64 bits).
Declaring a primitive variable causes the computer to reserve some memory where the value assigned to the variable can be stored. The size of the storage container reserved depends on type of the primitive. 
The name of the variable tells the memory location where its value is stored. When you assign a value to a primitive variable with an equality sign, the value on the right side is copied to the memory location indicated by the name of the variable. For example, the statement int first = 10 reserves a location called first for the variable, and then copies the value 10 into it.

Similarly, the statement int second = first; reserves in memory a location called second for the variable being created and then copies into it the value stored in the location of variable first.The values of variables are also copied whenever they're used in method calls. What this means in practice is that the value of a variable that's passed as a parameter during a method call is not mutated in the calling method by the method called.

# Reference Variables

All of the variables provided by Java (other than the eight primitive variables mentioned above) are reference type. A programmer is also free to create their own variable types by defining new classes. In practice, any object instanced from a class is a reference variable.
Whenever a new variable is declared, its type must be stated first. Values can be assigned to variables. Objects are created from classes by calling the class constructor. This constructor defines the values assigned to the instance variables of the object being created. The constructor call returns a value that is a reference to the newly-created object. The equality sign tells the program that the value of the right-hand side expression is to be copied as the value of the variable on the left-hand side. The reference to the newly-created object, returned by the constructor call, is copied as the value of the variable created.
The most significant difference between primitive and reference variables is that primitives (usually numbers) are immutable. The internal state of reference variables, on the other hand, can typically be mutated. This has to do with the fact that the value of a primitive variable is stored directly in the variable, whereas the value of a reference variable is a reference to the variable's data, i.e., its internal state.
Arithmetic operations, such as addition, subtraction, and multiplication can be used with primitive variables — these operations do not change the original values of the variables. Arithmetic operations create new values that can be stored in variables as needed. Conversely, the values of reference variables cannot be changed by these arithmetic expressions.
The value of a reference variable — i.e., the reference — points to a location that contains information relating to the given variable. Let's assume that we have a Person class available to us, containing an instance variable 'age'. If we've instantiated a person object from the class, we can get our hands on the age variable by following the object's reference. The value of this age variable can then be changed as needed.

# Primitive and Reference Variable as Method Parameters
 Regardless of whether the variable is primitive or reference type, the value passed to the method as an argument is copied for the called method to use. With primitive variables, the value of the variable is conveyed to the method. With reference variables, it's a reference.

 ## Variables and Computer Memory
 In the course's material, concrete details related to variables and computer memory are simplified. Topics related to memory are dealt with on a level of abstraction that's suitable for learning programming. As an example, the description that the statement int number = 5 reserves a location for the variable number in the memory, and copies the value 5 into it, is sufficient with regard to the learning objectives of this course.

From the perspective of the operating system, a lot more happens when the statement int number = 5 is executed. A locker of size 32-bits is reserved in memory for the value 5, and another one for the number variable. The size of the location is determined by the type of variable in question. Once this is done, the contents of the memory location storing the value 5 are copied into the memory location of the number variable.

To add to the above, the number variable is technically not a memory location or a container. The value of the variable number is an address in memory — information attached to the variable about its type specifies how much data should be retrieved from its address. As an example, this is 32 bits for an integer.
----------------------------------------------------------------------------------------------------------------

## Objects and references

Calling a constructor with the command new causes several things to happen. First, space is reserved in the computer memory for storing object variables. Then default or initial values are set to object variables (e.g. an int type variable receives an initial value of 0). Lastly, the source code in the constructor is executed.

A constructor call returns a reference to an object. A reference is information about the location of object data. So the value of the variable is set to be a reference, i.e. knowledge about the location of related object data. 
Assigning a reference type variable copies the reference. An object's internal state is not copied when a variable's value is assigned. A new object is not being created when a variable's value is assigned. Instead, a new reference is being created, which points to the same object as the reference variable that was assigned. The value of the variable is not changed. The value of the variable is assigned to be the copy as a reference to an object.
# null value of a reference variable
The null reference can be set as the value of any reference type variable. Printing a null reference prints "null". If we were to try and call a method on an object that refers to nothing i.e whose value is null, there occurred an error indicating that we called a method on a variable that refers to nothing we get the NullPointerException.
The object whose name was not referred to by nobody has become a garbage object. The garbage collector will eventually remove it from the computer's memory. 
Object as object variable
Objects may contain References to objects.
# Garbage Collection
The garbage collector is a program that runs in the background and removes unused objects from the computer's memory.
In the Java programming language the programmer need not worry about the program's memory use. From time to time, the automatic garbage collector of the Java language cleans up the objects that have become garbage. If the garbage collection did not happen, the garbage objects would reserve a memory location until the end of the program execution. 

# Assisted creation of constructors, getters, and setters
Development environments can help the programmer. If you have created object variables for a class, creating constructors, getters, and setters can be done almost automatically.

Go inside the code block of the class, but outside of all the methods, and simultaneously press ctrl and space. If your class has e.g. an object variable balance, NetBeans offers the option to generate the getter and setter methods for the object variable, and a constructor that assigns an initial value for that variable.

On some Linux machines, like on the ones on the Kumpula campus (University of Helsinki), this feature is triggered by simultaneously pressing ctrl, alt, and space.

Object of same type as method parameter is also possible. This is called a constructor call with a reference to an object as a parameter. The reference to the object is passed to the method as a parameter. The value of the reference is copied to the parameter, and the value of the parameter is used as a reference to the object. The value of the reference variable is not changed. The value of the parameter is the reference to the object.

# Abstraction
Abstraction, one of the principles of object-oriented programming. The idea behind abstraction is to conceptualize the programming code so that each concept has its own clear responsibilities. 
Even though the if the object variables are Encapsulated ( private) object variables, we can read their values by writing compared.*variableName*. This is because a privatev ariable can be accessed from all the methods contained by that class. Notice that the syntax here matches calling some object method. Unlike when calling a method, we refer to a field of an object, so the parentheses that indicate a method call are not written.

# Comparing the equality of objects (equals)
While working with strings, we learned that strings must be compared using the equalsmethod. This is how it's done. With primitive variables such as int, comparing two variables can be done with two equality signs. This is because the value of a primitive variable is stored directly in the "variable's box". The value of reference variables, in contrast, is an address of the object that is referenced; so the "box" contains a reference to the memory location. Using two equality signs Compares the equality of the values stored in the "boxes of the variables" — with reference variables, such comparisons would examine the equality of the memory references.The method equalsis similar to the method toStringin the respect that it is available for use even if it has not been defined in the class. The default implementation of this method Compares the equality of the references. The method equalsis available for use even if it has not been defined in the class. The default implementation of this method Compares the equality of the.
But If we want to be able to compare two objects of our own design with the equalsmethod, that method must be defined in the class. The method equalsis defined as a method that returns a boolean type value — the return value indicates whether the objects are equal.

# What is Object?
An object is a collection of data and methods that operate on that data. The data is stored in fields of the object. The methods are called on the object. The data and the methods are called the object's state and behavior, respectively. The object's state is represented by its fields. The object's behavior is represented by its methods. A class is a blueprint for creating objects. The class defines the object's state and behavior. An object is an instance of a class

 # What of the type Object? Every class we create (and every ready-made Java class) inherits the class Object, even though it is not specially visible in the program code. This is why an instance of any class can be passed as a parameter to a method that receives an Object type variable as its parameter. Inheriting the Object can be seen elsewhere, too: for instance, the toString method exists even if you have not implemented it yourself, just as the equals method does. The equals method can be found in the Object class inherited by all classes.

 # Object equality and lists
 The equals method is called on the objects that are compared. The equals method is defined in the Object class, and it is inherited by all classes. The contains method of a list uses the equals method that is defined for the objects in its search for objects. So in a list the contains during the search for the object in every index  using the equals method. 

 # Object as a method's return value
We have seen methods return boolean values, numbers, and strings. Easy to guess, a method can return an object of any type. you can call another constructor from a constructor by calling this. notice that the this call must be on the first line of the constructor. We can also clone the object to return this structured of object but this does cloning the reference because the new object is created by directly instantiating the new object using the variables of the original object. Immediately after the cloning operation, the values contained by the clone and the cloned object are the same. However, they are two different objects, so increasing the value of one counter does not affect the value of the other in any way.  If the return Object is of this instance, then a reference to that location will be returned. Meaning a modification of the main object will affect the clone and vice versa. 

The word final used in the definition of object variables catches attention. The result of this word is that the values of these object variables cannot be modified after they have been set in the constructor.if we want to e.g. increase value of a variable with final in  a class, we must create a new object to represent that new value.
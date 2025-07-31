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

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


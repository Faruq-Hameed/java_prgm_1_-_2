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
# Describing class methods
In a class diagram, we list all class methods including the constructors; constructors are listed first and then all class methods. We also write the return type of a method in the class diagram.
A class diagram describes classes, constructors and methods
A class diagram describes classes and their attributes, constructors and methods as well as the connections between classes. However a class diagram tells us nothing about the implementation of the constructors or the methods. Therefore a class diagram describes the structure of an object but not its functionality.

For example the method printPerson uses the class attributes name and age, but this cannot be seen from the class diagram.

# Connections between classes
In a class diagram, the connections between classes are shown as arrows. The arrows also show the direction of the connection.
In a class diagram variables which refer to other objects are not written with the rest of the class attributes, but are shown as connections between the classes. In the class diagram below we have the classes Person and Book, and the connection between them.
The arrow shows the direction of the connection. The connection above shows that a Book knows its author but a Person does not know about books they are the author of. We can also add a label to the arrow to describe the connection. In the above diagram the arrow has an accompanying label telling us that a Book has an author.
If a book has multiple authors, the authors are saved to a list.
In a class diagram, this situation is described by adding a star to the end of the arrow showing the connection between the classes. The star tells us that a book can have between 0 and unlimited number of authors. Below we have not amended the label to describe the multiplicity of the connection, but it would be a good idea for the sake of clarity.
If there is no arrowhead in a connection, both classes know about each other. Below is an example where a book knows about its author and a person knows about a book they have written.

[Person|-name:String;-age:int|+Person(initialName:String);+printPerson():void;+getName():String][Book|-name:String;-publisher:String|+getAuthors():ArrayList;+addAuthor(author:Person)][Book]-*[Person]
As you can see, by default — if there is no star on the connection — the connection is singular. The classes above are interesting, because a Person can only have one book.

If a person can have multiple books and a book can have multiple authors, we add a star to both ends of the connection:

# Describing inheritance
In a class diagram inheritance is described by an arrow with a Triangle head. The Triangle points to the class being inherited from. In the example below, the Engine inherits the class Part.
In the example below, the class diagram describes the classes from the Product Warehouse exercise. The ProductWarehouseWithHistory class inherits the ProductWarehouse class, which, in turn, inherits the Warehouse class. ChangeHistory is a separate class connected to the ProductWarehouse. ProductWarehouseWithHistory knows about the ChangeHistory but the ChangeHistory does not know about the ProductWarehouseWithHistory.
Inheritance of abstract classes is described almost the same way as regular classes. However we add the description <<abstract>>above the name of the class. The name of the class and its abstract methods are also written in cursive.

# Describing interfaces
In class diagrams, interfaces are written <<interface>>NameOfTheInterface. Below we describe an interface Readable.
Methods are described just like they are for a class.

Implementing an interface is shown as a dashed arrow with a Triangle arrowhead. Below, we describe a situation where Book implements interface Readable.

## How should these be drawn?
Class diagrams are an excellent way to describe a problem and a problem-domain to others. They are particularly useful when a programmer is designing a program with multiple classes.

Often a class diagram is drawn on a whiteboard or a large sheet of paper during the design phase. Class diagrams should be thought of as helpful tools to build a program, which can be thrown away afterwards. You should not use too much energy to think about the correctness and details of the modeling language. Class diagrams should also be drawn in a suitable level of abstraction. For example, if you have tens of classes, it might not be worth describing each attribute and each method of each class; getting a good overview of the program structure is the most important.

The class diagrams here have been drawn using yUML , Creately , and draw.io. NetBeans also has tools for drawing class diagrams; for example, easyUML draws class diagrams from the source code.

## Packages
Learning Objectives
- You know what packages are and can place classes in them
- You know what the import statement used in Java is composed of
As the number of classes implemented for the program grows, remembering all the functionality and methods becomes more difficult. What helps is naming the classes in a sensible manner and planning them so that each class has one clear responsibility. In addition to these measures, it's wise to divide the classes into packages. Classes in one package might share functionality, purpose, or some other logical property.

Packages are practically directories in which the source code files are organised.

IDEs offer existing tools for package management. Up until this point, we have only created classes and interfaces in the default package of the Source Packages folder of the project. You can create a new package in NetBeans by right-clicking on the Source Packages section (which contains the project's packages), and then selecting New -> Java Package....
You can create classes inside a package in the same way you can in the default package. Below we create the class Program in the newly created package library.

The package of a class (the package in which the class is stored) is noted at the beginning of the source code file with the statement package *name-of-package*;. Below, the class Program is in the package library.

Every package, including the default package, may contain other packages. For instance, in the package definition package library.domain the package domain is inside the package library. The word domain is often used to refer to the storage space of the classes that represent the concepts of the problem domain. For example, the class Book could be inside the package library.domain, since it represents a concept in the library application.

## Directory structure in a file system
Every project you see in NetBeans is in your computer's file system or on a centralized server.
For NetBeans, the project directory src/main/java contains the source code files of the program. If the package of a class is library, that class is stored inside the src/main/java/libary folder of the source code directory. You can also check the concrete project structure in NetBeans in the Files tab, which is normally next to the Project tab. If you cannot see the Files tab, you can make it appear by choosing the option Files from the dropdown menu Window.

Application development is normally done in the Projects tab, where NetBeans hides unimportant files from the programmer.

# Packages and access modifiers
In Java, packages organize classes into namespaces, while access modifiers control visibility and accessibility of classes, methods, and variables across those packages. Together, they define the structure and security of your code.

📦 Java Packages
Packages are containers for classes and interfaces. They help group related code and avoid naming conflicts.
Types of Packages:
- Built-in packages: Provided by Java (e.g., java.util, java.io)
- User-defined packages: Created by developer

Until now, we've used two access modifiers. The modifier private is used to define variables (and methods) that are only visible inside the class where they are defined. They cannot be used from outside that class. The methods and variables defined with public, on the other hand, are available for everyone to use.
1. public
- Accessible from anywhere
public class MyClass { }

2. protected
- Accessible within the same package and subclasses
- 
protected void show() { }


3. Default (no modifier)
- Accessible only within the same package
void display() { }

4. private
- Accessible only within the same class
private int age;

- A public class in a package can be accessed from other packages.
- A protected method in a superclass can be accessed by subclasses in different packages.
- A private method is invisible outside its class—even to other classes in the same package.
- When no access modifier is specified in Java, the member (method, variable, or even class) has package-private or default access. This means: classes in the same package can access default/package-private members. 

# Classes that represent concepts of the problem domain
The classes that represent concepts of the problem domain are often placed inside a package called domain. Since the entirety of the application is inside the package flightControl, let's place the package domain inside the package flightControl. Concepts of the problem domain are represented by the classes Place, Airplane, and Flight.

# Application logic
The application logic is typically kept separate from the classes that represents concepts of the problem domain. In our example, the application logic is stored in the package logic. Application logic includes the functionality to add airplanes and flights, and to list them.

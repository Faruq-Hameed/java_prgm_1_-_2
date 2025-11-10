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
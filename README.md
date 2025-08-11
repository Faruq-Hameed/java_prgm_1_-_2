### Programming paradigms
- A programming paradigm is a way of thinking about and structuring a program's functionality. Programming paradigms differ from one another, for example in how the program's execution and control are defined and what components the programs consist of.
- Most programming languages ​​that are currently in use support multiple programming paradigms. Part of a programmer's growth involves the ability, through experience, to choose the appropriate programming language and paradigm; there currently is no single ubiquitous programming language and programming paradigm.

- The most common programming paradigms today are object-oriented programming, procedural programming, and functional programming.

## Object-Oriented Programming

In object-oriented programming, information is represented as classes that describe the concepts of the problem domain and the logic of the application. Classes define the methods that determine how information is handled. During program execution, objects are instantiated from classes that contain runtime information and that also have an effect on program execution: program execution typically proceeds through a series of method calls related to the objects. "the program is built from small, clear, and cooperative entities."

- The basic ideas of object-oriented programming, i.e., the representation of information and its processing methods with he help of classes and objects, first appeared in Simula 67, which was designed for developing simulations and the Smalltalk programming language. Its breakthrough came in the 1980s through the C++ programming language and Java has made it one of the most widely used programming paradigms in the world.
- One of the major benefits of object-oriented programming is how problem-domain concepts are modeled through classes and objects, which makes programs easier to understand. In addition, structuring the problem domain into classes facilitates the construction and maintenance of programs. However, object-oriented programming is not inherently suited to all problems: for example, scientific computing and statistics applications typically make use of languages, such as R and Python.
- The object-oriented paradigm is characterized by the use of classes and objects. In object-oriented programming, an object is an instance of a class. A class is a template for an object. An object has its own data, called attributes, and methods, which are functions that operate on the object's data. Objects can interact with one another by passing messages, which are requests to perform an action on an object. The object-oriented paradigm is characterized by the use of classes and objects. In object-oriented programming, an object is an instance of a class. A class is a template for an object. An object has its own data, called attributes, and methods, which are functions that operate on the object's data. Objects can interact with one another by passing messages, which are requests to perform an action on an object.

# Procedural programming

Whereas in object-oriented programming, the structure of a program is formed by the data it processes, in procedural programming, the structure of the program is formed by functionality desired for the program: the program acts as a step-by-step guide for the functionality to be performed. The program is executed one step at a time, and subroutines (methods) are called whenever necessary.


In procedural programming, the state of the program is maintained in variables and tables, and any methods handle only the values provided to them as parameters. The program tells the computer what should happen.

When comparing object-oriented programming with procedural programming, a few essential differences emerge. In object-oriented programming, the state of an object can, in principle, change with any object method, and that change of state can also affect the working of the methods of other objects. As a consequence, other aspects of a program's execution may also be affected since objects can be used in multiple places within the program. In procedural programming, the state of the program is maintained in variables and tables, and any methods handle only the values provided to them as parameters. The program tells the computer what should happen.

### Algorithms
- Algorithms, precise instructions on how to to accomplish a specific task, are at the core of computer science. In the context of programming, algorithms are typically defined using source code.
- The concept of efficiency is often associated with algorithms. A programs efficiency, i.e, the computation of required information fast enough, is an integral part of a programs usability. If it took two days for an algorithm designed for forecasting tomorrows weather run, the results wouldn't be very useful! Similarly, a user viewing a TVs program guide won't get any use out of it, if the tv-shows info only loads after the show already ended.
- The most basic algorithm is the one that simply prints out a message to the user. This is a very simple algorithm, but it is the most basic algorithm. It is also the most common algorithm. It is also the most common algorithm.
- An algorithm is a procedure for solving a problem or performing a task. An algorithm is a set of well-defined instructions that can be followed to solve a problem or perform a task. 
- In a more general sense, retrieving and displaying information quickly is an integral part of any applications function. 
## Sorting information
If the information (data) giving to a computer, doesn't follow any rules and isn't in order, retrieving that information is taxing for the computer. We need order! Here comes sorting!
# Selection sort
Every programmer should be familiar with at least one sorting algorithm (i.e a way to sort an array). We should familiarize ourselves with one "classic" sorting algorithm, the selection sort. 
To print an array we take use of the toString class method of the class Arrays.

The idea of selection sort is:

Move the smallest number in the array to index 0.
Move the second smallest number to index 1.
Move the third smalles number in the array to index 2.
Etc.
In other words:

Examine the array starting from index 0. Swap the following two numbers with each other: the number at index 0, and the smallest number in the array starting from index 0.
Examine the array starting from index 1. Swap the following two numbers with each other: the number at index 1, and the smallest number in the array starting from index 1.
Examine the array starting from index 2. Swap the following two numbers with each other: the number at index 2, and the smallest number in the array starting from index 2.
Etc.

## Static or not
Methods in Java can be divided into two groups, based on whether they have the static modifier or not. Methods without the static modifier are instance methods. Methods with the static modifier are class methods. 
Instance methods are methods that are associated with an object, can process the objects variables and can call the object's other methods. Instance methods specifically CAN use the this modifier, which refers to the variables associated with the specific object, that is calling the instance method. Class methods can't use the this modifier, meaning that they can only access the variables they are given as parameters or that they create themselves.
~ In reality class methods can also access class variable, among other things. However, these things are outside the scope of this course.

## Built-in sorting algorithms in Java
Java offers a significant amount of ready to use sorting algorithms. Arrays can be sorted (into their natural order) using the class method sort of the Arrays-class. Lists can be sorted (into their natural order) using the class method sort of the Collections class.
Java's built-in sorting algorithms work with value type variables and some of Java's built-in reference type variables, like String. In order for our own classes to be sorted, we need to provide Java with some tips on how to do that, because the classes themselves don't contain information on how objects created from them should be ordered. 

## Information retrieval
Linear search is a search algorithm that searches for information in an array by going through every value in the array one by one.
When the value that was searched for is found, its index is immediately returned. If the requested value cannot be found, linear search returns the information that the value was not found — typically this means returning -1 instead of a valid index.
In the worst case scenario, i.e when the value searched for isn't found, the algorithm has to do as many comparisons as there are values in the array. In an array containing, say, 10 million values, this means 10 million comparisons. If we are doing more than one search, it makes sense to try and improve efficiency.

## Binary search (aka half-interval search or logarithmic search )
When the data searched is in order, searching can be implemented a lot more efficiently than in linear search. The idea behind Binary Search is to start looking for the searched value in the middle index of the array (or list), compare the value found there to the searched value, and if needed (i.e, when the value isn't found there) eliminate half of the search area.
The algorithm works by repeatedly dividing the search space in half, until the searched value is found.
E.g Does the array contain number 44? The array has 16 elements i.e index 0 to 15
- Only works with ordered arrays / lists
- The execution of binary search begins with the middle value of the array.
- The index of interest contains 9. 44 is greater than 9, so this index or any lesser index cannot contain it.
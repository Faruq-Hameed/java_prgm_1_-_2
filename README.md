## Objects on a list and a list as part of an object

Learning Objectives
You review the use of lists.
You know how to use a list as an instance variable.
et's have a look at objects that contain a list. Examples of objects like these include objects that describe sets, for example playlists.
When a value is added to an ArrayList, it goes to the end of the list. As such, the most recently added value is in the last index of the list - the size() method provided by the list is useful for finding the last index. You can remove an element from a particular index using the remove method provided by the list.
Objects in an Instance Variable List
A list that is an object's instance variable can contain objects other than strings as long as the type of objects in the list is specified when defining the list. 
Clearing an Object's List can be done by setting the list to null or call the clear method provided by the list. 
Retrieving a Specific Object from a List
Methods that retrieve objects from a list should be implemented in the following way. First off, we'll check whether or not the list is empty - if it is, we return a null reference or some other value indicating that the list had no values. After that, we create an object reference variable that describes the object to be returned. We set the first object on the list as its value. We then go through the values on the list by comparing each list object with the object variable representing the object to be returned. If the comparison finds a better matching object, its assigned to the object reference variable to be returned. Finally, we return the object variable describing the object that we want to return.

# Recycling
When concepts have been separated into different classes in the code, recycling them and reusing them in other projects becomes easy. A given part of a class could be used in a graphical user interface, and it could also be part of a mobile phone application. In addition, testing the program is much easier when it has been divided into several concepts, each of which has its own separate logic and can function alone as a unit.

## Programming tips

- Proceed with small steps

Try to separate the program into several sub-problems and work on only one sub-problem at a time
- Always test that the program code is advancing in the right direction, in other words: test that the solution to the sub-problem is correct
- Recognize the conditions that require the program to work differently. In the example above, we needed a different functionality to test whether a word had been already entered before.
- Write as "clean" code as possible
- Indent your code
- Use descriptive method and variable names
- Don't make your methods too long, not even the main method
- Do only one thing inside one method
- Remove all copy-paste code
- Replace the "bad" and unclean parts of your code with clean code
- If needed, take a step back and assess the program as a whole. If it doesn't work, it might be a good idea to return into a previous state where the code still worked. As a corollary, we might say that a program that's broken is rarely fixed by adding more code to it.
Programmers follow these conventions so that programming can be made easier. Following them also makes it easier to read programs, to keep them up, and to edit them in teams.

- It is best in separating the user interface from program logic
- Combining the solutions to sub-problems
- We should see Objects as a natural part of problem solving
- We have to separate a distinct concept into a class of its own, All the "dirty details" have been encapsulated neatly inside an object. If we make any changes inside the a class without changing the names of the methods that it uses uses, we don't have to modify other classes that uses the method by a class. The exposed method of a class are called its public interfaces.

Program logic
Program logic includes parts that are crucial for the execution of the program, like functionalities that store information. we can separate the parts that store object information. Separating the program logic is a major benefit for the maintenance of the program.
User interface
Typically each program has its own user interface. The user interface receives two parameters in its constructor: a object register for storing the object values, and a Scanner object used for reading input.

## Introduction to testing
# Error Situations and Step-By-Step Problem Resolving
- Errors end up in the programs that we write. Sometimes the errors are not serious and cause headache mostly to users of the program. Occasionally, however, mistakes can lead to very serious consequences. In any case, it's certain that a person learning to program makes many mistakes.

- We should never be afraid of or avoid making mistakes since that is the best way to learn. For this reason, try to break the program that you're working on from time to time to investigate error messages, and to see if those messages tell you something about the error(s) you've made.
As programs grow in their complexity, finding errors becomes even more challenging.

# Stack Trace
When an error occurs in a program, the program typically prints something called a stack trace, i.e., the list of method calls that resulted in the error. 

# Checklist for Troubleshooting
If your code doesn't work and you don't know where the error is, these steps will help you get started.

- Indent your code properly and find out if there are any missing parentheses.
- Verify that the variables used are correctly named.
- Test the program flow with different inputs and find out the sort of input that causes the program to not work as desired. If you received an error in the tests, the tests may also indicate the input used.
- Add print commands to the program in which you print out the values of the variables used at various stages of the program's execution.
- Verify that all variables you are using are initialized. If they aren't, a NullPointerException error will occur.
- If your program causes an exception, you should definitely pay attention to the stack trace associated with the exception, which is the list of method calls that resulted in the situation that caused the exception.
- Learn how to use the debugger. 
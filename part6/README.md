## Objects on a list and a list as part of an object

Learning Objectives
You review the use of lists.
You know how to use a list as an instance variable.
Let's have a look at objects that contain a list. Examples of objects like these include objects that describe sets, for example playlists.

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

# Program logic
Program logic includes parts that are crucial for the execution of the program, like functionalities that store information. we can separate the parts that store object information. Separating the program logic is a major benefit for the maintenance of the program.
User interface
Typically each program has its own user interface. The user interface receives two parameters in its constructor: a object register for storing the object values, and a Scanner object used for reading input. or more parameters as the program required.

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

# Passing Test Input to Scanner
Manually testing the program is often laborious. It's possible to automate the passing of input by, for example, passing the string to be read into a Scanner object. The test input can be given as a string to the Scanner object in the constructor. Each line break in the test feed is marked on the string with a combination of a backslash and an n character "\n". 
- Passing a string to the constructor of the Scanner class replaces input read from the keyboard. As such, the content of the string variable input 'simulates' user input. A line break in the input is marked with \n. Therefore, each part ending in an newline character in a given string input corresponds to one input given to the nextLine() command.
- When testing your program again manually, change the parameter Scanner object constructor to System.in, i.e., to the system's input stream. Alternatively, you can also change the test input, since we're dealing with a string.
- The working of the program should continue to be checked on-screen. The print output can be a little confusing at first, as the automated input is not visible on the screen at all. The ultimate aim is to also automate the checking of the correctness of the output so that the program can be tested and the test result analyzed with the "push of a button".

## Unit Testing

- The automated testing method laid out above where the input to a program is modified is quite convenient, but limited nonetheless. Testing larger programs in this way is challenging. One solution to this is unit testing, where small parts of the program are tested in isolation.
- Unit testing refers to the testing of individual components in the source code, such as classes and their provided methods. The writing of tests reveals whether each class and method observes or deviates from the guideline of each method and class having a single, clear responsibility. The more responsibility the method has, the more complex the test. If a large application is written in a single method, writing tests for it becomes very challenging, if not impossible. Similarly, if the application is broken into clear classes and methods, then writing tests is straightforward.
- Ready-made unit test libraries are commonly used in writing tests, which provide methods and help classes for writing tests. The most common unit testing library in Java is JUnit , which is also supported by almost all programming environments. For example, NetBeans can automatically search for JUnit tests in a project — if any are found, they will be displayed under the project in the Test Packages folder. Tests are methods of the test class where each test tests an individual unit
- The JUnit library provides a number of methods for writing tests. The most important is the @Test annotation. This annotation is applied to a method that is used for testing. The method must not have a return value and must not be declared as static. The method is then executed by the JUnit library. The method is executed only once, and the result is stored in the test result.
The assertEquals method provided by the JUnit test framework is then used to check the value. The method is imported from the Assert class with the import Static command, and it's given the expected value as a parameter and the value returned by the class. If the values of the assertEquals method values ​​differ, the test will not pass. Each test method should have an "annotation" @ Test. This tells the JUnit test framework that this is an executable test method. The test method assertEquals receives two values as parameters -- the first is the expected value, and the second the value returned by the program i.e the value returned by method that we are testing. If the values are the same, the test passes. If the values are different, the test fails. 
- The JUnit test framework also provides a method called assertTrue, which can be used to test whether a certain condition is true. If the condition is not true, the test fails. 
- If a test fails, the JUnit test framework can be used to print the stack trace, which shows the method calls that led to the failure. The stack trace can be used to find out where the error occurred. 
- The JUnit test framework also provides a method called assertTrue, which demands that the parameter it receives is true. If the condition is not true, the test fails. 
- The JUnit test framework also provides a method called assertFalse, which demands that the parameter it receives is false. If the condition is not false, the test fails. 
- The JUnit test framework also provides a method called fail, which can be used to test whether a certain condition is true. If the condition is not true, the test fails. 

- Wea also have @Before and @After annotation. These are used to run a piece of code before and after each test. The @Before annotation is used to run a piece of code before each test. Usually used with the initialize method of the test class. The @After annotation is used to run a piece of code after each test. Usually used with the finalize method of the test class. 

# Unit Testing and the Parts of an Application
Unit testing tends to be extremely complicated if the whole application has been written in "Main". To make testing easier, the app should be split into small parts, each having a clear responsibility. In the previous section, we practiced this when we seperated the user interface from the application logic. Writing tests for parts of an application, such as the 'JokeManager' class from the previous section is significantly easier than writing them for program contained in "Main" in its entirety.

## Test-Driven Development
- Test-driven development is a software development process that's based on constructing a piece of software in small iterations. In test-driven software development, the first thing a programmer always does is write an automatically-executable test, which tests a single piece of the computer program.
- The test will not pass because the functionality that satisfies the test in the first check, i.e., the part of the computer program to be examined, is missing. Once the test has been written, functionality that meets the test requirements is added to the program. The tests are then run again. If all tests pass, a new test is added, or alternatively, if the tests fail, the already-written program is corrected. If necessary, the internal structure of the program will be corrected or refactored, so that the functionality of the program remains the same, but the structure becomes clearer.
Test-driven software development consists of five steps that are repeated until the functionality of the program is complete;
Write a test. The programmer decides which program functionality to test and writes a test for it.
- Run the tests and check if the tests pass. When a new test is written, the tests are run. If the test passes, the test is most likely erroneous and should be corrected - the test should only test functionality that hasn't yet been implemented at first.
- Write the functionality that meets the test's requirements. The programmer implements functionality that only meets the test requirements. Note: this doesn't do things that the test does not require - functionality is only added in small increments.
- Perform the tests. If the tests fail, there is likely to be an error in the functionality written. Correct the functionality - or, if there is no error in the functionality, fix the latest test that was performed. 

- Repair the internal structure of the program. As the size of the program increases, its internal structure is adjusted as needed. Methods that are too long are broken down into multiple parts and classes representing concepts are isolated. The tests are not modified, but are instead used to verify the correctness of the changes made to the program's internal structure - if a change in the program structure changes the functionality of the program, the tests will produce a warning and the programmer can remedy the situation.Refactoring means cleaning the code while maintaining the functionality of the program. Cleaning includes tasks such as improving the readibility  and dividing the program into smaller methods and classes.
# Advantages
● Forces the programmer to think of the functionality before writing the code
● Results in maintainable structure, since the program is built in small parts, refactoring steadily. 
● The end product contains tests, which makes further development easier: when the code is changed, it’s easy to check if the existing functionality still works.
● Fewer bugs in production.

The JUnit library offers a method called assertTrue, which demands that the parameter it receives is finally evaluates as true.
Initializing a variable can be done by adding to the test class a method ‘initialize’.We annotate the ‘initialize’ method with @Before, which guides the program to execute this method before each test.
In test-driven development the functionality of the program is constructed in small steps. The programmer first writes a test that examines the wished functionality, and then writes the program code that passes that test. The program is then tested again, and if the test fails, the programmer corrects the code. The process is repeated until the program is complete. 
- Each test method should have an "annotation" @ Test. This tells the JUnit test framework that this is an executable test method. The test method assertEquals receives two values as parameters -- the first is the expected value, and the second the value returned by the program i.e the value returned by method that we are testing. If the values are the same, the test passes. 

## Complex programs

The core of Dikstra's message is, that the problem areas of a program must be separated from each other — this is exactly what we have been doing with object-oriented programming and by separating the UI from the program logic. Each problem area has been separated into its own part. This can also be viewed through the lens of program responsibilities. In his blog Robert "Uncle Bob" C. Martin describes the term "single responsibility principle":
Gather together the things that change for the same reasons. Separate those things that change for different reasons.

Proper program structure and following good naming principles leads to clean code.
Writing the command `System.out.println("...") can be taxing. In NetBeans, try to write sout on blank line (within main) and press tab

Commands are separated with a semicolon ;. We could, if we wanted to, write almost everything on a single line. However, that would be difficult to understand.

input is read with the scannertool's nextLine()method. The call scanner.nextLine()is left waiting for the user to write something. When the user writes something and presses enter, the provided string is assigned to a string variable

When the program's execution comes a statement that attempts to read input from the user (the command reader.nextLine()), the execution stops and waits. The execution continues only after the user has written some input and pressed enter.

A variable's value can be joined to a string using the + sign, as seen in the following example. But the concatinating variable must be a string or str + others ... or any + string + .... not non-string + non-string + string. To do the later, either the first variable or second must be converted to string maybe with String constructor String.valueOf(any)

an integer can be assigned to a variable of the double type, since Java knows how to convert an integer to a double during assignment.
A floating-point value cannot, however, be assigned to an integer variable. The reason for this is that those who develop the language aim to prevent developers from making errors that lead to a loss of information.
A variable's type determines the types of values that can be assigned to it
The Integer.valueOfcommand converts a string to an integer and the Double.valueOfconverts it to a floating-point.
The evaluation of an expression is always performed before its value is assigned to a variable.
An expression is evaluated where it occurs in the program's source code

if all of the variables in the division expression are integers, the resulting value is an integer as well.
If the dividend or divisor (or both!) of the division is a floating point number, the result is a floating point number as well.
An integer can be converted into a floating point number by placing a type-casting operation (double)before it:

Even though we can compare integers, floating point numbers, and boolean values using two equals signs (variable1 == variable2), we cannot compare the equality of strings using two equals signs.
When comparing strings we use the equals-command, which is related to string variables.

You can calculate the square root of an integer with the command Math.sqrt

Methods cannot be defined eg inside other methods.
The names of methods begin with a word written entirely with lower-case letters, and the rest of the words begin with an upper-case letter - this style of writing is known as camelCase. Additionally, the code inside methods is indented by four characters.
If an expression is used as a parameter for a method, the expression is evaluated prior to the method call.
The keyword voidmeans that the method returns nothing.
The lines of source code following the command returnare never executed. If a programmer adds source code after the return to a place which can never be reached during the method's execution, the IDE will produce an error message.
If a method has the form public static void nameOfMethod() it is possible to return from it — in other words, to stop its execution in that place — with the return command that is not followed by a value.
Variables defined in a method are only visible inside that method. other methods can be called from within methods.

For an ArrayList to be used, it first needs to be imported into the program. The type of the ArrayList variable is ArrayList. When a list variable is initialized, the type of the values to be stored is also defined in addition to the variable type — all the variables stored in a given list are of the same type . As such, the type of an ArrayList that stores strings is ArrayList<String>. A new list is created with the command new ArrayList<>()
Creating a new list is done with the command ArrayList<Type> list = new ArrayList<>()
When defining the type of values that a list can include, the first letter of the element type has to be capitalized. A list that includes int-type variables has to be defined in the form ArrayList<Integer>; and a list that includes double-type variables is defined in the form ArrayList<Double>
Variables in Java can be divided into two categories: value type (primitive which hold their actual values) and reference type (reference type which contain a reference to the location that contains the value(s) relating to that variable.) variables.
If you don't need to keep track of the index as you're going through a list's values, you can make use of the for-each loop.
The expression is defined in the following format: for (TypeOfVariable nameOfVariable: nameOfList), where TypeOfVariableis the list's element type, and nameOfVariableis the variable that is used to store each value in the list as we go through it.
The list's remove method removes the value that is located at the index that's given as the parameter. The parameter is an integer.
If the parameter given to removeis the same type as the values in the list, but not an integer, (integers are used to remove from a given index), it can be used to remove a value directly from the list.
Addition is done with the list method add and you use the list method get for retrieval
The number of values on a list is provided by the list's size method which returns the number of elements the list contains
The list's remove method removes the value that is located at the index that's given as the parameter. The parameter is an integer.
If the parameter given to remove is the same type as the values in the list, but not an integer, (integers are used to remove from a given index), it can be used to remove a value directly from the list.
If the list contains integers, you cannot remove a number value by giving an int type parameter to the remove method. This would remove the number from the index that the parameter indicates, instead of an element on the list that has the same value as the parameter. To remove an integer type value you can convert the parameter to Integer type; this is achieved by the valueOf method of the Integer class.

When you create a list, a limited space is reserved in the memory of the computer. When the ArrayList runs out of space, a larger space is reserved and the data from the previous space is copied to the new one.
Even though the ArrayList is simple to use, sometimes we need the ancestor of the ArrayList, the Array.

An Array contains a limited amount of numbered spots (indices) for values. The length (or size) of an Array is the amount of these spots, i.e. how many values can you place in the Array. The values in an Array are called elements.
There are two ways to create an Array. In the first one you have to explicitly define the size upon the creating.
An array is declared by adding square brackets after the type of the elements it contains (typeofelements[]). A new Array is created by calling new followed by the type of the elements, square brackets and the number of the elements in the square brackets.
 # Differences between Array and ArrayList
An array is a basic functionality provided by Java. ArrayList is part of the collection framework in Java. Therefore array members are accessed using [], while ArrayList has a set of methods to access elements and modify them
The array is a fixed-size data structure while ArrayList is not. One need not mention the size of the ArrayList while creating its object. Even if we specify some initial capacity, we can add more elements.
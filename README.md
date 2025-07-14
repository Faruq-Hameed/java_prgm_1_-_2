Writing the command `System.out.println("...") can be taxing. In NetBeans, try to write sout on blank line (within main) and press tab

Commands are separated with a semicolon ;. We could, if we wanted to, write almost everything on a single line. However, that would be difficult to understand.

input is read with the scannertool's nextLine()method. The call scanner.nextLine()is left waiting for the user to write something. When the user writes something and presses enter, the provided string is assigned to a string variable 

When the program's execution comes a statement that attempts to read input from the user (the command reader.nextLine()), the execution stops and waits. The execution continues only after the user has written some input and pressed enter.

A variable's value can be joined to a string using the + sign, as seen in the following example. But the concatinating variable must be a string  or str + others ... or any + string + .... not non-string + non-string + string. To do the later, either the first variable or second must be converted to string maybe with String constructor String.valueOf(any)

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
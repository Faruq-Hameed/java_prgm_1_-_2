Writing the command `System.out.println("...") can be taxing. In NetBeans, try to write sout on blank line (within main) and press tab

Commands are separated with a semicolon ;. We could, if we wanted to, write almost everything on a single line. However, that would be difficult to understand.

input is read with the scannertool's nextLine()method. The call scanner.nextLine()is left waiting for the user to write something. When the user writes something and presses enter, the provided string is assigned to a string variable 

When the program's execution comes a statement that attempts to read input from the user (the command reader.nextLine()), the execution stops and waits. The execution continues only after the user has written some input and pressed enter.

A variable's value can be joined to a string using the + sign, as seen in the following example. But the concatinating variable must be a string  or str + others ... or any + string + .... not non-string + non-string + string. To do the later, either the first variable or second must be converted to string maybe with String constructor String.valueOf(any)

an integer can be assigned to a variable of the double type, since Java knows how to convert an integer to a double during assignment.
A floating-point value cannot, however, be assigned to an integer variable. The reason for this is that those who develop the language aim to prevent developers from making errors that lead to a loss of information.
A variable's type determines the types of values that can be assigned to it
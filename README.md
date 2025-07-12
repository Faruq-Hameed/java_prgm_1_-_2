Writing the command `System.out.println("...") can be taxing. In NetBeans, try to write sout on blank line (within main) and press tab

Commands are separated with a semicolon ;. We could, if we wanted to, write almost everything on a single line. However, that would be difficult to understand.

input is read with the scannertool's nextLine()method. The call scanner.nextLine()is left waiting for the user to write something. When the user writes something and presses enter, the provided string is assigned to a string variable 

When the program's execution comes a statement that attempts to read input from the user (the command reader.nextLine()), the execution stops and waits. The execution continues only after the user has written some input and pressed enter.
### Graphical user interfaces
We'll now take a look at creating graphical user interfaces (GUIs). When creating graphical user interfaces, we mostly make use of user-interface libraries that provide us with ready-made components, such as buttons and text areas. These user-interface libraries take care of drawing the components for us, meaning that we don't have to draw every single component in our program, only add them to it.

Whereas text interfaces have the functionality coupled to a particular form of input, in GUIs it's added to the user-interface components. A programmer can, for instance, add a method to a button that lives on the interface, which handles an event associated with that button.
# Graphical User Interfaces and Required Libraries
A library called JavaFX is used to create graphical user interfaces. On Linux machines, you may have to install the openjfx library — depending on how Java's installed. You can install this in Ubuntu (from the command line) with the command:

user@computer:~$ sudo apt-get install openjfx
A test library called [TestFX] ( https://github.com/TestFX/TestFX/wiki ) is used in the exercise templates to test JavaFx programs. This library is included in the templates.


### Graphical user interfaces
We'll now take a look at creating graphical user interfaces (GUIs). When creating graphical user interfaces, we mostly make use of user-interface libraries that provide us with ready-made components, such as buttons and text areas. These user-interface libraries take care of drawing the components for us, meaning that we don't have to draw every single component in our program, only add them to it.

Whereas text interfaces have the functionality coupled to a particular form of input, in GUIs it's added to the user-interface components. A programmer can, for instance, add a method to a button that lives on the interface, which handles an event associated with that button.
# Graphical User Interfaces and Required Libraries
A library called JavaFX is used to create graphical user interfaces. On Linux machines, you may have to install the openjfx library — depending on how Java's installed. You can install this in Ubuntu (from the command line) with the command:

user@computer:~$ sudo apt-get install openjfx
A test library called [TestFX] ( https://github.com/TestFX/TestFX/wiki ) is used in the exercise templates to test JavaFx programs. This library is included in the templates.

When the launch method is called, the method of the Application class creates a new object from the given class (here JavaFxApplication) and calls its init method. The init method is defined in the Application class and is used, for instance, to initialize objects of a program. After calling the init method, the program calls the start method, which gets a [Stage] (https://docs.oracle.com/javase/8/javafx/api/javafx/stage/Stage.html) object as its parameter, which describes the window. In the implementation of the start method above, the setTitle method sets the title of the Stage-type window object obtained as a parameter. The method show is then called, which leads to the window being displayed. The program then stays in a state where it continuously listens to events on user interface, such as closing the window that causes the application to shut down.

# Structure of a User Interface
Graphical user interfaces consist of three essential parts. The Stage object behaves as the program's window. A [Scene] (https://docs.oracle.com/javase/8/javafx/api/javafx/scene/Scene.html) is set for a Stage object that represents a scene within the window. The Scene object, on the other hand, contains an object responsible for arranging the components belonging to the scene (such as FlowPane), which contains the actual user interface components.
UI components are added as "children" to the object responsible for setting them — FlowPane. This has to do with a JavaFx design decision, whereby each object responsible for UI components may contain other objects responsible for UI components as well as actual UI components. This enables GUIs where the layout of the UI components depends on their location on the user interface. For example, menu items located at the top of a UI are usually placed side by side, while list items are placed one below the other.

To briefly summarize, the UI structure is as follows. The window contains a Scene object. The Scene object contains the object responsible for the layout of the user-interface components. The object responsible for the component layout can contain both UI components and objects responsible for UI component layouts.
🖼️ UI Structure Breakdown
- Window
- The top-level container that holds everything visible in the application.
- Scene
- Attached to the window, it represents the "stage" where all UI elements live.
- Layout Object (e.g., Pane, Layout Manager)
- Responsible for arranging components inside the scene.
- Can contain:
- UI Components (buttons, text fields, labels, etc.)
- Other Layout Objects (nested layouts like grids, stacks, or borders)
🔄 Why this matters
- This hierarchical design allows flexibility: you can nest layouts to achieve complex designs.
- It also enforces separation of concerns: the scene manages the overall stage, while layout objects handle positioning and sizing.
📊 Example (JavaFX-style pseudocode)
Stage window = new Stage();
Scene scene = new Scene(rootLayout);

VBox rootLayout = new VBox(); // layout object
Button btn = new Button("Click Me");
HBox subLayout = new HBox();

rootLayout.getChildren().addAll(btn, subLayout);
scene.setRoot(rootLayout);
window.setScene(scene);
window.show();
Here:
- Stage → Window
- Scene → Scene object
- VBox → Layout object
- Button → UI component
- HBox → Nested layout object

## UI components and their layout
Programmers typically use ready-made libraries for implementing graphical user interfaces. As an example, it would not make much sense to implement a button from scratch (which would require creating a class that draws a button and handles all of its functions) since pre-built button components can usually be found in existing libraries. Let's take a look now at some UI components.

Text can be displayed using the Label class. The Label class provides a UI component for which text can be set, and offers methods for modifying the text it contains. The displayed text is either set in the constructor, or by using the setText method.
Buttons can be added using the Button class. Buttons are added the same way as labels.
You also have the ability to add multiple components at once.
You can find a list of the available UI components on https://docs.oracle.com/javase/8/javafx/user-interface-tutorial/. The site also provides examples on how to use them.

There is a considerable amount of different UI components. Using online materials, such as the one linked above, is a good way to learn about them. When staring out, components should be tried out in isolation by adding a single component at a time and inspecting how it works.
As you become more familiar with the various components, using them becomes more straightforward. What's common to almost all of the components is the way that they're added to an interface - once you know how to add one, you can add almost any component to your interface.

The biggest difference in adding components is where they're placed on the interface. You'll soon learn more about the lay these components out.

As you become more familiar with the various components, using them becomes more straightforward. What's common to almost all of the components is the way that they're added to an interface - once you know how to add one, you can add almost any component to your interface.

The biggest difference in adding components is where they're placed on the interface. You'll soon learn more about the lay these components out.

The text field can be implemented using the TextField class
# UI Component Layout
Each UI component has its place on the interface. The location of a component is determined by the class used to layout the components.

In previous examples, we used a class called FlowPane to set up our front-end components. With FlowPane, components that you add to the interface are placed side-by-side. If the size of Window is reduced so that the components no longer fit next to eahch other, the components will be automatically aligned. In the image below, the application resulting from the previous example has been narrowed so that the components are automatically aligned.

# BorderPane
The BorderPane class lets you lay out components in five different primary positions: top, right, bottom, left and center. Traditional applications such as the web browser you are using take advantage of this layout. There's a menu and address bar at the top, and in the middle is the content of the page.
BorderPane layout = new BorderPane();
        layout.setTop(new Label("top"));
        layout.setRight(new Label("right"));
        layout.setBottom(new Label("bottom"));
        layout.setLeft(new Label("left"));
        layout.setCenter(new Label("center"));

# HBox
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
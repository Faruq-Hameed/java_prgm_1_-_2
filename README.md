## Objects on a list and a list as part of an object

Learning Objectives
You review the use of lists.
You know how to use a list as an instance variable.
et's have a look at objects that contain a list. Examples of objects like these include objects that describe sets, for example playlists.
When a value is added to an ArrayList, it goes to the end of the list. As such, the most recently added value is in the last index of the list - the size() method provided by the list is useful for finding the last index. You can remove an element from a particular index using the remove method provided by the list.
Objects in an Instance Variable List
A list that is an object's instance variable can contain objects other than strings as long as the type of objects in the list is specified when defining the list. 
Clearing an Object's List can be done by setting the list to null or call the clear method provided by the list. 
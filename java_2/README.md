### Type parameters
Since we began using lists, we have given data structures the type of the values that we want them to store. For example, a list that stores strings has been defined as ArrayList<String>, and a hash map that stores keys and values as Strings has been defined as HashMap<String, String>. How on Earth can you implement a class that can contain objects of a given type?

Generics relates to how classes that store objects can store objects of a freely chosen type. The choice is based on the generic type parameter in the definition of the classes, which makes it possible to choose the type(s) at the moment of the object's creation. Using generics is done in the following manner: after the name of the class, follow it with a chosen number of type parameters. Each of them is placed between the 'smaller than' and 'greater than' signs, like this: public class Class<TypeParameter1, TypeParameter2, ...>. The type parameters are usually defined with a single character.
The definition public class Locker<T> indicates that the Locker class must be given a type parameter in its constructor. After the constructor call is executed, all the variables stored in that object are going to be of the type that was given with the constructor.
There is no maximum on the number of type parameters, it's all dependent on the implementation. The programmer could implement the following Pair class that is able to store two objects of specified types.
A significant portion of the Java data structures use type parameters, which enables them to handle different types of variables. ArrayList, for instance, receives a single type parameter, while HashMap receives two.
List<String> strings = new ArrayList<>();
Map<String, String> keyValuePairs = new HashMap<>();
From here on out when you see the type ArrayList<String>, you know that its internal implementation uses a generic type parameter. The same principle holds true for the interface Comparable, for example.

Creating generic interfaces is very similar to creating generic classes. Below you can study the generic interface List (our own definition, which is not as extensive as the existing Java List).
There are two ways for a class to implement a generic interface. One is to decide the type parameter in the definition of the class, and the other is to define the implementing class with a type parameter as well. Below, the class MovieList defines the type parameter when it implements List. The MovieList is meant only for handling movies.
The alternative is to use a type parameter in the class definition, in which case the parameter is passed along to the interface. Now this concrete implementation of the interface remains generic.
If you wanted, you could also use the existing ArrayList class to implement the GeneralList.

### ArrayList and hash table
ArrayList and HashMap are commonly used data structures in programming. We are now going to take a look at their actual implementation. First we'll remind ourselves of how to use an array, after which we're going to build a data structure called List, imitating ArrayList. Then we'll make use of the List to implement the data structure HashTable.

## A brief recap of arrays
- An array is an object that contains a limited number of places for values. The length (or size) of an array is the number of places in it; in other words, how many values can be stored in the array. The size of an array is always predetermined: it is chosen when the array is created, and cannot be changed later.

- The array type is defined with square brackets preceded by the type of the elements in the array (typeOfElements[]). An array is created with the new call, followed by the type of the elements in that array, square brackets, and the number of elements in the array places inside the square brackets.
- The elements of the array are referred to by the indexes.

- Setting a single value to a certain position is done similarly to setting a value to a regular variable, just that when placing the value in an array, you use the index to indicate the position.

- To discover the size of an array you can use the public object variable length that arrays have.
- Arrays can be used in the exact same manner as other variables, so they can be object variables, method parameters, return values of methods, and so on.

- A significant portion of generally used data structures use arrays in their internal implementation.

## List
Let's examine one way to implement the Java ArrayList data structure. Java ArrayList uses an array. The type of the elements in the array is defined by the type parameter given to the ArrayList. Due to this we can add nearly any type of data to a list. Java List offers multiple methods, but right now add, contains, remove and get are most relevant for us.

# Creating a new list
Let's create class List. The List has a generic array — the type of the elements in the array is defined on run time using type parameters. Let's set the size of the array to 10. The array is created as type object, and changed to type generic with (A[]) new Object[10]; — this is done because Java does not support the call new A[10]; for now.

List encapsulates an array. In the beginning, every element in the array contains a null-reference.

# Adding values to the list
The size of the list does not grow. One of the benefits of the ArrayListclass is, that it grows as needed — Programmers do not have to worry about the list getting full.
The size of the list does not grow. One of the benefits of the ArrayListclass is, that it grows as needed — Programmers do not have to worry about the list getting full.

Let's add the functionality for increasing the size of the List. The size of the List increases if the user tries to add a value to a full list. The size of the List is increased by creating a new, larger, array to which the values ​​from the old array are copied to. After this the old array is Abandoned and the List starts to use the new array.

The size of the array is determined in Java with the formula oldSize + oldSize / 2. Let's use the same formula in our implementation. We'll create a new method growfor increasing the size of the array. The method is available only for other methods in the class (it is private).
The implementation creates a new array whose size is 1.5 times the size of the old array. After this all the elements of the old array are copied into the new one, and finally the value of the object variable valuesis set to the new array. The automatic Java garbage Collector removes the old array at some point, now that there are no longer any References to it.

# On the effectiveness of this method
The method described above copies every element from the old array to the new array. If we would have for example two million elements in an array, we must go through two million elements while copying them.

We will discuss the effectiveness of this method — and ways to make it more effective — in the courses Datastructures and Algorithms and Design and analysis of algorithms.

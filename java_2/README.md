### Handling collections as streams

Let's get to know collections, such as lists, as streams of values. Stream is a way of going through a collection of data such that the programmer determines the operation to be performed on each value. No record is kept of the index or the variable being processed at any given time.

With streams, the programmer defines a sequence of events that is executed for each value in a collection. An event chain may include dumping some of the values, converting values ​​from one form to another, or calculations. A stream does not change the values ​​in the original data collection, but merely processes them. If you want to retain the transformations, they need to be compiled into another data collection.
A stream can be formed from any object that implements the Collection interface (e.g., ArrayList, HashSet, HashMap, ...) with the stream() method. The string values ​​are then converted ("mapped") to desired types e.g (integer form) using the stream's (e.g mapToInt(value -> conversion) map integer )method. The conversion is implemented by the valueOf method of the Object (e.g Integer class), which we've used in the past. We then use the filter (value -> filter condition) method e.g (to filter out only those numbers that are divisible by three) for further processing. Finally, we can call the stream's count() method, which counts the number of elements in the stream and returns it as a long type variable if we are working with number collections.

A brief summary of the stream methods we've encountered so far.

# Purpose and method Assumptions

- Stream formation: stream()	The method is called on collection that implements the Collection interface, such as an ArrayList Object. Something is done on the created stream.

- Converting a stream into an integer stream: mapToInt(value -> another)	The stream transforms into one containing integers. A stream containing strings can be converted using, for instance, the valueOf method of the Integer class. Something is done with the stream containing integers.

- Filtering values: filter(value -> filter condition)	The elements that do not satisfy the filter condition are removed from the string. On the right side of the arrow is a statement that returns a boolean. If the boolean is true, the element is accepted into the stream. If the boolean evaluates to false, the value is not accepted into the stream. Something is done with the filtered values.

- Calculating the average: average()	Returns a OptionalDouble-type object that has a method getAsDouble() that returns a value of type double. Calling the method average() works on streams that contain integers - they can be created with the mapToInt method.

- Counting the number of elements in a stream: count()	Returns the number of elements in a stream as a long-type value

## Lambda Expressions
Stream values ​​are handled by methods related to streams. Methods that handle values ​​get a function as a parameter that determines what is done with each element. What the function does is specific to the method in question. For instance, the filter method used for filtering elements is provided a function which returns a boolean true or false, depending on whether to keep the value in the stream or not. The mapToInt method used for transformation is, on the other hand, provided a function which converts the value to an integer, and so on.

# Why are the functions written in the form value -> value > 5?
The expression above, i.e., a *lambda expression,*  is shorthand provided by Java for anonymous methods that do not have an "owner", i.e., they are not part of a class or an interface. The function contains both the parameter definition and the function body. The same function can be written in several different ways.
The same can be written explicitly so that a static method is defined in the program, which gets used within the function passed to the stream as a parameter.
The function can also be passed directly as a parameter. The syntax found below Screeners::greaterThanFive is saying: "use the static greaterThanFive method that's in the Screeners class". The method receive the present element in the list as value meaning that the method must be expecting that value and type.
Functions that handle stream elements ​​cannot change values ​​of variables outside of the function. This has to do with how static methods behave - during a method call, there is no access to any variables outside of the method. With functions, the values ​​of variables outside the function can be read, assuming that those values of those variables do not change in the program. So any variable declared outside of the the stream method call cannot be modified but can be read and used.Variables declared outside of an anonymous function cannot be used, it wont work.

# Stream Methods
Stream methods can be roughly divided into two categories: (1) intermediate operations intended for processing elements ​​and (2) terminal operations that end the processing of elements. Both of the filter and mapToInt methods shown in the previous example are intermediate operations. Intermediate operations return a value that can be further processed - you could, in practice, have an infinite number of intermediate operations chained sequentially (& separated by a dot). Intermediate operations  transform a stream and return another stream. They are lazy and only executed when a terminal operation is invoked.  On the other hand, the average method seen in the previous example is a terminal operation. A terminal operation returns a value to be processed, which is formed from, for instance, stream elements. - Terminal operations (like forEach, collect, reduce, average) trigger the processing of the stream and produce a non-stream result (like a value or a collection). They returns a result derived from the processed stream elements.- The stream is closed after this — it cannot be reused or reprocessed.
 The collect() method in Java Streams is one of the most powerful and flexible terminal operations. It’s used to gather the elements of a stream into a container like a List, Set, Map, or even a custom result.
 - collect() is a terminal operation that transforms a stream into a collection or summary result.
- It uses Collectors — utility methods from java.util.stream.Collectors — to define how the stream should be collected.


# Terminal Operations
Common terminal operations: the count method for counting the number of values on a list, the forEach method for going a through list values, the collect method for gathering the list values ​​into a data structure, and the reduce method for combining the list items.
- The count method informs us of the number of values in the stream as a long-type variable.

- The forEach method defines what is done to each list value and terminates the stream processing.
- You can use the collect method to collect stream values into another collection. The example below creates a new list containing only positive values. The collect method is given as a parameter to the Collectors object to which the stream values ​​are collected - for example, calling Collectors.toCollection(ArrayList::new) creates a new ArrayList object that holds the collected values.
- The reduce method is useful when you want to combine stream elements to some other form. The parameters accepted by the method have the following format: reduce(*initialState*, (*previous*, *object*) -> *actions on the object*).

# Intermediate Operations
Intermediate stream operations are methods that return a stream. Since the value returned is a stream, we can call intermediate operations sequentially. Typical intermediate operations include converting a value from one form to another using map and its more specific form mapToInt used for converting a stream to an integer stream. Other ones include filtering values with filter, identifying unique values with distinct, and arranging values with sorted (if possible).
- distinct-method, that returns a stream that only contains unique values
- The method sorted, which sorts the strings.
The distinct-method described above uses the equals-method that is in all objects for comparing whether two strings are the same. The sorted-method on the other hand is able to sort objects that contain some kind of order — examples of this kind of objects are for example numbers and strings.

# Objects and Stream
Handling objects using stream methods is natural. Each stream method that deals with the stream's values ​​also enables you to call methods related to values.
Streams can also be used to build more complex string representations. 

# Files and Streams
Stream methods make the reading of files that are of predefined format relatively straightforward.

# The Comparable Interface
The Comparable interface defines the compareTo method used to compare objects. If a class implements the Comparable interface, objects created from that class can be sorted using Java's sorting algorithms.
The compareTo method required by the Comparable interface receives as its parameter the object to which the "this" object is compared. If the "this" object comes before the object received as a parameter in terms of sorting order, the method should return a negative number. If, on the other hand, the "this" object comes after the object received as a parameter, the method should return a positive number. Otherwise, 0 is returned. The sorting resulting from the compareTo method is called natural ordering.
The compareTo method required by the interface returns an integer that informs us of the order of comparison.
ALso returning a negative number from compareTo() is enough if the this object is smaller than the parameter object, and returning zero is sufficient when the lengths are the same
Since the implementing class implements the Comparable interface, it is possible to sort the list by using the sorted method. In fact, objects of any class that implement the Comparable interface can be sorted using the sorted method. Be aware, however, _that a stream does not sort the original list - only the items in the stream are sorted._

If a programmer wants to organize the original list, the sort method of the Collections class should be used. This, of course, assumes that the objects on the list implement the Comparable interface.
String.compareTo() also treats letters according to their size, while the compareToIgnoreCase method of the same class ignores the capitalization completely.

# Implementing Multiple Interfaces
A class can implement multiple interfaces. Multiple interfaces are implemented by separating the implemented interfaces with commas (public class ... implements *FirstInterface*, *SecondInterface* ...). Implementing multiple interfaces requires us to implement all of the methods for which implementations are required by the interfaces.

# Sorting Method as a Lambda Expression
We can sort a list without having to implement the Comparable interface.
Both the sort method of the Collections class and the stream's sorted method accept a lambda expression as a parameter that defines the sorting criteria. More specifically, both methods can be provided with an object that implements the Comparator interface, which defines the desired order - the lambda expression is used to create this object.
this will sort;
persons.stream().sorted((p1, p2) -> {
    return p1.getBirthYear() - p2.getBirthYear(); //this will handle the sorting in ascending order
}).forEach(p -> System.out.println(p.getName())); //the item will printed in sorted order here in ascending order
Collections.sort(persons, (p1, p2) -> p1.getBirthYear() - p2.getBirthYear()); //this will sort and mutate original list

When comparing strings, we can use the compareTo method provided by the String class. The method returns an integer that describes the order of both the string given to it as a parameter and the string that's calling it.
persons.stream().sorted((p1, p2) -> {
    return p1.getName().compareTo(p2.getName());
}).forEach(p -> System.out.println(p.getName()));
WE use Double.compare to sort double - Safe: Avoids precision loss and overflow issues.
- Handles NaN and -0.0/+0.0 correctly.
- Returns:
- Negative if this.literacyPercent < other.literacyPercent
- Zero if equal
- Positive if greater
If you're sorting in descending order, just reverse the arguments

# Sorting By Multiple Criteria
We sometimes want to sort items based on a number of things. We can make use of Java's Comparator class here, which offers us the functionality required for sorting.
The Comparator class provides two essential methods for sorting: comparing and thenComparing. The comparing method is passed the value to be compared first, and the thenComparing method is the next value to be compared. The thenComparing method can be used many times by chaining methods, which allows virtually unlimited values ​​to be used for comparison.
When we sort objects, the comparing and thenComparing methods are given a reference to the object's type - the method is called in order and the values ​​returned by the method are compared. The method reference is given as Class::method.
🥇 Primary Comparator Takes Precedence
- The first comparator passed to Comparator.comparing() is the most important.
- It defines the primary sort order.
- If two elements are equal according to this comparator, then the next comparator in the chain (thenComparing) is used.

📐 Order of thenComparing() Matters
- The sequence of thenComparing() calls defines the tie-breaking hierarchy.
- Each subsequent comparator is only used if all previous ones result in equality.
- Changing the order of these calls can completely change the sort result.

### StringBuilder
String creation - although unnoticeable at a small scale - is not a quick operation. Space is allocated in memory for each string where the string is then placed. If the string is only needed as part of creating a larger string, performance should be improved.
Java's ready-made StringBuilder class provides a way to concatenate strings without the need to create them. A new StringBuilder object is created with a new StringBuilder() call, and content is added to the object using the overloaded append method, i.e., there are variations of it for different types of variables. Finally, the StringBuilder object provides a string using the toString method.
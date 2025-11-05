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



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


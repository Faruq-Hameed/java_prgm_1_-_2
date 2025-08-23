### Learning Java Programming 2 by Mooci University
[Mooci link](https://java-programming.mooc.fi/part-8/)

## HashMap 
A HashMap is, in addition to ArrayList, one of the most widely used of Java's pre-built data structures. The hash map is used whenever data is stored as key-value pairs, where values can be added, retrieved, and deleted using keys. 

If the hash map does not contained the key used for the search, its get method returns a null reference.So removing what with a null existence key also returns null

Using a hash map requires the import java.util.HashMap; statement at the beginning of the class.

Two type parameters are required when creating a hash map - the type of the key and the type of the value added. If the keys of the hash map are of type string, and the values of type integer, e.g the hash map is created with the following statement HashMap<String, Integer> hashmap = new HashMap<>();
Adding to the hash map is done through the put(*key*, *value*) method that has two parameters, one for the key, the other for the value. Retrieving from a hash map happens with the help of the get(*key*) method that is passed the key as a parameter and returns a value.

Hash Map Keys Correspond to a Single Value at Most
The hash map has a maximum of one value per key. If a new key-value pair is added to the hash map, but the key has already been associated with some other value stored in the hash map, the old value will vanish from the hash map.
A Reference Type Variable as a Hash Map Value. HashMap can have reference type (e.g Objects, String, Array and co) as value.

## When Should Hash Maps Be Used?

The hash map is implemented internally in such a way that searching by a key is very fast. The hash map generates a "hash value" from the key, i.e. a piece of code, which is used to store the value of a specific location. When a key is used to retrieve information from a hash map, this particular code identifies the location where the value associated with the key is. In practice, it's not necessary to go through all the key-value pairs in the hash map when searching for a key; the set that's checked is significantly smaller. We'll be taking a deeper look into the implementation of a hash map in the Advanced Programming and Data Structures and Algorithms courses. Unlike List that search would happen by iterating over the list. 

Consider the performance of the program. Java's System.nanoTime() method returns the time of the computer in nanoseconds.
With ten million books, it takes almost a second to find two books. Of course, the way in which the list is ordered has an effect. If the book being searched was first on the list, the program would be faster. On the other hand, if the book were not on the list, the program would have to go through all of the books in the list before determining that such book does not exist.
It took about 0.4 milliseconds to search for two books out of ten million books with the hash map. The difference in performance in our example is over a thousandfold.
The difference in performance is due to the fact that when a book is searched for in a list, the worst-case scenario involves going through all the books in the list. In a hash map, it isn't necessary to check all of the books as the key determines the location of a given book in a hash map. The difference in performance depends on the number of books - for example, the performance differences are negligible for 10 books. However, for millions of books, the performance differences are clearly visible.
Hash maps work well when we know exactly what we are looking for. If we wanted to identify books whose title 

contains a particular string(When the title is used as key), the hash map would be of little use.
The hash maps also have no internal order, and it is not possible to search the hash map based on the indexes. The items in a list are in the order they were added to the list. Reason why we can use for lopp, while and other loop with list and also get item at index.
Hash maps are used when we want to identify items based on a key.
Typically, hash maps and lists are used together. The hash map provides quick access to a specific key or keys, while the list is used, for instance, to maintain order.

Hashmap can also be used as an Instance Variable for a class

Sometimes searching with string can be problematic e.g in that the book's spelling format must be remembered accurately. Someone may search for a book with a lowercase letter, while another may, for example, enter a space to begin typing a name. We make use of the tools provided by the String-class to handle strings. The toLowerCase() method returns a new string with all letters converted to lowercase. We also have the trim() method, on the other hand, creates a new string where empty characters such as spaces at the beginning and end have been removed.

The containsKey method of the hash map is being used above to check for the existence of a key. The method returns true if any value has been added to the hash map with the given key. Otherwise, the method returns false.
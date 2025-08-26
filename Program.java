import java.util.HashMap;

public class Program {
    /**prints all the keys in the hashmap given as a parameter */
    public static void printKeys(HashMap<String,String> hashmap){
        for (String key : hashmap.keySet()) {
            System.out.println(key);
        }
    }

    /**prints the keys in the hashmap given as a parameter, which contain the string given as a parameter. */
    public static void printKeysWhere(HashMap<String,String> hashmap, String text){
        for (String key : hashmap.keySet()) {
            if(key.contains(text)){
                System.out.println(key);
            }
        }
    }

    /**Prints the values in the given hashmap which is keys contain the given string. */
    public static void printValuesOfKeysWhere(HashMap<String,String> hashmap, String text){
        for (String key : hashmap.keySet()) {
            if(key.contains(text)){
               System.out.println(hashmap.get(key)); 
            }
        }
    }
}

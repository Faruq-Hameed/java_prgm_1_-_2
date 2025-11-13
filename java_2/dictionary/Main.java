package dictionary;

public class Main {
    public static void main(String[] args) {
        SaveableDictionary dictionary = new SaveableDictionary();
        dictionary.add("hello", "hola");
        dictionary.add("Good", "oda");
        dictionary.add("morning", "owuro");
        dictionary.add("night", "ale");
        dictionary.add("eat", "jeun");
        
        System.out.println(dictionary.translate("night"));
        System.out.println(dictionary.translate("nighted"));
    }
}

package dictionary;

public class Main {
    public static void main(String[] args) {
        // System.out.println(System.getProperty("user.dir"));

        // SaveableDictionary dictionary = new SaveableDictionary();

        // dictionary.add("hello", "hola");
        // dictionary.add("Good", "oda");
        // dictionary.add("morning", "owuro");
        // dictionary.add("night", "ale");
        // dictionary.add("eat", "jeun");

        // System.out.println(dictionary.translate("night"));
        // System.out.println(dictionary.translate("nighted"));

        // SaveableDictionary dictFromFile = new
        // SaveableDictionary("./dictionary/words.txt");
        // boolean isLoaded = dictFromFile.load();
        // System.out.println(isLoaded);
        // System.out.println(dictFromFile.translate("iwe"));
        // dictFromFile.printDictionary();
        SaveableDictionary s = new SaveableDictionary();
        s.add("apina", "monkey");
        s.add("tietokone", "computer");
        s.delete("apina");
        System.out.println(s.translate("computer"));
        System.out.println(s.translate("tietokone"));
        // expected:<tietokone> but was:<null>
    }
}

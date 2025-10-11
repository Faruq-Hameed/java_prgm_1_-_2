package part_9;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SampleB {

    public static void main(String[] args) {
        Map<String, String> translations = new HashMap<>();

        translations.put("good morning", "ekaro");
        translations.put("good afternoon", "ekasan");
        translations.put("good night", "ekale");
        translations.put("good evening", "ekale");

        Set<String> keys = translations.keySet();
        Collection<String> keyCollection = keys;
        for(String key: keys){
            System.out.println(key);
        }
        for(String key: keyCollection){
            System.out.println(key);
        }
        Collection<String> values = translations.values();
        System.out.println(keys.contains("good night"));
        System.out.println(keys);
    }
}

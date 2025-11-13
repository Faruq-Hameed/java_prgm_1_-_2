package dictionary;

import java.util.HashMap;
import java.util.Map;

public class SaveableDictionary {
    private Map<String, String> dictionary;
    private String file;

    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this.dictionary = new HashMap<>();
        this.file = file;
    }

    public boolean load() {
      try {
          // code to load the dictionary from the file
          
          return true;
      } catch (Exception e) {
          return false;
      }
    }

    public void add(String words, String translation) {
        if (!this.dictionary.containsKey(words)) { // only add the word if it does not already exist
            this.dictionary.put(words, translation);
        }
    }

    public String translate(String word) {
        return this.dictionary.get(word);
    }

}

package dictionary;

import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

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
        try (Scanner reader = new Scanner(Paths.get(this.file))) {
            // code to load the dictionary from the file
            while (reader.hasNextLine()) {
                String[] row = reader.nextLine().split(":");// e.g ekaro:morning
                this.add(row[1], row[0]); // add(morning, ekaro)
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void add(String words, String translation) {
        if (!this.dictionary.containsKey(words)) { // only add the word if it does not already exist
            this.dictionary.put(words, translation);
        }
    }

    public String translate(String word) {
        if (dictionary.containsKey(word)) {
            return dictionary.get(word);
        }

        return dictionary.entrySet()// this make MAp streamable
                .stream()
                .filter(entry -> entry.getValue().equals(word))
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);

    }

    public void delete(String word) {
        if (dictionary.containsKey(word)) { //if the key is there remove straight
            dictionary.remove(word);
        } else if (dictionary.containsValue(word)) //since the translation has to be ones then
            for (Map.Entry<String, String> e : dictionary.entrySet()) {
                if (e.getValue().equals(word)) { //
                    dictionary.remove(e.getKey());// remove safely
                    break;
                }

            }
    }

    public void printDictionary() {
        for (String word : dictionary.keySet()) {
            System.out.println(word + " : " + dictionary.get(word));
        }
    }

    public boolean save() {
        try (PrintWriter writer = new PrintWriter(this.file)) {

            for (String word : this.dictionary.keySet()) {
                String row = word + ":" + dictionary.get(word);
                writer.println(row);

            }
            return true;
        } catch (Exception e) {
            return false;
            // TODO: handle exception
        }

    }

}

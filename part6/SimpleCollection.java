
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    @Override
    // @Override
    public String toString() {
        if (elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }

        String response;
        if (elements.size() == 1) {
            response = "The collection " + this.name + " has 1 element:\n";
        } else {
            response = "The collection " + this.name + " has " + elements.size() + " elements:\n";
        }

        String joined = String.join("\n", elements);
        return response + joined;
    }

    // public String toString() {
    // String response = "The collection " + this.name + " is empty.";
    // String element = " element:";
    // String names = "";
    //
    // int size = elements.size();
    // if (size <= 0) {
    // return response;
    // }
    // if (size == 1) {
    // response = "The collection " + this.name + " has " + size + " element: \n";
    // } else {
    // response = "The collection " + this.name + " has " + size + " elements:\n";
    // }
    // for (int i = 0; i < size; i++) {
    // if (i == 0) {
    // names = elements.get(i);
    // } else {
    // names += "\n" + elements.get(i);
    // }
    // }
    // return response + names;
    // }
}

import java.util.HashMap;
import java.util.Map;

public class Printer {

    public void printManyTimes(Object object, int times) {
        int i = 0;

        while (i < times) {
            System.out.println(object.toString());
            i++;
        }
    }

    public void printCharacters(CharSequence charSequence) {
        int i = 0;
        while (i < charSequence.length()) {
            System.out.println(charSequence.charAt(i));
            i = i + 1;
        }
    }

    public static void main(String[] args) {
        Printer printer = new Printer();
        String greeting = "hello";
        printer.printManyTimes(greeting, 5);
        Map<String, String> map = new HashMap<>();
        map.put("h", greeting);
        map.put("g", "good morning");
        map.put("a", "good afternoon");
        map.put("e", "good evening");

        printer.printManyTimes(map, 5);
        printer.printCharacters(map.get("e"));
    }
}

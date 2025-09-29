import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Factory {

    public Factory() {
    };// though not needed since it is an empty constructor

    // public Packable produceNew() {
    //     // The Random-object used here can be used to draw random numbers.
    //     Random ticket = new Random();
    //     int number = ticket.nextInt(4); // btw 0 to 4;

    //     if (number == 0) {
    //         return new CD("Artist0", "name1", 1901);
    //     } else if (number == 1) {
    //         return new CD("Artist1", "name1", 1901);
    //     } else if (number == 2) {
    //         return new CD("Artist2", "name2", 1902);
    //     } else if (number == 3) {
    //         return new CD("Artist3", "name3", 1903);
    //     } else {
    //         return new CD("Artist4", "name2", 1904);
    //     }
    // }

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("added");
        strings.add("added2");
        System.out.println(strings);
        String[] strings2 = {"sjj", "ksjj"};
        strings2[1] = "hello";
        System.out.println(strings2.toString());

    }
}

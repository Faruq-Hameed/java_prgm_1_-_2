package Part1_1_to_3;
public class Printer {
    public static void main(String[] args) {
        String text = "first second third fourth";
        String[] splitted = text.split("o");
        for (String word : splitted) {
            System.out.println(word);
        }
        String[] array = {"apple", "orange"};
       
    }

       public static void printOldest(int[] ages) {
        int oldest = -1;
        int counter = 0;

        while (counter> oldest) {
            if (ages[counter] > oldest) {
                oldest = ages[counter];
            }
            counter++;
        }
        System.out.println(oldest);

    }
}

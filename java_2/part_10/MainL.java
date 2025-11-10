package part_10;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MainL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Literature> literatureList = new ArrayList<>();

        while (true) {
            System.out.println("Input the name of the book, empty stops:");

            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            System.out.println("Input the age recommendation:");
            int age = Integer.valueOf(scanner.nextLine());

            literatureList.add(new Literature(name, age));

        }
        System.out.println(literatureList.size() + " books in total.");
        System.out.println("Books");

        Comparator<Literature> comparator = Comparator
                .comparing(Literature::getAge) //primarily order by age
                .thenComparing(Literature::getName); //then order by name

        // literatureList.sort(comparator); //sort the list using the comparator [Preferred in modern Java]
        Collections.sort(literatureList, comparator);
        for (Literature literature : literatureList) {
            System.out.println(literature);
        }
    }
}

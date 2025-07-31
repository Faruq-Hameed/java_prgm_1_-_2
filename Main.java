import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Person faruq = new Person("faruq", 30, 1.8, 55.5);

        Person emptyPerson = new Person();

        System.out.println(faruq.toString());
        System.out.println(emptyPerson.toString());

        System.out.println("________________________________________");

        Product fullProduct = new Product("honey", "ibadan", 50);

        Product yam = new Product("yam", 10);

        Product pen = new Product("pen");

        System.out.println(fullProduct);
        System.out.println(yam);
        System.out.println(pen);

        String faruqB = "faruq";
        ArrayList<String> list = new ArrayList<>();
        list.add(faruqB);
        System.out.println(list);

        int[] listB = new int[5];

        listB[4] = 4;
        char ch = '\u263A';
        System.out.println(ch);

        System.out.println(listB);
    }
}

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Person faruq = new Person("faruq", 30, 18, 55.5);

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
        listB = null;
        // listB.toString(); java.lang.NullPointerException
        System.out.println(listB);

        System.out.println(
                "________________________________________" + " \n" + "________________________________________");

        SimpleDate faruqBirthDay = new SimpleDate(01, 10, 1995);
        Person faruqBd = new Person("faruq", faruqBirthDay);

        Person akaPerson = new Person("aka", 02, 10, 2021);

        System.out.println(akaPerson.toString());
        System.out.println(faruqBd.toString());

        LocalDate date = LocalDate.now();
        int day = date.getDayOfMonth();
        int month = date.getMonthValue();
        int year = date.getYear();
        int week = date.getDayOfWeek().getValue();
        int dayOfYear = date.getDayOfYear();
        // faruq.height
        faruq.olderPerson(akaPerson);

        System.out.println(
                "today is  " + day + "." + month + "." + year + " week is " + week + "day of the year is " + dayOfYear);
        // System.out.println("today is " + day + "." + month + "." + year +
        Apartment a1 = new Apartment(10, 50, 100);
        Apartment a2 = new Apartment(40, 500, 40);
        System.out.println(a1.largerThan(a2));
        System.out.println(a2.priceDifference(a1));

        System.out.println("________________________ \n __________________________");
        System.out.println(a1.equals(a2));
    }
}

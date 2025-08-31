import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Examples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        HashMap<String, String> postCodes = new HashMap();
        ArrayList<String> list = new ArrayList<>();
        int[] arr = { 1, 3 };

        postCodes.put("1", "ibadan");
        list.add(postCodes.get("1"));

        postCodes.put("2", "akure");

        // System.out.println(postCodes.toString());
        System.out.println(postCodes);
        System.out.println(list);
        System.out.println("Array is : " + arr);
        postCodes.remove("2");
        System.out.println(postCodes);
        System.out.println(postCodes.containsValue("ibadan"));
        System.out.println(postCodes.containsValue("akure"));
        System.out.println(postCodes.get("3"));
        System.out.println(postCodes.remove("3"));
        postCodes.put("2", "eko");
        postCodes.put("2", "Eko");
        postCodes.put("2", "eko");

        System.out.println(postCodes.get("2"));
        System.out.println(postCodes.remove("2"));
        System.out.println(postCodes.get("2"));

    }
}

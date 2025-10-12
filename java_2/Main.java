public class Main {
    
    public static void main(String[] args) {
        // You can test your classes here
        String greeting = "Hello world";
        System.out.println("greeting is: " + greeting);

        Object greeting2 = "I am fine";

        // greeting=greeting2;
        greeting=(String) greeting2;
        System.out.println("greeting is: " + greeting);

        String name = "faruq";
        name="hameed";
        String name2 = name.substring(0, 3);

        System.out.println(name2);
        name =new String(null);
        System.out.println(name);
    }
}

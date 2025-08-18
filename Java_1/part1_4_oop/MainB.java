package part1_4_oop;
public class MainB {
    private String name;
    private int age;
    private int[] levels;

    public static void main(String[] args) {
        MainB newMain = new MainB();
        System.out.println("Main name is " + newMain.name + ". age is " + newMain.age + " level is " + newMain.levels);
        System.out.println(newMain);
        String namer = "faruq";
        System.out.println("initial namer is " + namer);

        String str = namer;
        System.out.println("initial str is " + str);

        // System.out.println(namer.charAt(0));
        str = "faruq-aseda";
        System.out.println("final namer is " + namer);
        System.out.println("final str is " + str);

        System.out.println("str is " + str);

        // changeString(namer);
        // System.out.println(namer);
    }

    public static void changeString(String text){
        text +=" hello";
    }



}
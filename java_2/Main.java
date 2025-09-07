
public class Main {
    public static void main(String[] args) {
        Person faruq = new Person("Faruq", 30);
        Person faruq2 = new Person("Faruq", 30);
        Person aseda = faruq;
        System.out.println("faruq :" + faruq + " " + "faruq2 : " + faruq2 + " " + "aseda :" + aseda);
        System.out.println(faruq.equals(faruq2));
        System.out.println(faruq.equals(aseda));
        System.out.println(faruq.getClass());
    }
}

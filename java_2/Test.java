public class Test {

    public static void main(String[] args) {
        Warehouse w = new Warehouse();
        w.addProduct("milk", 3, 10);
        w.addProduct("coffee", 5, 7);
        System.out.println(w.stock("milk"));
    }

}

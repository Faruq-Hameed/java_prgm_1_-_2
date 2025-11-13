import java.util.Random;

public class Show {
    private String movie;
    private String time;

    public static void main(String[] args) {
        System.out.println("" + generateNum());
    }

    private static int generateNum() {
        return new Random().nextInt(-30, 0);
    }
}

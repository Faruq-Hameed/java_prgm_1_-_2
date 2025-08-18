package Tests;

public class Star {
    private String star;

    public Star() {
        this.star = "";
    }

    public void print(int number) {
        star = "";
        for (int i = 0; i < number; i++) {
            star += "*";
        }
        System.out.print(star);
    }
}

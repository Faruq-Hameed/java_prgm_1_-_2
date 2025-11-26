package part_12;

import java.util.Random;

public class Die {

    private Random random;
    private int numberOfFaces;

    public Die(int numberOfFaces) {
        this.random = new Random();
        this.numberOfFaces = numberOfFaces;
        // Initialize the value of numberOfFaces here
    }

    public int throwDie() {
        // generate a random number which may be any number
        // between one and the number of faces, and then return it

        int temperature = this.random.nextInt(this.numberOfFaces + 1);

        return temperature != 0 ? temperature : 1;
    }
}

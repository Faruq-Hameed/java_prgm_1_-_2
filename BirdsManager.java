import java.util.ArrayList;
import java.util.Scanner;

public class BirdsManager {
    private ArrayList<Bird> birds; // list of birds

    public BirdsManager() {
        this.birds = new ArrayList<Bird>();
    }

    public void addBird(Bird bird) {
        this.birds.add(bird);
    }

    public void observe(Bird bird) {
        // loop through the list of birds
        // find the bird in the list and call its observe method. Note bird is an object
        // of Bird class so we are searching for refernce too
        for (Bird currentBird : birds) {
            // check if the current and the bird points to the same memory location
            if (bird.equals(currentBird)) {
                bird.observe();
                return;
            }
        }
    }

    // print all birds in the list
    // use the toString method of the Bird class
    public void printAll() {
        for (Bird bird : birds) {
            System.out.println(bird);
        }
    }

    public Bird findBird(String name) {
        for (Bird bird : birds) {
            if (bird.getName().equals(name)) {
                bird.observe();
                return bird;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        BirdsManager manager = new BirdsManager();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("?");
            String command = scanner.nextLine();
            if (command.equals("Quit")) {
                break;
            }
            if (command.equals("Add")) {
                System.out.println("Name:");
                String name = scanner.nextLine();
                System.out.println("Name in Latin:");
                String latinName = scanner.nextLine();
                Bird bird = new Bird(name, latinName);
                manager.addBird(bird);
            }
            if (command.equals("Observation")) {
                System.out.println("Bird?");
                String name = scanner.nextLine();
                Bird bird = manager.findBird(name);
                if (bird == null) {
                    System.out.println("Not a bird!");
                } else {
                    bird.observe();
                }
            }
            if (command.equals("All")) {
                manager.printAll();
            }
            if (command.equals("One")) {
                System.out.println("Bird?");
                String name = scanner.nextLine();
                Bird bird = manager.findBird(name);
                if (bird == null) {
                    System.out.println("Not a bird!");
                } else {
                    System.out.println(bird);
                }
            }
        }
    }
}

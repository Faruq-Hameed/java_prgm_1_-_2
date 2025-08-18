package part7;
import java.util.Scanner;

public class Container {
    private int first;
    private int second;

    public Container() {
        this.first = 0;
        this.second = 0;
    }

    public int contains() {
        return this.first + this.second;
    }

    public void add(int amount) {

        if (this.first + amount <= 100 && amount > 0) {
            this.first = this.first + amount;
        }
        else if (this.first + amount >= 100) {
            this.first = 100;
        }

    }
    public void move(int amount) {
        int amountToAdd = moveFromFirst(amount);
        System.out.println("amountToAdd is " + amountToAdd);
        if ((this.second + amountToAdd) < 100) {
            this.second = this.second + amountToAdd;
        } else {
            this.second = 100;
        }
        System.out.println("After moving : " + this.second);
    }

    /** Adjust the first container to the given amount. and set to 0 if negative */
    public int moveFromFirst(int amount) {
        int newAmount = this.first - amount;
        if (newAmount > 0) {
            this.first = newAmount;
            return amount;
        } else {
            int amountToAdd = this.first;
            this.first = 0;
            return amountToAdd;
        }
    }

    public void remove(int amount) {
        // if amount is lesser then remove
        if (this.second >= amount) {
            this.second -= amount;
        } else { // else empty th second container
            this.second = 0;
        }
    }

    // // @Override
    // public void print() {
    //     System.out.println("First: " + this.first + "/100");
    //     System.out.println("Second: " + this.second + "/100");
    // }

    // public static void main(String[] args) {
    //     Scanner scanner = new Scanner(System.in);
    //     LiquidContainers containers = new LiquidContainers();
    //     // String input ="add 5 \n" + "add 20 \n" + "";
    //     while (true) {
    //         String input = scanner.nextLine();
    //         if (input.equals("quit")) {
    //             break;
    //         }
    //         String[] inputContent = new String[2];
    //         inputContent = input.split(" ");
    //         String command = inputContent[0];
    //         int amount = Integer.parseInt(inputContent[1]);

    //         switch (command) {
    //             case "add":
    //                 containers.add(amount);
    //                 containers.print();
    //                 break;
    //             case "remove":
    //                 containers.remove(amount);
    //                 containers.print();
    //             case "move":
    //                 containers.move(amount);
    //                 containers.print();
    //             default:
    //                 continue;
    //             // break;
    //         }
    //     }
    // }

}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
import java.util.Scanner;

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary simpleDictionary;

    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
    }

    public void start() {
        while (true) {
            System.out.println("Command:");

            String command = this.scanner.nextLine();

            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (command.equals("add")) {
                String word = this.scanner.nextLine();
                String translation = this.scanner.nextLine();
                this.simpleDictionary.add(word, translation);
                continue;
            } else if (command.equals("search")) {
                String word = this.scanner.nextLine();
                String translate = this.simpleDictionary.translate(word);
                if (translate == null) {
                    System.out.println("Word " + word + " was not found");
                }
            } else {
                System.out.println("Unknown command");
            }
        }
        return;

    }
}

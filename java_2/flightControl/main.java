package flightControl;

import java.util.Scanner;

import flightControl.logic.FlightControl;
import flightControl.ui.TextUI;

public class main {
    public static void main(String[] args) {
        System.out.println("Program started ...");
        Scanner scanner = new Scanner(System.in);
        FlightControl flightControl = new FlightControl();
      TextUI textUi =  new TextUI(scanner, flightControl);
      textUi.start();
      scanner.close();
        System.out.println("Completed");
    }
}

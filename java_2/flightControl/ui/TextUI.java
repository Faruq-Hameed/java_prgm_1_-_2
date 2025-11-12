package flightControl.ui;

import java.util.Scanner;

import flightControl.domain.Airplane;
import flightControl.domain.Flight;
import flightControl.domain.Place;
import flightControl.logic.*;

public class TextUI {
    private Scanner scanner;
    private FlightControl flightControl;

    public TextUI() {
        this.flightControl = new FlightControl();
        this.scanner = new Scanner(System.in);
    }

    // private Scanner scanner;
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);

    }

    public void AirportAssetControl() {

        while (true) {
            // Scanner scanner = new Scanner(System.in);

            System.out.println("Choose an action:");

            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[x] Exit Airport Asset Control");

            int action = Integer.valueOf(this.scanner.nextLine());
            switch (action) {
                case 1:
                    System.out.println("Give the airplane id:");
                    String id = this.scanner.nextLine();
                    System.out.println("Give the airplane capacity:");
                    String capacity = this.scanner.nextLine();
                    flightControl.addAirplane(id, action);
                    break;
                case 2:
                    System.out.println("Give the airplane id:");
                    String airplaneId = this.scanner.nextLine();
                    Airplane airplane = flightControl.getAirplane(airplaneId);

                    System.out.println("Give the departure airport id:");
                    String departureId = this.scanner.nextLine();
                    System.out.println("Give the target airport id:");
                    String targetId = this.scanner.nextLine();

                    flightControl.addFlight(airplane, departureId, targetId);
                    break;
                default:
                    break;
            }
        }

    }
}
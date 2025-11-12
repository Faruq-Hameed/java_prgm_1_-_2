package flightControl.ui;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

import flightControl.domain.Airplane;
import flightControl.domain.Flight;
import flightControl.domain.Place;
import flightControl.logic.FlightControl;

public class TextUI {
    private Scanner scanner;
    private FlightControl flightControl;

    public TextUI(Scanner scanner, FlightControl flightControl) {
        this.flightControl = flightControl;
        this.scanner = scanner;
    }

    // private Scanner scanner;
    public void start() {
        System.out.println("text ui started");
        startAirportAssetControl();
        System.out.println();
        startFlightControl();
        System.out.println("text ui closed");
        return;
        // Scanner scanner = new Scanner(System.in);

    }

    public void startAirportAssetControl() {

        System.out.println("Airport asset control started");
        System.out.println("_________________________________________");
        System.out.println("_________________________________________");

        while (true) {
            System.out.println("Choose an action:");

            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[x] Exit Airport Asset Control");

            String action = this.scanner.nextLine();
            if (action.equals("1")) {
                addAirplane();
            } else if (action.equals("2")) {
                addFlight();
            } else {
                break;
            }
        }

    }

    void addAirplane() {
        System.out.println("Give the airplane id:");
        String id = this.scanner.nextLine();

        System.out.println("Give the airplane capacity:");
        int capacity = Integer.valueOf(this.scanner.nextLine());

        flightControl.addAirplane(id, capacity);
    }

    void addFlight() {
        System.out.println("Give the airplane id:");
        String airplaneId = this.scanner.nextLine();
        Airplane airplane = flightControl.getAirplane(airplaneId);

        System.out.println("Give the departure airport id:");
        String departureId = this.scanner.nextLine();
        System.out.println("Give the target airport id:");
        String targetId = this.scanner.nextLine();

        flightControl.addFlight(airplane, departureId, targetId);
    }

    public void startFlightControl() {
        System.out.println("flight asset control started");
        System.out.println("_________________________________________");
        System.out.println("_________________________________________");
        while (true) {
            System.out.println("Choose an action:");
            System.out.println("[1] Print airplanes");
            System.out.println("[2] Print flights]");
            System.out.println("[3] Print airplane details");
            System.out.println("[x] Quit");

            String action = this.scanner.nextLine();
            if (action.equals("1")) {
                printAirplanes();
            } else if (action.equals("2")) {
                printFlights();
            } else if (action.equals("3")) {
                printPlane();
            } else {
                break;
            }

        }
    }

    void printAirplanes() {
        ArrayList<Airplane> airplanes = new ArrayList<>();
        airplanes.addAll(this.flightControl.getAirplanes());
        for (Airplane airplane : airplanes) {
            System.out.println(airplane);
        }
    }

    void printFlights() {
        ArrayList<Flight> flights = new ArrayList<>();
        flights.addAll(this.flightControl.getFlights());
        for (Flight flight : flights) {
            System.out.println(flight);
        }
    }

    void printPlane() {
        System.out.println("Give the airplane id:");
        String id = this.scanner.nextLine();
        Airplane airplane = this.flightControl.getAirplane(id);
        System.out.println(airplane);
    }

}
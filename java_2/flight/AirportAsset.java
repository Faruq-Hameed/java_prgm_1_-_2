package flight;

import java.util.ArrayList;
import java.util.HashMap;

public class AirportAsset {
    private HashMap<String, Airplane> airplanes;
    private HashMap<Integer, Flight> flights;

    public AirportAsset() {
        this.airplanes = new HashMap<>();
        this.flights = new HashMap<>();
    }

    public void addAirplane(Airplane airplane) {
        this.airplanes.put(airplane.getId(), airplane);
    }

    public void printAirplanes() {
        for (Airplane airplane : this.airplanes.values()) {
            System.out.println(airplane);
        }
    }

    public void printAirplaneDetails(String id) {
        Airplane airplane = this.airplanes.get(id);
        System.out.println(airplane);
    }

    public void addFlight(Flight flight) {
        int hashCode = flight.hashCode();
        if (this.flights.containsKey(hashCode)) {
            System.out.println("Flight already exists.");
            return; // flight already exists
        }
        this.flights.put(flight.hashCode(), flight); // hashCode is unique computed using airplaneId, origin and target
    }

    public void printFlights() {
        for (Flight flight : this.flights.values()) {
            Airplane airplane = this.airplanes.get(flight.getAirplaneId());
            System.out.println(airplane + " " + flight.getOrigin() + "-" + flight.getTarget());
        }
    }
}

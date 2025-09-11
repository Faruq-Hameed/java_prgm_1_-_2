package part_8;

import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {

    private HashMap<LicensePlate, String> registry;

    public VehicleRegistry() {
        this.registry = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        // check if questioned license plate is already in the registry
        if (registry.containsKey(licensePlate)) {
            String licenseOwner = registry.get(licensePlate);
            // if it is, check if it does not have an owner yet and assign owner if it does
            // return false then
            if (licenseOwner == null) {
                registry.put(licensePlate, owner);
                return true;
            }
            return false;
        }
        // if it is not in the registry, add it with its owner and return true
        registry.put(licensePlate, owner);
        return true;
    }

    public String get(LicensePlate licensePlate) {
        return registry.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {
        boolean isLicenseRegistered = registry.containsKey(licensePlate);
        if (isLicenseRegistered) {
            registry.remove(licensePlate);
            return true;
        }
        return false;
    }

    public void printLicensePlates() {
        //
        for (LicensePlate licensePlate : registry.keySet()) {
            System.out.println(licensePlate);
        }

    }

    public void printOwners() {
        ArrayList<String> printedOwners = new ArrayList<>();

        for (String owner : registry.values()) {
            if (printedOwners.contains(owner)) {
                continue;
            }
            printedOwners.add(owner);
            System.out.println(owner);
        }
    }
}

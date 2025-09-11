
import java.util.HashMap;
import java.util.ArrayList;

public class StorageFacility {

    private HashMap<String, ArrayList<String>> storages;

    public StorageFacility() {
        this.storages = new HashMap<>();
    }

    public void add(String unit, String item) {
        storages.putIfAbsent(unit, new ArrayList<>());
        storages.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        ArrayList<String> unitsContents = storages.get(storageUnit);
        if (unitsContents == null || unitsContents.isEmpty()) {
            return new ArrayList<>();
        }
        return unitsContents;
    }

    public void remove(String storageUnit, String item) {
        ArrayList<String> unitsContents = storages.get(storageUnit);
        if (unitsContents == null || unitsContents.isEmpty()) {
            return;
        }
        unitsContents.remove(item);// remove one
        // If the storage unit would be empty after the removal, the method also removes
        // the unit.
        if (storages.get(storageUnit).isEmpty()) {
            storages.remove(storageUnit);
        }

    }
    // returns the names of the storage units(that are not empty) as a list

    public ArrayList<String> storageUnits() {
        ArrayList<String> unitNames = new ArrayList<>();
        for (String unit : storages.keySet()) {
            if (storages.get(unit).isEmpty()) {
                continue; // continue if empty unit
            }
            unitNames.add(unit);
        }
        return unitNames;
    }
}

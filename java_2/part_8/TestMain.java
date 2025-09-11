package part_8;
public class TestMain {
    public static void main(String[] args) {
        LicensePlate li1 = new LicensePlate("FI", "ABC-123");
        LicensePlate li2 = new LicensePlate("IB", "ABC-123");

        String owner = "Arto";
        String owner2 = "faruq";

        VehicleRegistry vr = new VehicleRegistry();
        vr.add(li1, owner);
        vr.add(li2, owner2);
        System.out.println(vr);
        System.out.println(vr.add(li1, owner));
        System.out.println(vr.add(li2, owner2));
        vr.printLicensePlates();
    }
}

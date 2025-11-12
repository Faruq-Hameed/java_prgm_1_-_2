package flight;

public class Flight {
    private String airplaneId;
    private String origin;
    private String target;

    public Flight(String airplaneId, String origin, String target) {
        //check if the airplane Id is valid i.e is in the Airplane asset list
        this.airplaneId = airplaneId;
        this.origin = origin;
        this.target = target;
    }

        public String getAirplaneId() {
            return airplaneId;
        }

        public String getOrigin() {
            return origin;
        }

        public String getTarget() {
            return target;
        }


    @Override
    public String toString() {
        // Airplane a
        return this.airplaneId + " (" + this.origin + "-" + this.target + ")";
    }

    @Override
    public int hashCode() {
        String combined = this.airplaneId + this.origin + this.target;
        return combined.hashCode();
    }


}

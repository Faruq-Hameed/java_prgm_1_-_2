package part_10;
public enum Colors {
    // constructor parameters are defined as
    // the constants are enumerated
    RED("#FF0000"),
    GREEN("#00FF00"),
    BLUE("#0000FF");

    private String code; //// object reference variable

    private Colors(String code) { // constructor which must be private
        this.code = code;
    }

    public String getCode() {
        return this.code;
    }

    public static void main(String[] args) {
        System.out.println(Colors.GREEN); //GREEN
        System.out.println(Colors.GREEN.getCode()); //#00FF00
    }
}
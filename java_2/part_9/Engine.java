package part_9;
public class Engine extends Part {
    private String engineType;

    public Engine(String engineType, String identifier, String manufacturer, String description) {
       super(identifier, manufacturer, description);
       this.engineType = engineType;
    }
}

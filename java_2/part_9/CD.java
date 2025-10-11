package part_9;
public class CD implements Packable {
    private String artist;
    private String name;
    private int publication;

public CD ( String artist, String name, int publication){
    this.artist= artist;
    this.name = name;
    this.publication= publication;
}

    public double weight() {
        return 0.0;
    }
}
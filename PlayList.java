import java.lang.reflect.Array;
import java.util.ArrayList;

public class PlayList {
    private ArrayList<String> songs;

    public PlayList() {
        this.songs = new ArrayList<String>();
    }

    public void addSong(String song) {
        this.songs.add(song);
    }

    public void removeSong(String song) {
        this.songs.remove(song);
    }

    public void printList() {
        for (String song : songs) {
            System.out.println(song);
        }
    }

}

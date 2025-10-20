package part_9;
import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable {
    private List<Movable> herds;

    public Herd() {
        this.herds = new ArrayList<>();
    }

    public void addToHerd(Movable movable) {
        herds.add(movable);
    }

    public void move(int dx, int dy) {
        int size = herds.size();
        int i = 0;
        while (i < size) {
            Movable herd = herds.get(i); // get the herd at index i
            herd.move(dx, dy); // move the herd
            herds.set(i, herd); // set the herd value to updated values
            i++;
        }
        // for (Movable movable : herds) {
        // herds.set(dy, movable)
        // }
    }

    @Override
    public String toString() {
        String list = "";
        // for (Movable movable : herds) {
        // list += movable.toString() + "\n";
        // }
        int size = herds.size();
        int i = 0;
        while (i < size) {
            if (i + 1 == size) {
                list += herds.get(i).toString();
            } else {
                list += herds.get(i).toString() + "\n";
            }
            i++;
        }
        return list;
    }
}
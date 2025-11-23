import java.util.ArrayList;

public class List<T> {
    private T[] list;
    private int nextFreeIndex;

    public List() {
        this.list = (T[]) new Object[10]; // we must type cast since all object are subclass of base Obj
        // default list size is set to 10
        this.nextFreeIndex = 0;
    }

    public void add(T value) {
        if (this.size() == nextFreeIndex) { // if the list is full then grow
            grow();
        }
        this.list[nextFreeIndex] = value;
        this.nextFreeIndex++;
    }

    public void grow() {
        int newLength = this.list.length + this.list.length / 2; // getting new length
        T[] newList = (T[]) new Object[newLength];// create new list with an higher length
        for (int i = 0; i < list.length; i++) {
            newList[i] = this.list[i];// copying the value
        }
        this.list = newList; // the old list has been replaced
    }

    // getting the size
    public int size() {
        return this.nextFreeIndex;
    }

    public int indexOfValue(T value) {
        for (int i = 0; i < this.nextFreeIndex; i++) {
            if (list[i].equals(value)) {
                return i; // return the index if found
            }
        }
        return -1; // return -1 if not found
    }

    public boolean contains(T value) {
        return indexOfValue(value) >= 0;// if it is not negative then it is there
    }

    public void remove(T value) {
        int index = indexOfValue(value);
        if (index < 0) {
            return;
        }
        moveToLeft(index);
        // next free index will be reduced by 1
        this.nextFreeIndex--;

    }

    public void moveToLeft(int startIndex) {
        // move item in the next index to previous starting from the index above
        for (int i = startIndex; i < this.nextFreeIndex - 1; i++) {
            this.list[i] = this.list[i + 1];
        }
    }

    public T value(int index) {
        if (index < 0 || index >= nextFreeIndex) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + " outside of [0, " + this.nextFreeIndex + "]");

        }
        return this.list[index];
    }

    public static void main(String[] args) {
        List<String> myList = new List<>();
        System.out.println(myList.contains("hello"));
        myList.add("hello");
        System.out.println(myList.contains("hello"));
        int index = myList.indexOfValue("hello");
        System.out.println(index);
        System.out.println(myList.value(index));
        myList.remove("hello");
        System.out.println(myList.contains("hello"));
    }
}
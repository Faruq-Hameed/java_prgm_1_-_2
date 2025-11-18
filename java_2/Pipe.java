import java.util.ArrayList;

public class Pipe<T>{
    private ArrayList<T> values;

    public Pipe(){
        this.values = new ArrayList<>();

    }

    public void putIntoPipe(T value){
        this.values.add(value); //append
    }

    public T takeFromPipe(){
        if(this.values.isEmpty()){
            return null;
        }
        return this.values.remove(0);
    }

    public boolean isInPipe(){
        return !this.values.isEmpty();
    }

    public static void main(String[] args) {
        String[] str = new String[]{"second", "third"};

    }
}
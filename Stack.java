import java.util.ArrayList;

public class Stack {

    private ArrayList<String> stack;

    public Stack() {
        this.stack = new ArrayList<String>();
    }

    public boolean isEmpty() {
        return stack.isEmpty();

    }

    public ArrayList<String> values(){
        return stack;
    }

    public String take(){
        // int index = stack.size() -1;
        return stack.remove(stack.size() -1);
    //    return stack.get(stack.size() -1);
    }

}

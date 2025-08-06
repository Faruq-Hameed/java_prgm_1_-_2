import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> tasks;

    public TodoList() {
        this.tasks = new ArrayList<>();
    }

    public void add(String task) {
        this.tasks.add(task);
    }

    public void print() {
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ": " + tasks.get(i));
        }
    }

    public int getTaskIndex(String task) {
        int taskIndex = -1;
        for (int i = 1; i <= tasks.size(); i++) {
            if (tasks.get(i).equals(task)) {
                taskIndex = i;
            }
        }
        return taskIndex;
    }

    public void remove(int number) {
        if (tasks.size() >= 1) {
            tasks.remove(number - 1);
        }
    }

}

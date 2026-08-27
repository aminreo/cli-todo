
import java.util.ArrayList;
import java.util.List;

public class  todoApp {
    private static List<String> tasks=new ArrayList<>();

    public static void main (String[] args ) {
        addTasks(args);

    }

    private static void addTasks(String[] args) {
        for (String arg : args) {
            tasks.add(arg);
            System.out.println("Task added: "+ arg);
        }
    }

}
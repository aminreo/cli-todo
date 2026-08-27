
import java.util.ArrayList;
import java.util.List;

public class  TodoApp {
    private static List<String> tasks=new ArrayList<>();

    public static void main (String[] args ) {
        addTasks(args);

    }

    private static void addTasks(String[] args) {
        for (String arg : args) {
            tasks.add(arg);
            printTaskAddedInfo(arg);
        }
    }

    private static void printTaskAddedInfo(String arg) {
        System.out.println("Task added: "+ arg);
    }

}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TodoApp {
    private static List<String> tasks = new ArrayList<>();

    public static void main(String[] args) {
        addTasks(args);

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("=== CLI To-Do App ===");

        while (running) {
            String input = scanner.nextLine().trim();
            if (input.isEmpty())
                continue;
            String[] parts = input.split("\\s+", 2);
            String command = parts[0].toLowerCase();
            String rest = parts.length > 1 ? parts[1] : "";

            switch (command) {
                case "list":
                    System.out.println(tasks);
                    break;
                case "exit":
                    System.out.println("Closing app...");
                    running = false;
                    break;
                default:
                    System.out.println("Unable to process: "+command +" " + rest);

            }

        }
        scanner.close();

    }

    private static void addTasks(String[] args) {
        for (String arg : args) {
            tasks.add(arg);
            printTaskAddedInfo(arg);
        }
    }

    private static void printTaskAddedInfo(String arg) {
        System.out.println("Task added: " + arg);
    }

}
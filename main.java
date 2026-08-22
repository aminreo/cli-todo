
import java.util.ArrayList;
import java.util.List;

public class  main {
    private static List<String> tasks=new ArrayList<String>();

    public static void main (String[] args ) {
        for (String arg : args) {
            tasks.add(arg);
            System.out.println("Task added: "+ arg);
        }

    }

}
package itmoTasks.Task6_2;

public class SubMainTask6_2 {
    public static void subMainTask6_2() {
        // Задание 6.2.1
        printNumberTask("6.2.1"); // method DRY
        StreamExample.runExample();

        // Задание 6.2.2
        printNumberTask("6.2.2");
        StudentExample.runExample();
    }

    static void printNumberTask(String task) {
        System.out.println();
        System.out.println("Задание " + task);
    }
}
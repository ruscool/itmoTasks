package itmoTasks.Task7_1;

public class PrintStatus {
    public void whatPrint(String status) {
        if (status.equals("before")) {
            System.out.println("До сортировки:");
        } else {
            System.out.println("\nПосле сортировки:");
        }
    }
}

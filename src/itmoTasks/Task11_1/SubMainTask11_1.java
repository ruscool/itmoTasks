package itmoTasks.Task11_1;

public class SubMainTask11_1 {
    public static void subMain() {
        TaskNumber numberTask = new TaskNumber();

        numberTask.printNumberTask("11.1.1");

        AgeCalculator age = new AgeCalculator();
        age.ageDetermination();

        numberTask.printNumberTask("11.1.2");

        EventScheduler newEvent =new EventScheduler();
        newEvent.findNextEvent();
    }
}
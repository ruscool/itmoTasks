package itmoTasks.Task8_1;

public class SubMainTask8_1 {
    public static void subMain() {
        TaskNumber numberTask = new TaskNumber();
        numberTask.printNumberTask("8.1");
        DayOfWeek monday = DayOfWeek.MONDAY;
        DayOfWeek saturday = DayOfWeek.SATURDAY;
        DayOfWeek sunday = DayOfWeek.SUNDAY;

        String question = " является ли день недели выходным? ";
        System.out.println(monday.getDayName() + question + monday.isWeekend()); // false
        System.out.println(saturday.getDayName() + question + saturday.isWeekend()); // true
        System.out.println(sunday.getDayName() + question + sunday.isWeekend()); // true


        numberTask.printNumberTask("8.2");
        for (UserRole role : UserRole.values()) {
            System.out.println(role + " авторизован? " + role.isAuthorized());
        }

    }
}
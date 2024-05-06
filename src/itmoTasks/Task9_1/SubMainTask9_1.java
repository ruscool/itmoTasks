package itmoTasks.Task9_1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class SubMainTask9_1 {
    public static void subMain() {
        TaskNumber numberTask = new TaskNumber();
        numberTask.printNumberTask("9.1.1");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату в формате день-месяц-год (например, 31-12-2020):");
        String inputDate = scanner.nextLine();

        try {
            LocalDate date = DateValidator.validateDate(inputDate);
            System.out.println("Введенная дата " + date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")) + " корректна.");
        } catch (InvalidDateException e) {
            System.out.println(e.getMessage());
        }
//        scanner.close();

        numberTask.printNumberTask("9.1.2");

        Scanner scanner2 = new Scanner(System.in);

        while (true) {
            System.out.println("Введите арифметическое выражение (формат: число оператор число): ");
            String input = scanner2.nextLine();

            try {
                double result = ArithmeticCalculator.evaluateExpression(input);
                System.out.printf("Результат: %.2f%n", result);
                break;
            } catch (ArithmeticException | IllegalArgumentException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }

        scanner.close();
    }
}

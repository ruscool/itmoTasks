package itmoTasks.Tasks2_6;

import java.util.Scanner;

public class TaskSubMain {
    public static void subMain() {
        Student student1 = new Student("Иван", 20);
        Student student2 = new Student("Мария", 22);
        Student student3 = new Student("Петр", 21);

        System.out.println("Задание 2.6.1");

        // Вывод количества созданных экземпляров класса Student
        System.out.println("Количество студентов: " + Student.getCount()); // Выведет: 3

        System.out.println("\nЗадание 2.6.2");
        double num1 = 10;
        double num2 = 5;

        // Вызов статических методов класса Calculator для выполнения математических операций
        double sum = Calculator.add(num1, num2);
        double difference = Calculator.subtract(num1, num2);
        double product = Calculator.multiply(num1, num2);
        double quotient = Calculator.divide(num1, num2);

        // Вывод результатов
        System.out.println("Сумма: " + sum); // Выведет: 15.0
        System.out.println("Разность: " + difference); // Выведет: 5.0
        System.out.println("Произведение: " + product); // Выведет: 50.0
        System.out.println("Частное: " + quotient); // Выведет: 2.0

        // 3
        System.out.println("\nЗадание 2.6.3");

        Scanner scanner = new Scanner(System.in);

        // Переменная final для хранения максимальной длины строки
        final int maxLength;

        // Ввод количества строк
        System.out.print("Введите количество строк: ");
        int numStrings = 0;
        try {
            numStrings = scanner.nextInt();
            scanner.nextLine(); // Очистка буфера
        } catch (Exception e) {
            System.out.println("Ошибка ввода. Пожалуйста, введите целое число.");
            scanner.close();
            return;
        }

        // Ввод и первоначальное присвоение значения переменной maxLength
        System.out.print("Введите первую строку: ");
        String firstString = scanner.nextLine();
        maxLength = firstString.length();

        // Переменная для хранения строки с максимальной длиной
        String maxString = firstString;

        // Цикл для ввода остальных строк и поиска максимальной длины
        for (int i = 1; i < numStrings; i++) {
            System.out.print("Введите строку " + (i + 1) + ": ");
            String currentString = scanner.nextLine();

            // Проверка длины текущей строки и обновление переменной maxString при необходимости
            if (currentString.length() > maxLength) {
                maxString = currentString;
            }
        }

        // Вывод максимальной длины и строки с максимальной длиной
        System.out.println("Максимальная длина строки: " + maxLength);
        System.out.println("Строка с максимальной длиной: " + maxString);

        scanner.close();

    }
}

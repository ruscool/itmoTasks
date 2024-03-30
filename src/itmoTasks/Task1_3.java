package itmoTasks;

import java.util.Scanner;

public class Task1_3 {
    public static void factorialCalculator() {
        int number = 5;

        long factorial = 1;

        for (int i = 1; i <= number; ++i) {
            factorial *= i;
        }
        System.out.println("1.3.1 Факториал числа " + number + " равен " + factorial);
    }

    public static void numberInput() {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Введите число: ");
            number = scanner.nextInt();
            if (number <= 0) {
                System.out.println("Вы ввели отрицательное число.");
            }
        } while (number <= 0);
        System.out.printf("1.3.2 Вы ввели положительное число " + number);
    }

    public static void sumOfMultiplies() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nВведите число для подсчета суммы от 1 до N: ");
        int number = scanner.nextInt();
        int sum = 0;
        int i = 1;

        while (i <= number) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += 1;
            }
            i++;
        }
        System.out.println("\n1.3.3 Сумма чисел от 1 до " + number + ",которые " +
                "делятся на 3 или 5 равна " + sum);
    }
}

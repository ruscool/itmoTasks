package itmoTasks;

import java.util.Scanner;

public class TaskOne{
    public static void TaskAreaCircle() {
        double radius = 5.0;
        final double PI = 3.14;

        double area = PI * radius * radius;
        System.out.printf("Площадь круга с радиусом " + radius + " равна, " + area + "\n");
    }
    public static void convertDegree() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите температуру в градусах Цельсия: ");

        double celsius = scanner.nextDouble();

        double fahrengeit = convertCelsiusToF(celsius);

        System.out.println("Температура в градусах Фаренгейта: " + fahrengeit + "\n");

    }

    public static double convertCelsiusToF(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void areaTriangle() {
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем длины сторон у пользователя
        System.out.println("Введите длины трех сторон треугольника:");
        System.out.print("Сторона 1: ");
        double side1 = scanner.nextDouble();
        System.out.print("Сторона 2: ");
        double side2 = scanner.nextDouble();
        System.out.print("Сторона 3: ");
        double side3 = scanner.nextDouble();

        // Вычисляем полупериметр
        double semiPerimeter = (side1 + side2 + side3) / 2;

        // Вычисляем площадь по формуле Герона
        double area = Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));

        // Выводим результат
        System.out.printf("Площадь треугольника: %.2f%n", area);

        scanner.close();
    }


}
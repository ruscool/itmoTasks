package itmoTasks.Tasks2_6;

public class Calculator {
    // Статический метод для сложения двух чисел
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    // Статический метод для вычитания одного числа из другого
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Статический метод для умножения двух чисел
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // Статический метод для деления одного числа на другое
    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Деление на ноль невозможно");
        }
        return num1 / num2;
    }
}
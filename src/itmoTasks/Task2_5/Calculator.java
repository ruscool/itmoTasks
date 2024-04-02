package itmoTasks.Task2_5;

public class Calculator {
    // Метод для сложения целых чисел
    public int add(int a, int b) {
        return a + b;
    }

    // Метод для сложения чисел с плавающей запятой
    public double add(double a, double b) {
        return a + b;
    }

    // Метод для вычитания целых чисел
    public int subtract(int a, int b) {
        return a - b;
    }

    // Метод для вычитания чисел с плавающей запятой
    public double subtract(double a, double b) {
        return a - b;
    }

    // Метод для умножения целых чисел
    public int multiply(int a, int b) {
        return a * b;
    }

    // Метод для умножения чисел с плавающей запятой
    public double multiply(double a, double b) {
        return a * b;
    }

    // Метод для деления целых чисел
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero!");
        }
        return a / b;
    }

    // Метод для деления чисел с плавающей запятой
    public double divide(double a, double b) {
        if (b == 0.0) {
            throw new ArithmeticException("Division by zero!");
        }
        return a / b;
    }
}

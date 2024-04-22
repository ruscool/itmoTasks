package itmoTasks.Task6_1;

import java.util.List;

public class SubMainTask6_1 {
    // Static метод applyOperation
    public static double applyOperation(List<Double> numbers, MathOperation operation) {
        // Находим максимальное и минимальное число
        double max = numbers.stream()
                .mapToDouble(Double::doubleValue)
                .max()
                .orElseThrow();
        double min = numbers.stream()
                .mapToDouble(Double::doubleValue)
                .min()
                .orElseThrow();

        // Применяем операцию к максимальному и минимальному числу
        return operation.apply(max, min);
    }

    public static void subMainTask6_1() {
        // Задание 6.1
        System.out.println("\nЗадание 6.1");
        // Создание реализаций интерфейса MathOperation с помощью лямбда-выражений
        MathOperation addition = (a, b) -> a + b;
        MathOperation subtraction = (a, b) -> a - b;
        MathOperation multiplication = (a, b) -> a * b;
        MathOperation division = (a, b) -> a / b;

        // Создание списка чисел
        List<Double> numbers = List.of(10.0, 5.0, 20.0);

        // Вызов метода applyOperation для разных операций
        System.out.println("Результат сложения: " + applyOperation(numbers, addition));
        System.out.println("Результат вычитания: " + applyOperation(numbers, subtraction));
        System.out.println("Результат умножения: " + applyOperation(numbers, multiplication));
        System.out.println("Результат деления: " + applyOperation(numbers, division));
    }
}
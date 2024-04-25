package itmoTasks.Task6_2;

import java.util.Arrays;
import java.util.List;

public class StreamExample {
    public static void runExample() {
        // Создаем список целых чисел
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Отфильтровываем нечетные числа
        List<Integer> oddNumbers = numbers.stream()
                .filter(num -> num % 2 != 0)
                .toList();

        // Возводим каждое число в квадрат
        List<Integer> squaredNumbers = numbers.stream()
                .map(num -> num * num)
                .toList();

        // Считаем сумму квадратов чисел
        int sumOfSquaredNumbers = numbers.stream()
                .mapToInt(num -> num * num)
                .sum();

        // Выводим результаты
        System.out.println("Нечетные числа: " + oddNumbers);
        System.out.println("Числа, возведенные в квадрат: " + squaredNumbers);
        System.out.println("Сумма квадратов чисел: " + sumOfSquaredNumbers);
    }
}

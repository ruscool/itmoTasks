package itmoTasks.Task4_2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueNumberCounter {
    public static void subMain() {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> numbers = new HashSet<>();

        System.out.println("Введите последовательность чисел (для завершения введите любую букву):");

        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            numbers.add(number);
        }
        System.out.println(numbers);
        System.out.println("Количество уникальных чисел: " + numbers.size());
    }
}



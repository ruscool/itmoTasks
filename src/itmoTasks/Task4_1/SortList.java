package itmoTasks.Task4_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortList {
    public static void reverseList() {
        Scanner scanner = new Scanner(System.in);
        List<String> words = new ArrayList<>();
        List<Integer> numbers = new ArrayList<>();

        System.out.println("Введите список слов и чисел (чтобы закончить ввод, введите пустую строку):");

        // Считывание ввода пользователя и разделение на слова и числа
        while (true) {
            String input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                break;
            }
            if (isNumeric(input)) {
                numbers.add(Integer.parseInt(input));
            } else {
                words.add(input);
            }
        }

        // Сортировка слов в возрастающем порядке
        Collections.sort(words);

        // Сортировка чисел в убывающем порядке
        Collections.sort(numbers, Collections.reverseOrder());

        // Вывод отсортированных слов и чисел
        System.out.println("Сортированный список слов (возрастающий порядок):");
        for (String word : words) {
            System.out.println(word);
        }

        System.out.println("Сортированный список чисел (убывающий порядок):");
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    // Метод для проверки, является ли строка числом
    private static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}


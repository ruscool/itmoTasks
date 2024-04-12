package itmoTasks.Task4_2;

import java.util.Map;
import java.util.TreeMap;

public class UniqueWordsCounter {
    public static void subMain() {
        String text = "На улице было тихо, тихо. Птицы чирикали, и чирикали они долго.";

        // Выводим исходный текст
        System.out.println("Исходный текст: " + text);

        // Удаляем знаки препинания и приводим текст к нижнему регистру
        text = text.replaceAll("[^а-яА-Яa-zA-Z ]", "").toLowerCase();

        // Разбиваем текст на слова
        String[] words = text.split("\\s+");

        // Создаем TreeMap для хранения уникальных слов в алфавитном порядке
        Map<String, Integer> uniqueWords = new TreeMap<>();

        // Считаем уникальные слова
        for (String word : words) {
            uniqueWords.put(word, uniqueWords.getOrDefault(word, 0) + 1);
        }


        // Выводим уникальные слова в алфавитном порядке
        System.out.println("Уникальные слова в тексте в алфавитном порядке:");
        for (Map.Entry<String, Integer> entry : uniqueWords.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}


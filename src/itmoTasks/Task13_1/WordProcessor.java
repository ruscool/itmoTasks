package itmoTasks.Task13_1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class WordProcessor {

    public void howManyWords() {
        String filePath = "files/test.txt"; // путь к файлу
        try {
            String longestWord = "";
            int wordCount = 0;

            try (FileInputStream fis = new FileInputStream(filePath);
                 Scanner scanner = new Scanner(fis)) {

                while (scanner.hasNext()) {
                    String word = scanner.next();
                    wordCount++;

                    if (word.length() > longestWord.length()) {
                        longestWord = word;
                    }
                }
            }

            System.out.println("Количество слов в файле: " + wordCount);
            System.out.println("Самое длинное слово в файле: " + longestWord);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
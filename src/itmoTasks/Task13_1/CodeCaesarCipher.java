package itmoTasks.Task13_1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CodeCaesarCipher {

    public void codeShifr() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст для шифрования: ");
        String inputText = scanner.nextLine();
        String fileName = "encrypted.txt";

        String encryptedText = encryptText(inputText, 3);

        try (FileWriter writer = new FileWriter("files/" + fileName)) {
            writer.write(encryptedText);
            System.out.println("Зашифрованный текст был записан в файл '" + fileName + "'.");
        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    // Шифр Цезаря
    public static String encryptText(String text, int shift) {
        StringBuilder encrypted = new StringBuilder();

        for (char character : text.toCharArray()) {
            if (character >= 'а' && character <= 'я') {
                encrypted.append((char) ('а' + (character - 'а' + shift) % 26));
            } else if (character >= 'А' && character <= 'Я') {
                encrypted.append((char) ('А' + (character - 'А' + shift) % 26));
            } else {
                encrypted.append(character);
            }
        }

        return encrypted.toString();
    }
}
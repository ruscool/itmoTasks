package itmoTasks.Task4_3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Students {
    public static void allStudents() {
        // Создание HashMap для хранения информации о студентах
        Map<Integer, String> studentsMap = new HashMap<>();

        // Добавление информации о студентах в map
        studentsMap.put(123, "Иванов");
        studentsMap.put(456, "Петров");
        studentsMap.put(568, "Сидоров");

        // Обход map и вывод информации о всех студентах на экран
        System.out.println("Информация о студентах:");
        for (Map.Entry<Integer, String> entry : studentsMap.entrySet()) {
            System.out.println("Номер зачетки: " + entry.getKey() + ", Имя: " + entry.getValue());
        }

        // Запрос у пользователя номера зачетки студента и вывод соответствующего имени студента
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер зачетки студента:");
        int studentId = scanner.nextInt();
        if (studentsMap.containsKey(studentId)) {
            System.out.println("Имя студента: " + studentsMap.get(studentId));
        } else {
            System.out.println("Студент с таким номером зачетки не найден.");
        }
        scanner.close();
    }
}


package itmoTasks.Task4_1;

import java.util.ArrayList;
import java.util.Iterator;

public class SubMainTask4_1 {
    public static void mainTask4_1() {
        ArrayList<Student> students = new ArrayList<>();

        System.out.println("4.1.1 Первое задание");
        // Добавление студентов в список
        students.add(new Student("Иван", 18, 3.5));
        students.add(new Student("Мария", 22, 2.8));
        students.add(new Student("Петр", 19, 2.9));
        students.add(new Student("Елена", 21, 3.2));

        // Вывод исходного списка студентов
        System.out.println("Исходный список студентов:");
        for (Student student : students) {
            System.out.println("Имя: " + student.getName() + ", Возраст: " + student.getAge() +
                    ", Средний балл: " + student.getAverageGrade());
        }

        // Удаление студентов согласно условиям
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getAge() < 20 || student.getAverageGrade() < 3.0) {
                iterator.remove();
            }
        }

        // Вывод отфильтрованного списка студентов
        System.out.println("\nОтфильтрованный список студентов:");
        for (Student student : students) {
            System.out.println("Имя: " + student.getName() + ", Возраст: " + student.getAge() +
                    ", Средний балл: " + student.getAverageGrade());
        }
        // 2 задание
        System.out.println();
        System.out.println("4.1.2 Второе задание");
        SortList.reverseList();
    }


}
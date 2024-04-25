package itmoTasks.Task6_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StudentExample {
    public static void runExample() {
        // Создаем список студентов
        List<Student> students = new ArrayList<>(Arrays.asList(
                new Student("Аня", Arrays.asList("Математика", "Физика", "Химия")),
                new Student("Дима", Arrays.asList("Математика", "Биология")),
                new Student("Петр", Arrays.asList("Физика", "История")),
                new Student("Михаил", Arrays.asList("Математика", "Физика")),
                new Student("Катя", Arrays.asList("Химия", "Биология"))
        ));

        // Найдите всех студентов, записанных на курс "Математика", и выведите их имена на экран
        System.out.println("Студенты на курсе \"Математика\":");
        students.stream()
                .filter(student -> student.getCourses().contains("Математика"))
                .map(Student::getName)
                .forEach(System.out::println);

        // Найдите студента, записанного на наибольшее количество курсов, и выведите его имя на экран
        Optional<Student> mostCourses = students.stream()
                .max((s1, s2) -> Integer.compare(s1.getCourses().size(), s2.getCourses().size()));
        mostCourses.ifPresent(student -> System.out.println("Студент с наибольшим количеством курсов: " +
                student.getName()));

        // Создайте список всех курсов, на которые записаны студенты, и выведите его на экран
        System.out.println("\nСписок всех курсов:");
        students.stream()
                .flatMap(student -> student.getCourses().stream())
                .distinct()
                .forEach(System.out::println);

        // Найдите студента, записанного на наименьшее количество курсов, и выведите его имя на экран
        Optional<Student> leastCourses = students.stream()
                .min((s1, s2) -> Integer.compare(s1.getCourses().size(), s2.getCourses().size()));
        leastCourses.ifPresent(student -> System.out.println("Студент с наименьшим количеством курсов: " +
                student.getName()));
    }

}

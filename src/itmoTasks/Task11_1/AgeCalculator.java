package itmoTasks.Task11_1;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {

    public void ageDetermination() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите дату рождения в формате ГГГГ-ММ-ДД (например, 1990-05-24):");
        String birthDateString = scanner.nextLine();

        // Парсинг строки в объект LocalDate
        LocalDate birthDate = LocalDate.parse(birthDateString);

        // Текущая дата
        LocalDate currentDate = LocalDate.now();

        // Расчет возраста человека
        int age = Period.between(birthDate, currentDate).getYears();

        System.out.println("Ваш возраст: " + age + " лет.");

        scanner.close();
    }
}
package itmoTasks;

import java.util.Scanner;

public class Task1_2 {
    public static void EnteredNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("2.1 Проверка на чет или нечет, введите число: ");
        int inputNumber = scanner.nextInt();
        if (inputNumber % 2 == 0) {
            System.out.println("Число четное");
        } else {
            System.out.println("Число нечетное");
        }
    }

    public static void DaysOfWeek() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("\n2.2 Введите от 1 до 7 для определения дня недели: ");
        int inputNumber = scanner.nextInt();
        String day = dayOfTheWeek(inputNumber);
        if (day != "0") {
            System.out.printf(Integer.toString(inputNumber) + " - это " + day);
        } else {
            System.out.println("Не правильно ввели день недели");
        }
//        scanner.close();
    }

    private static String dayOfTheWeek(int number) {
        String day = "";
        switch (number) {
            case 1:
                day = "Понедельник";
                break;
            case 2:
                day = "Вторник";
                break;
            case 3:
                day = "Среда";
                break;
            case 4:
                day = "Четверг";
                break;
            case 5:
                day = "Пятница";
                break;
            case 6:
                day = "Суббота";
                break;
            case 7:
                day = "Воскресенье";
                break;
            default:
                day = "0";
        }
        return day;
    }

    public static void itemEvolution() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n2.3 Введите оценку по предмету по 100 бальной шкале: ");
        int grade = scanner.nextInt();

        String result = (grade >= 60) ? "Сдал" : "Не сдал";
        System.out.println(result + " экзамен.");
        scanner.close();
    }

}


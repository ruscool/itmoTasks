package forWork;

import itmoTasks.Task1_2;
import itmoTasks.Task1_3;
import itmoTasks.Task1_4;
import itmoTasks.TaskOne;

import java.util.ArrayList;
import java.util.Scanner;

import itmoTasks.Task2_1.*;
import itmoTasks.Task2_2.*;
import itmoTasks.Task2_3_1.*;
import itmoTasks.Task2_4.users.AlmostMain;
import itmoTasks.Task2_5.*;
import itmoTasks.Tasks2_6.TaskSubMain;
import itmoTasks.Task4_1.SubMainTask4_1;
import itmoTasks.Task4_2.SubMainTask4_2;
import itmoTasks.Task4_3.SubMainTask4_3;
import itmoTasks.Task5_1.SubMainTask5_1;
import itmoTasks.Task6_1.SubMainTask6_1;
import itmoTasks.Task6_2.SubMainTask6_2;
import itmoTasks.Task7_1.SubMainTask7_1;
import itmoTasks.Task8_1.SubMainTask8_1;
import itmoTasks.Task9_1.SubMainTask9_1;
import itmoTasks.Task10_1.SubMainTask10_1;

public class subMenu {
    public static void runSubMenu() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> dynamicArray = new ArrayList<>();

        dynamicArray.add("11. Типы данных и арифметические операции");
        dynamicArray.add("12. Алгоритмы с ветвлением");
        dynamicArray.add("13. Алгоритмы с циклами");
        dynamicArray.add("14. Массивы");
        dynamicArray.add("21. Классы и объекты");
        dynamicArray.add("22. Абстрактные классы");
        dynamicArray.add("23. Интерфейсы");
        dynamicArray.add("24. Модификаторы доступа");
        dynamicArray.add("25. Перегрузка методов");
        dynamicArray.add("26. Static and final");
        dynamicArray.add("41. List");
        dynamicArray.add("42. Set");
        dynamicArray.add("43. Map");
        dynamicArray.add("51. Generics");
        dynamicArray.add("61. Лямбда-выражения");
        dynamicArray.add("62. Stream API");
        dynamicArray.add("71. Интерфейсы Comparable и Comparator");
        dynamicArray.add("81. Enum");
        dynamicArray.add("91. Exceptions");
        dynamicArray.add("101. Многопоточность");

        for (int i = 0; i < dynamicArray.size(); i++) {
            System.out.println(dynamicArray.get(i));
        }
        System.out.printf("Какой номер задания запустить, введите номер?: ");
        int inputNumber = scanner.nextInt();
        switch (inputNumber) {
            case 11:
                // first task - вычисляет площадь круга с заданным радиусом и выводит результат на экран
                TaskOne.TaskAreaCircle();

         /* two task
        Попросите пользователя ввести температуру в градусах Цельсия (тип данных double)
        и преобразуйте ее в градусы Фаренгейта, спользуя формулу F = (C * 9/5) + 32.
        */
                TaskOne.convertDegree(); // вызов метода решения задания

        /*
        Попросите пользователя ввести длины трех сторон треугольника (тип данных double).
        Затем используйте полупериметр и формулу Герона для вычисления площади треугольника.
         */
                TaskOne.areaTriangle(); // вызов метода решения задания
                break;
            case 12:
                Task1_2.EnteredNumber(); // Четное или нечетное число
                Task1_2.DaysOfWeek(); // Дни недели
                Task1_2.itemEvolution(); // Сдан или не сдан экзамен
                break;
            case 13:
                Task1_3.factorialCalculator();
                Task1_3.numberInput();
                Task1_3.sumOfMultiplies();
                break;
            case 14:
                Task1_4.threeTasks();
                break;
            case 21:
                // 2.1.1
                Student student = new Student("Aнастасия", 25, 86.00);
                student.displayInfo();
                System.out.println("");
                // 2.1.2
                BankAccount account = new BankAccount("123456");
                account.addTransaction(1000.0, "Депозит");
                account.addTransaction(-500.0, "Снятие");
                account.addTransaction(200.0, "Депозит");
                account.printStatement();
                break;
            case 22:
                mainTask2_2.dataEntry();
                break;
            case 23:
                mainTask2_3.runMain();
                System.out.println("");
                System.out.println("2.3.2");
                file.PrintableContent[] printableContents = new file.PrintableContent[4];

                printableContents[0] = new file.Article("Основы Java", "Это статья об основах Java.");
                printableContents[1] = new file.Photo("Природа", "https://example.com/nature.jpg");
                printableContents[2] = new file.Article("Объектно-ориентированное программирование",
                        "Это статья об ООП.");
                printableContents[3] = new file.Photo("Городской пейзаж", "https://example.com/city.jpg");

                for (file.PrintableContent content : printableContents) {
                    content.printContent();
                }

                break;
            case 24:
                AlmostMain.mainSub();
                break;
            case 25:
                SubMain.main();
                break;
            case 26:
                TaskSubMain.subMain();
                break;
            case 41:
                SubMainTask4_1.mainTask4_1();
                break;
            case 42:
                SubMainTask4_2.subClassMain();
                break;
            case 43:
                SubMainTask4_3.subMain();
                break;
            case 51:
                SubMainTask5_1.subMainTask5_1();
                break;
            case 61:
                SubMainTask6_1.subMainTask6_1();
                break;
            case 62:
                SubMainTask6_2.subMainTask6_2();
                break;
            case 71:
                SubMainTask7_1.subMain();
                break;
            case 81:
                SubMainTask8_1.subMain();
                break;
            case 91:
                SubMainTask9_1.subMain();
                break;
            case 101:
                SubMainTask10_1.subMain();
                break;
            default:
                System.out.println("Неправильно введен номер");

        }
    }
}



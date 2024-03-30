package itmoTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Task1_4 {
    public static void threeTasks() {
        findAvarage();
        reverseArray();
        averageStudentScore();
    }

    public static void findAvarage() {
        int size = 10;

        int[] array = new int[size];

        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);
        }
        double sum = 0;
        for (int num : array) {
            sum += num;
        }
        double average = sum / size;
        System.out.println("\n1.4.1 Массив состоит из " + Arrays.toString(array));
        System.out.println("Среднее значение всех элементов в массиве: " + average);
    }

    public static void reverseArray() {
        int[] array = {1, 2, 3, 4, 5};

        System.out.printf("\n1.4.2 Исходный массив " + Arrays.toString(array));
        subReverseArray(array);
        System.out.printf("\nПеревернутый массив " + Arrays.toString(array));
    }

    public static void subReverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public static void averageStudentScore() {
        double[][] grades = {
                {85.5, 90.0, 78.5, 88.0}, // Оценки первого студента
                {79.0, 88.5, 91.0, 82.5}, // Оценки второго студента
                {92.5, 87.0, 84.5, 90.5}  // Оценки третьего студента
        };
        System.out.println("\n\n1.4.3 Средние баллы студетов");
        // Вычисление среднего балла для каждого студента
        for (int i = 0; i < grades.length; i++) {
            double sum = 0;
            for (int j = 0; j < grades[i].length; j++) {
                sum += grades[i][j];
            }
            double average = sum / grades[i].length;
            System.out.println("Средний балл студента " + (i + 1) + ": " + average);
        }
    }
}

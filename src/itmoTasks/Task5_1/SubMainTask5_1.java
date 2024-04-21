package itmoTasks.Task5_1;

import java.util.List;

public class SubMainTask5_1 {
    public static void subMainTask5_1() {
        // Задание 5.1.1
        // Создание объекта Box для хранения целых чисел
        System.out.println("Задание 5.1.1");
        Box<Integer> integerBox = new Box<>();
        integerBox.addItem(10);
        System.out.println("Integer Box пуста: " + integerBox.isEmpty());
        System.out.println("Данные в Integer Box: " + integerBox.getItem());

        // Создание объекта Box для хранения строк
        Box<String> stringBox = new Box<>();
        stringBox.addItem("Hello, World!");
        System.out.println("String Box пуста: " + stringBox.isEmpty());
        System.out.println("Данные в String Box: " + stringBox.getItem());

        // Создание объекта Box для хранения других типов данных (например, Double)
        Box<Double> doubleBox = new Box<>();
        doubleBox.addItem(3.14);
        System.out.println("Double Box пуста: " + doubleBox.isEmpty());
        System.out.println("Данные в Double Box: " + doubleBox.getItem());

        // Задание 5.1.2
        // Создание списка продуктов
        System.out.println("\nЗадание 5.1.2");
        List<Product> products = List.of(
                new Product("Яблоко", 150.0),
                new Fruit("Апельсин", 190.0),
                new Vegetable("Морковь", 40.0)
        );

        // Вызов метода для вычисления общей стоимости продуктов
        double totalPrice = calculateTotalPrice(products);
        System.out.printf("Общая стоимость продуктов: %.2f руб.", totalPrice);
    }

    // Метод для вычисления общей стоимости продуктов
    public static double calculateTotalPrice(List<? extends Product> productList) {
        double totalPrice = 0.0;
        for (Product product : productList) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }
}
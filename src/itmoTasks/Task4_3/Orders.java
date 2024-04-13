package itmoTasks.Task4_3;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Orders {
    public static void allOrders() {
        // Создание LinkedHashMap для хранения заказов в ресторане
        Map<Integer, List<String>> ordersMap = new LinkedHashMap<>();

        // Добавление заказов для различных столов
        addOrder(ordersMap, 1, "Пицца", "Салат", "Напиток");
        addOrder(ordersMap, 2, "Стейк", "Картошка", "Десерт");
        addOrder(ordersMap, 3, "Суп", "Паста");

        // Вывод списка заказов для каждого стола
        System.out.println("Список заказов для каждого стола:");
        for (Map.Entry<Integer, List<String>> entry : ordersMap.entrySet()) {
            int tableNumber = entry.getKey();
            List<String> order = entry.getValue();
            System.out.println("Стол " + tableNumber + ": " + order);
        }

        // Вывод общего количества блюд, заказанных в ресторане
        int totalDishes = calculateTotalDishes(ordersMap);
        System.out.println("Общее количество блюд: " + totalDishes);
    }

    // Метод для добавления заказа для определенного стола
    private static void addOrder(Map<Integer, List<String>> ordersMap, int tableNumber, String... dishes) {
        List<String> order = ordersMap.getOrDefault(tableNumber, new ArrayList<>());
        for (String dish : dishes) {
            order.add(dish);
        }
        ordersMap.put(tableNumber, order);
    }

    // Метод для подсчета общего количества блюд в ресторане
    private static int calculateTotalDishes(Map<Integer, List<String>> ordersMap) {
        int totalDishes = 0;
        for (List<String> order : ordersMap.values()) {
            totalDishes += order.size();
        }
        return totalDishes;
    }

}


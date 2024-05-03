package itmoTasks.Task7_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class SubMainTask7_1 {
    public static void subMain() {
        TaskNumber number = new TaskNumber();
        PrintStatus beforeAfter = new PrintStatus();

        number.printNumberTask("7.1");

        List<Person> people = new ArrayList<>();
        people.add(new Person("Аня", 25));
        people.add(new Person("Дима", 30));
        people.add(new Person("Игорь", 20));
        people.add(new Person("Катя", 25));

        beforeAfter.whatPrint("before");
        for (Person person : people) {
            System.out.println(person);
        }

        Collections.sort(people, new AgeNameComparator());
        beforeAfter.whatPrint("after");
        for (Person person : people) {
            System.out.println(person);
        }
        number.printNumberTask("7.2");
        List<Product> products = new ArrayList<>();
        products.add(new Product("Яблоко", 200.00));
        products.add(new Product("Банан", 140.00));
        products.add(new Product("Апельсин", 240.00));
        products.add(new Product("Виноград", 50.00));

        beforeAfter.whatPrint("before");
        for (Product product : products) {
            System.out.println(product);
        }

        Collections.sort(products);

        beforeAfter.whatPrint("after");
        for (Product product : products) {
            System.out.println(product);
        }
    }

}
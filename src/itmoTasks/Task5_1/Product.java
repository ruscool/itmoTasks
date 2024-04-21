package itmoTasks.Task5_1;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

class Fruit extends Product {
    public Fruit(String name, double price) {
        super(name, price);
    }
}

class Vegetable extends Product {
    public Vegetable(String name, double price) {
        super(name, price);
    }
}



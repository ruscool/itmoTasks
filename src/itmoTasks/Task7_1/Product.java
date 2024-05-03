package itmoTasks.Task7_1;

class Product implements Comparable<Product> {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(Product other) {
        return Double.compare(this.price, other.price); // сравнение по цене
    }

    @Override
    public String toString() {
        return "Product{" +
                "товар='" + name + '\'' +
                ", цена=" + price +
                '}';
    }
}

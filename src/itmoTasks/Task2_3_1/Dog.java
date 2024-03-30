package itmoTasks.Task2_3_1;

public class Dog implements Pet {
    private String name;
    private final String dog = "Собака";

    Dog(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSpecies() {
        return dog;
    }

    @Override
    public void feed() {
        System.out.println(dog + " " + name + " была покормлена");

    }
}

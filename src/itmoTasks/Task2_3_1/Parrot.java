package itmoTasks.Task2_3_1;

public class Parrot implements Pet {
    private String name;
    private final String parrot = "Попугай";

    Parrot(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSpecies() {
        return parrot;
    }

    @Override
    public void feed() {
        System.out.println(parrot + " " + name + " была покормлен");

    }
}

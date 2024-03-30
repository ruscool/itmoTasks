package itmoTasks.Task2_3_1;

public class Cat implements Pet {
    private String name;
    private final String cat = "Кошка";

    Cat(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSpecies() {
        return cat;
    }

    @Override
    public void feed() {
        System.out.println(cat + " " + name + " была покормлена");

    }
}

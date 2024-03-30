package itmoTasks.Task2_1;

public class Student {
    private String name;
    private int age;
    private double averageBall;

    public Student(String name, int age, double averageBall) {
        this.name = name;
        this.age = age;
        this.averageBall = averageBall;
    }

    public void displayInfo() {
        System.out.println("\nЗадание 2.1.1");
        System.out.println("Имя студента: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Средний балл: " + averageBall);
    }
}

package itmoTasks.Task2_2;

abstract class Employee {
    String name;
    double salary;

    public Employee(String name) {
        this.name = name;
    }

    public abstract void calculateSalary();

}

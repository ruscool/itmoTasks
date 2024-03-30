package itmoTasks.Task2_2;

public class EmployeeData {
    static class Manager extends Employee {
        public Manager(String name) {
            super(name);
        }

        @Override
        public void calculateSalary() {
            salary = 50000;

        }
    }

    class Worker extends Employee {
        public Worker(String name) {
            super(name);
        }

        @Override
        public void calculateSalary() {
            salary = 30000;
        }
    }
}

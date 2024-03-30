package itmoTasks.Task2_2;

public class mainTask2_2 {
    public static void dataEntry() {
        // 2.2.1
        AllFigures.Circle circle = new AllFigures.Circle(5);
        System.out.printf("\n2.2.1\nПлощадь круга: %.2f%n", circle.calculateArea());
        System.out.printf("Периметр круга: %.2f%n", circle.calculatePerimeter());

        AllFigures.Rectangle rectangle = new AllFigures.Rectangle(4, 6);
        System.out.println("\nПлощадь прямоугольника: " + rectangle.calculateArea());
        System.out.println("Периметр прямоугольника: " + rectangle.calculatePerimeter());

        AllFigures.Triangle triangle = new AllFigures.Triangle(3, 4, 5);
        System.out.println("\nПлощадь треугольника: " + triangle.calculateArea());
        System.out.println("Периметр треугольника: " + triangle.calculatePerimeter());

        // 2.2.2
        Employee[] employees = new Employee[3];

        employees[0] = new EmployeeData.Manager("Иван");
        employees[1] = new EmployeeData.Manager("Анастасия");
        employees[2] = new EmployeeData.Manager("Сергей");

        System.out.println("\n2.2.2\nДанные по сотрудникам:");
        for (Employee employee : employees) {
            employee.calculateSalary();
            System.out.println("Сотрудник: " + employee.name +
                    ", заработная плата: " + employee.salary);
        }
    }
}

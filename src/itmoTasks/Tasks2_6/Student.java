package itmoTasks.Tasks2_6;

public class Student {
    // Статическая переменная для отслеживания количества созданных экземпляров класса Student
    private static int count = 0;

    // Переменные экземпляра класса Student
    private String name;
    private int age;

    // Конструктор класса Student
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        count++; // Увеличиваем счетчик при создании нового объекта
    }

    // Метод для получения количества созданных экземпляров класса Student
    public static int getCount() {
        return count;
    }

    // Геттеры и сеттеры для переменных экземпляра класса Student
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
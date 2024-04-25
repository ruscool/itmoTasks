package itmoTasks.Task6_2;

import java.util.List;

public class Student {
    String name;
    List<String> courses;

    public Student(String name, List<String> courses) {
        this.name = name;
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public List<String> getCourses() {
        return courses;
    }
}


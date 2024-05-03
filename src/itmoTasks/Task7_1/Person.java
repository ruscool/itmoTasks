package itmoTasks.Task7_1;

import java.util.Comparator;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                " Имя = '" + name + '\'' +
                ", возраст=" + age +
                '}';
    }
}

class AgeNameComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        int ageCompare = Integer.compare(p2.getAge(), p1.getAge()); // сортировка по убыванию возраста
        if (ageCompare == 0) {
            return p1.getName().compareTo(p2.getName()); // если возраст одинаковый, сортировка по имени
        }
        return ageCompare;
    }
}
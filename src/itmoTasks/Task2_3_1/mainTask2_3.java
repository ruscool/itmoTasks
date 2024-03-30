package itmoTasks.Task2_3_1;

public class mainTask2_3 {

    public static void runMain() {
        Pet dog = new Dog("Тошка");
        Pet cat = new Cat("Мурка");
        Pet parrot = new Parrot("Кеша");

        System.out.printf("\n2.3.1\n");
        feedPet(dog);
        feedPet(cat);
        feedPet(parrot);

    }

    public static void feedPet(Pet pet) {
        pet.feed();
    }
}

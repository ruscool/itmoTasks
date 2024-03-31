package itmoTasks.Task2_4.users;

import itmoTasks.Task2_4.library.Book;

public class AlmostMain {

    public static void mainSub() {
        // Создание экземпляра книги
        Book book = new Book("Java программирование");

        // Вызов метода checkOut для установки borrower
        book.checkOut("Иван Петров");
    }
}

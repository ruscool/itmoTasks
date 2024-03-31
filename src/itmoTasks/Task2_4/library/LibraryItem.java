package itmoTasks.Task2_4.library;

public class LibraryItem {
    String title;

    // Поле borrower (тот, кто взял книгу или журнал), доступное в пакете users
    protected String borrower;

    // Конструктор класса LibraryItem
    public LibraryItem(String title) {
        this.title = title;
    }
}

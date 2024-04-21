package itmoTasks.Task5_1;

public class Box<T> {
    private T item;

    public void addItem(T newItem) {
        this.item = newItem;
    }

    public T getItem() {
        return item;
    }

    public boolean isEmpty() {
        return item == null;
    }

}

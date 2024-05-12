package itmoTasks.Task10_1;

public class Restaurant {

    private static final int NUM_OF_TABLES = 3; // Количество столиков

    // Класс, управляющий доступом к столикам
    static class Host {
        private int availableTables = NUM_OF_TABLES;

        // Занимает столик, если есть свободные
        public synchronized void sitAtTable(int visitorId) {
            while (availableTables <= 0) {
                try {
                    System.out.println("Посетитель " + visitorId + " ждет столик.");
                    wait(); // Ждем, пока не освободится столик
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            availableTables--;
            System.out.println("Посетитель " + visitorId + " сел за столик. Оставшиеся столики: " + availableTables);
        }

        // Освобождает столик
        public synchronized void leaveTable(int visitorId) {
            availableTables++;
            System.out.println("Посетитель " + visitorId + " покинул столик. Свободных столиков: " + availableTables);
            notify(); // Оповещаем один из ожидающих столик посетителей
        }
    }

    // Класс посетителя (потока)
    static class Visitor implements Runnable {
        private final Host host;
        private final int visitorId;

        public Visitor(Host host, int visitorId) {
            this.host = host;
            this.visitorId = visitorId;
        }

        public void run() {
            // Посетитель заходит и хочет занять столик
            host.sitAtTable(visitorId);

            // Имитация пребывания посетителя в ресторане
            try {
                Thread.sleep((long) (Math.random() * 5000));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            // Посетитель освобождает столик
            host.leaveTable(visitorId);
        }
    }
}
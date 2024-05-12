package itmoTasks.Task11_1;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.TreeMap;

public class EventScheduler {

    private static Map<String, LocalTime> events = new TreeMap<>(); // TreeMap автоматически сортирует ключи

    static {
        // Инициализация мероприятий и времени их начала
        events.put("Совещание", LocalTime.of(9, 0)); // 09:00
        events.put("Лекция", LocalTime.of(18, 0)); // 12:00
        events.put("Обед", LocalTime.of(13, 0)); // 13:00
        events.put("Встреча", LocalTime.of(16, 0)); // 16:00
    }

    public void findNextEvent() {
        LocalTime currentTime = LocalTime.now();
        Map.Entry<String, LocalTime> nextEvent = null;

        // Цикл по мероприятиям для поиска ближайшего
        for (Map.Entry<String, LocalTime> entry : events.entrySet()) {
            if (entry.getValue().isAfter(currentTime)) {
                nextEvent = entry;
                break; // Выходим из цикла при нахождении первого следующего события
            }
        }
        System.out.println("Все мероприятия (для проверки): " + events);

        if (nextEvent != null) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
            System.out.println("Сейчас время " + currentTime.format(DateTimeFormatter.ofPattern("HH:mm")));
            System.out.println("Следующее мероприятие: " + nextEvent.getKey() + " в " + nextEvent.getValue().format(formatter));
        } else {
            System.out.println("На сегодня мероприятий больше нет.");
        }
    }

//    public static void main(String[] args) {
//        findNextEvent();
//    }
}
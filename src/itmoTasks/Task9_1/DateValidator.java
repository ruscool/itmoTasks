package itmoTasks.Task9_1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

class DateValidator {
    // Метод для проверки корректности введенной даты
    public static LocalDate validateDate(String inputDate) throws InvalidDateException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        try {
            // Проверка соответствия формата и корректности даты
            LocalDate date = LocalDate.parse(inputDate, formatter);
            return date;
        } catch (DateTimeParseException e) {
            // Выбрасываем исключение, если дата некорректна
            throw new InvalidDateException("Некорректная дата: " + inputDate);
        }
    }
}
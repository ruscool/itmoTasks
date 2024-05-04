package itmoTasks.Task8_1;/*
ADMIN - администратор системы.

USER - обычный зарегистрированный пользователь.

GUEST - незарегистрированный посетитель.
 */

public enum UserRole {
    ADMIN, USER, GUEST;

    public boolean isAuthorized() {
        return this == ADMIN || this == USER;
    }
}
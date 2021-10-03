package ru.bfu.ipmit.lab8.task3;

public interface Task3 {

    /**
     * Метод areRotations проверяет, может ли одна строка быть получена из другой путем циклического сдвига строки
     *
     * ПРИМЕР 1:
     * Вход: firstString = "abcde", secondString = "cdeab"
     * Выход: true (циклический сдвиг на 3 позиции вправо)
     *
     * ПРИМЕР 2:
     * Вход: firstString = "abcde", secondString = "abcde"
     * Выход: true
     *
     * ПРИМЕР 3:
     * Вход: firstString = "abcde", secondString = "cdeba"
     * Выход: false
     */
    boolean areRotations(String firstString, String secondString);

}

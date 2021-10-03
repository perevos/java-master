package ru.bfu.ipmit.lab8.task2;

public interface Task2 {

    /**
     * Метод compressString сжимает строку из строчных латинских букв, заменяя подряд идущие одинаковые буквы на одну
     * букву с указанием количества повторений. Например, строку "aaaabbaac" нужно заменить на "a4b2a2c"
     *
     * @param string строка из строчных латинских букв a...z
     * @return сжатая строка без повторяющихся подряд идущих букв с указанием числа повторений
     *
     * ПРИМЕР 1:
     * Вход: string = "abcd"
     * Выход: "abcd"
     *
     * ПРИМЕР 2:
     * Вход: string = "aaaabbaac"
     * Выход: "a4b2a2c"
     */
    String compressString(String string);

}

package ru.bfu.ipmit.lab8.task6;

import java.util.List;

public interface Task6 {

    /**
     * Метод getStaticMethods выводит список всех статических методов объекта в формате:
     * <тип возвращаемого значения> <имя метода>(<список типов аргументов>)
     *
     * @param object объект
     *
     * ПРИМЕР:
     * class A {
     *      static int sum(int a, int b) { return a + b; }
     *      String sayHi() { return "Hi"; }
     * }
     *
     * class B extends A {
     *      static double getPi() { return Math.PI; }
     * }
     *
     * Вход: Object o = new B();
     * Выход: ["int sum(int, int)", "double getPi()"]
     */
    List<String> getStaticMethods(Object object);

}

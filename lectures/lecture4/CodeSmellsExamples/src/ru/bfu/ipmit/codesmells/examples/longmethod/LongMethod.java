package ru.bfu.ipmit.codesmells.examples.longmethod;

// пример кода с длинным телом метода
public class LongMethod {

    // Вывод характеристик массива в консоль
    public static void printArrayInfo(int[] array) {
        // Вывод длины массива
        System.out.println("Длина массива: " + array.length);

        // Вывод минимального элемента массива
        int min = Integer.MAX_VALUE;
        for (int element : array) {
            if (element < min) {
                min = element;
            }
        }
        System.out.println("Минимальный элемент массива: " + min);

        // Вывод максимального элемента массива
        int max = Integer.MIN_VALUE;
        for (int element : array) {
            if (element > max) {
                max = element;
            }
        }
        System.out.println("Максимальный элемент массива: " + max);

        // Вывод суммы элементов массива
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        System.out.println("Сумма элементов массива: " + sum);

    }

}

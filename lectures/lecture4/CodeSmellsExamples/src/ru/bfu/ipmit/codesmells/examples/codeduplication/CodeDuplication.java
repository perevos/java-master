package ru.bfu.ipmit.codesmells.examples.codeduplication;

import ru.bfu.ipmit.codesmells.examples.codeduplication.calculator.Calculator;

// пример кода с дублированием (класс Calculator)
class CodeDuplication {

    public static void main(String[] args) {
        int[] firstArray = {1, 2, 3};
        int[] secondArray = {4, 5, 6};

        int sum = Calculator.getSum(firstArray, secondArray);

        System.out.println(sum);
    }


}

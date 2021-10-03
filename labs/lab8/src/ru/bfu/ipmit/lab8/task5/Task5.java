package ru.bfu.ipmit.lab8.task5;

import java.util.List;

public interface Task5 {

    /**
     * Метод getLongestPath возвращает список данных, хранящихся в самом длинном пути в дереве от корня до листа.
     * В случае нескольких путей максимальной длины метод выводит список данных в одном из них.
     *
     * @param root корень дерева
     * @param <T> тип данных, хранящихся в вершинах дерева
     *
     * ПРИМЕР для T = Integer:
     * Вход: дерево 0
     *             / \
     *            1   2
     *           / \   \
     *          3   4   5
     *               \
     *                6
     *  Выход: [0, 1, 4, 6]
     */
    <T> List<T> getLongestPath(TreeNode<T> root);

}

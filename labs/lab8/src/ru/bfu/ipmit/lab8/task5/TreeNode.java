package ru.bfu.ipmit.lab8.task5;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/** Класс TreeNode определяет вершину дерева с произвольным количеством вершин-потомков
 *
 * @param <T> тип данных, хранящихся в узлах дерева
 */
@Getter
@Setter
public class TreeNode<T> {
    /**
     * Данные, хранящиеся в вершине дерева
     */
    private T data;

    /**
     * Список вершин-потомков
     */
    private List<TreeNode<T>> children;

}

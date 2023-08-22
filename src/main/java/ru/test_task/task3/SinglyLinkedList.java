package ru.test_task.task3;

import java.util.Iterator;

/**
 * Класс реализует работу простого односвязного списка.
 * @param <T> любой тип данных
 * @author IVANOVA JULIA
 * @version 1.0
 */
public class SinglyLinkedList<T> implements Iterable<T>{

    /**
     * Хранение указателя на первый элемент списка
     * в переменной типа {@code Node<T>}.
     */
    private Node<T> head = null;

    public Node<T> getFirst() {
        return head;
    }

    /**
     * Итератор для перебора элементов односвязного списка.
     */
    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {

            Node<T> currentNode = head;

            @Override
            public boolean hasNext() {
                return currentNode != null;
            }

            @Override
            public T next() {
                T data = currentNode.data;
                currentNode = currentNode.next;
                return data;
            }
        };
    }

    /**
     * Класс описывает модель узла односвязного списка.
     * @param <T> принимает любой тип данных
     */
    private static class Node<T> {
        T data;
        Node<T> next;

        private Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    /**
     * Метод добавляет элементы в начало списка.
     * @param item - узел, который необходимо добавить в список
     */
    public void addFirst(T item) {
        Node<T> newNode = new Node<>(item);
        newNode.next = head;
        head = newNode;
    }

    /**
     * Метод переворачивает список.
     * Рекурсивным путем находится последний узел списка, который
     * присваивается указателю на первый узел. Далее поочередно
     * меняется указатель послеследующего узла списка на текущий,
     * а указатель следующего - на {@code null}.
     * @param node - указатель на первый узел списка
     */
    public void reverse(Node<T> node) {
        if (node == null) {
            return;
        }
        if (node.next == null) {
            this.head = node;
            return;
        }
        reverse(node.next);
        node.next.next = node;
        node.next = null;
    }
}

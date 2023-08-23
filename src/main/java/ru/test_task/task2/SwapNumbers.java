package ru.test_task.task2;

import javafx.util.Pair;
/**
 * Класс, в котором реализован метод, меняющий местами значения
 * 2ух целочисленных переменных.
 * @author IVANOVA JULIA
 * @version 2.0
 */
public class SwapNumbers {

    /**
     * Метод меняет местами 2 целочисленных переменных, используя XOR,
     * только в том случае, когда их значения разные.
     * Метод работает с числами, которые входят в диапазон от -2^31 до
     * 2^31 – 1.
     */
    public static Pair<Integer, Integer> swap(int firstNumber, int secondNumber) {
        if (firstNumber != secondNumber) {
            firstNumber ^= secondNumber;
            secondNumber = firstNumber ^ secondNumber;
            firstNumber ^= secondNumber;
        }
        return new Pair<>(firstNumber, secondNumber);
    }
}
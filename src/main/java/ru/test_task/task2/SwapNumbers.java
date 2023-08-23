package ru.test_task.task2;

import java.util.Objects;

/**
 * Класс, в котором реализован метод, меняющий местами значения
 * 2ух целочисленных переменных.
 * @author IVANOVA JULIA
 * @version 3.0
 */
public class SwapNumbers {

    /**
     * Хранение первого целочисленного значения в переменной типа int
     */
    private int firstNumber;
    /**
     * Хранение второго целочисленного значения в переменной типа int
     */
    private int secondNumber;

    public SwapNumbers(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    /**
     * Метод меняет местами 2 целочисленных переменных, используя XOR,
     * только в том случае, когда их значения разные.
     * Метод работает с числами, которые входят в диапазон от -2^31 до
     * 2^31 – 1.
     */
    public SwapNumbers swap() {
        if (firstNumber != secondNumber) {
            firstNumber ^= secondNumber;
            secondNumber = firstNumber ^ secondNumber;
            firstNumber ^= secondNumber;
        }
        return new SwapNumbers(firstNumber, secondNumber);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SwapNumbers that = (SwapNumbers) o;
        return firstNumber == that.firstNumber && secondNumber == that.secondNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstNumber, secondNumber);
    }
}
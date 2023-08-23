package ru.test_task.task2;

import javafx.util.Pair;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class SwapNumbersTest {

    @Test
    void swapPositive() {
        Pair<Integer, Integer> actual = SwapNumbers.swap(48, 27);
        Pair<Integer, Integer> expected = new Pair<>(27, 48);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void swapFirsNegativeSecondPositive() {
        Pair<Integer, Integer> actual = SwapNumbers.swap(-48, 27);
        Pair<Integer, Integer> expected = new Pair<>(27, -48);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void swapFirstPositiveSecondNegative() {
        Pair<Integer, Integer> actual = SwapNumbers.swap(48, -27);
        Pair<Integer, Integer> expected = new Pair<>(-27, 48);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void swapNegative() {
        Pair<Integer, Integer> actual = SwapNumbers.swap(-48, -27);
        Pair<Integer, Integer> expected = new Pair<>(-27, -48);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void swapFirstZero() {
        Pair<Integer, Integer> actual = SwapNumbers.swap(0, -27);
        Pair<Integer, Integer> expected = new Pair<>(-27, 0);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void swapSecondZero() {
        Pair<Integer, Integer> actual = SwapNumbers.swap(48, 0);
        Pair<Integer, Integer> expected = new Pair<>(0, 48);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void swapExtremeValues() {
        Pair<Integer, Integer> actual = SwapNumbers.swap(-2147483648, 2147483647);
        Pair<Integer, Integer> expected = new Pair<>(2147483647, -2147483648);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void swapEqualValues() {
        Pair<Integer, Integer> actual = SwapNumbers.swap(21, 21);
        Pair<Integer, Integer> expected = new Pair<>(21, 21);
        assertThat(actual).isEqualTo(expected);
    }
}
package ru.test_task.task2;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class SwapNumbersTest {

    @Test
    void swapPositive() {
        SwapNumbers actual = new SwapNumbers(48, 27);
        actual.swap();
        SwapNumbers expected = new SwapNumbers(27, 48);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void swapFirsNegativeSecondPositive() {
        SwapNumbers actual = new SwapNumbers(-48, 27);
        actual.swap();
        SwapNumbers expected = new SwapNumbers(27, -48);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void swapFirstPositiveSecondNegative() {
        SwapNumbers actual = new SwapNumbers(48, -27);
        actual.swap();
        SwapNumbers expected = new SwapNumbers(-27, 48);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void swapNegative() {
        SwapNumbers actual = new SwapNumbers(-48, -27);
        actual.swap();
        SwapNumbers expected = new SwapNumbers(-27, -48);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void swapFirstZero() {
        SwapNumbers actual = new SwapNumbers(0, -27);
        actual.swap();
        SwapNumbers expected = new SwapNumbers(-27, 0);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void swapSecondZero() {
        SwapNumbers actual = new SwapNumbers(48, 0);
        actual.swap();
        SwapNumbers expected = new SwapNumbers(0, 48);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void swapExtremeValues() {
        SwapNumbers actual = new SwapNumbers(-2147483648, 2147483647);
        actual.swap();
        SwapNumbers expected = new SwapNumbers(2147483647, -2147483648);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void swapEqualValues() {
        SwapNumbers actual = new SwapNumbers(21, 21);
        actual.swap();
        SwapNumbers expected = new SwapNumbers(21, 21);
        assertThat(actual).isEqualTo(expected);
    }
}
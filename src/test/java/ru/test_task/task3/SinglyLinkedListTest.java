package ru.test_task.task3;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class SinglyLinkedListTest {

    @Test
    void reverseIntegerList() {
        SinglyLinkedList<Integer> actuaList = new SinglyLinkedList<>();
        actuaList.addFirst(1);
        actuaList.addFirst(2);
        actuaList.addFirst(3);
        actuaList.addFirst(4);
        actuaList.addFirst(5);
        actuaList.reverse(actuaList.getFirst());
        StringBuilder actual = new StringBuilder();
        for (Integer number : actuaList) {
            actual.append(number);
        }
        SinglyLinkedList<Integer> expectedList = new SinglyLinkedList<>();
        expectedList.addFirst(5);
        expectedList.addFirst(4);
        expectedList.addFirst(3);
        expectedList.addFirst(2);
        expectedList.addFirst(1);
        StringBuilder expected = new StringBuilder();
        for (Integer number : expectedList) {
            expected.append(number);
        }
        assertThat(actual.toString()).isEqualTo(expected.toString());
    }

    @Test
    void reverseStringList() {
        SinglyLinkedList<String> actuaList = new SinglyLinkedList<>();
        actuaList.addFirst("P");
        actuaList.addFirst("u");
        actuaList.addFirst("p");
        actuaList.addFirst("p");
        actuaList.addFirst("y");
        actuaList.reverse(actuaList.getFirst());
        StringBuilder actual = new StringBuilder();
        for (String string : actuaList) {
            actual.append(string);
        }
        SinglyLinkedList<String> expectedList = new SinglyLinkedList<>();
        expectedList.addFirst("y");
        expectedList.addFirst("p");
        expectedList.addFirst("p");
        expectedList.addFirst("u");
        expectedList.addFirst("P");
        StringBuilder expected = new StringBuilder();
        for (String string : expectedList) {
            expected.append(string);
        }
        assertThat(actual.toString()).isEqualTo(expected.toString());
    }

    @Test
    void reverseListWithNull() {
        SinglyLinkedList<String> actuaList = new SinglyLinkedList<>();
        actuaList.addFirst("P");
        actuaList.addFirst(null);
        actuaList.reverse(actuaList.getFirst());
        StringBuilder actual = new StringBuilder();
        for (String string : actuaList) {
            actual.append(string);
        }
        SinglyLinkedList<String> expectedList = new SinglyLinkedList<>();
        expectedList.addFirst(null);
        expectedList.addFirst("P");
        StringBuilder expected = new StringBuilder();
        for (String string : expectedList) {
            expected.append(string);
        }
        assertThat(actual.toString()).isEqualTo(expected.toString());
    }

    @Test
    void reverseEmptyList() {
        SinglyLinkedList<String> actuaList = new SinglyLinkedList<>();
        actuaList.reverse(actuaList.getFirst());
        StringBuilder actual = new StringBuilder();
        for (String string : actuaList) {
            actual.append(string);
        }
        SinglyLinkedList<String> expectedList = new SinglyLinkedList<>();
        StringBuilder expected = new StringBuilder();
        for (String string : expectedList) {
            expected.append(string);
        }
        assertThat(actual.toString()).isEqualTo(expected.toString());
    }
}
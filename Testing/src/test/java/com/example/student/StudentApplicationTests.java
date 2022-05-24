package com.example.student;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class StudentApplicationTests {

    Calculator underTest = new Calculator();

    @Test
    void itShouldAddTwoNumbers() {

        // BDD
        // Given
        int numberOne = 20;
        int numberTwo = 30;

        // When
        int result = underTest.add(numberOne, numberTwo);

        // Then
        int expected = 50;
        assertThat(result).isEqualTo(expected);
    }

    class Calculator {
        int add(int a, int b) {
            return a + b;
        }
    }

}

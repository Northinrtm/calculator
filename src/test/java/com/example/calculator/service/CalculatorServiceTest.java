package com.example.calculator.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

    CalculatorService calculatorService = new CalculatorService();

    @Test
    void printHello() {
        Assertions.assertTrue(calculatorService.printHello().contains("Добро пожаловать в калькулятор"));
    }

    @Test
    void printSum() throws Exception {
        Assertions.assertTrue(calculatorService.printSum(5, 5) == 10);
    }

    @Test
    void printMinus() throws Exception {
        Assertions.assertTrue(calculatorService.printMinus(5, 5) == 0);
    }

    @Test
    void printMultiply() throws Exception {
        Assertions.assertTrue(calculatorService.printMultiply(5, 5) == 25);
    }

    @Test
    void printDivide() throws Exception {
        Assertions.assertTrue(calculatorService.printDivide(5, 5) == 1);
    }

    @Test
    void printDivideZero() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> calculatorService.printDivide(5, 0));
    }

    public static Stream<Arguments> testParamPlus() {
        return Stream.of(
                Arguments.of(0, 0, 0),
                Arguments.of(5, 5, 10),
                Arguments.of(0, 5, 5),
                Arguments.of(5, 0, 5)
        );
    }

    @ParameterizedTest
    @MethodSource("testParamPlus")
    public void sumTest(int num1, int num2, int result) throws Exception {
        Assertions.assertEquals(result, calculatorService.printSum(num1, num2));
    }

    public static Stream<Arguments> testParamMinus() {
        return Stream.of(
                Arguments.of(0, 0, 0),
                Arguments.of(5, 5, 0),
                Arguments.of(0, 5, -5),
                Arguments.of(5, 0, 5)
        );
    }

    @ParameterizedTest
    @MethodSource("testParamMinus")
    public void minusTest(int num1, int num2, int result) throws Exception {
        Assertions.assertEquals(result, calculatorService.printMinus(num1, num2));
    }

    public static Stream<Arguments> testParamDivide() {
        return Stream.of(
                Arguments.of(10, 5, 2),
                Arguments.of(5, 5, 1),
                Arguments.of(0, 5, 0),
                Arguments.of(5, 10, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("testParamDivide")
    public void divideTest(int num1, int num2, int result) throws Exception {
        Assertions.assertEquals(result, calculatorService.printDivide(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("testParamMultiply")
    public void multiplyTest(int num1, int num2, int result) throws Exception {
        Assertions.assertEquals(result, calculatorService.printMultiply(num1, num2));
    }

    public static Stream<Arguments> testParamMultiply() {
        return Stream.of(
                Arguments.of(0, 0, 0),
                Arguments.of(5, 5, 25),
                Arguments.of(0, 5, 0),
                Arguments.of(5, 0, 0)
        );
    }
}
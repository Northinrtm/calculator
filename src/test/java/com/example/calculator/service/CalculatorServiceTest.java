package com.example.calculator.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

    CalculatorService calculatorService = new CalculatorService();

    @Test
    void printHello() {
        Assertions.assertTrue(calculatorService.printHello().contains("Добро пожаловать в калькулятор"));
    }

    @Test
    void printSum() throws Exception {
        Assertions.assertTrue(calculatorService.printSum(5,5) == 10);
    }

    @Test
    void printMinus() throws Exception {
        Assertions.assertTrue(calculatorService.printMinus(5,5) == 0);
    }

    @Test
    void printMultiply() throws Exception {
        Assertions.assertTrue(calculatorService.printMultiply(5,5) == 25);
    }

    @Test
    void printDivide() throws Exception {
        Assertions.assertTrue(calculatorService.printDivide(5,5) == 1);
    }

    @Test
    void printDivideZero(){
        Assertions.assertThrows(IllegalArgumentException.class,
                ()->calculatorService.printDivide(5,0));
    }
}
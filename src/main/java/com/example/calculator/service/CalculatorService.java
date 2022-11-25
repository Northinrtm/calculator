package com.example.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public String printHello() {
        return "Добро пожаловать в калькулятор";
    }

    public int printSum(int num1, int num2) {
        return num1 + num2;
    }

    public int printMinus(int num1, int num2) {
        return num1 - num2;
    }

    public int printMultiply(int num1, int num2) {
        return num1 * num2;
    }

    public int printDivide(int num1, int num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            throw new IllegalArgumentException("делитель равен 0");
        }
    }
}

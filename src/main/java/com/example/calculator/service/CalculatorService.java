package com.example.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public String printHello() {
        return "Добро пожаловать в калькулятор";
    }

    public int printSum(int num1, int num2) throws Exception {
        if ((num1 != 0) && (num2 != 0)) {
            return num1 + num2;
        } else {
            throw new Exception("параметры");
        }
    }

    public int printMinus(int num1, int num2) throws Exception {
        if ((num1 != 0) && (num2 != 0)) {
            return num1 - num2;
        } else {
            throw new Exception("параметры");
        }
    }

    public int printMultiply(int num1, int num2) throws Exception {
        if ((num1 != 0) && (num2 != 0)) {
            return num1 * num2;
        } else {
            throw new Exception("параметры");
        }
    }

    public int printDivide(int num1, int num2) throws Exception {
        if ((num1 != 0) || (num2 != 0)) {
            return num1 / num2;
        } else {
            if (num2 == 0) {
                throw new IllegalArgumentException("делитель равен 0");
            } else {
                throw new Exception("параметры");
            }
        }
    }
}

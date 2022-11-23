package com.example.calculator.controller;

import com.example.calculator.service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("")
    public String printHello() {
        return calculatorService.printHello();
    }

    @GetMapping("/plus")
    public String printSum(@RequestParam int num1, @RequestParam int num2) throws Exception {
        String s = num1 + " + " + num2 + " = " + calculatorService.printSum(num1, num2);
        return s;
    }

    @GetMapping("/minus")
    public String printMinus(@RequestParam int num1, @RequestParam int num2) throws Exception {
        String s = num1 + " - " + num2 + " = " + calculatorService.printMinus(num1, num2);
        return s;
    }

    @GetMapping("/multiply")
    public String printMultiply(@RequestParam int num1, @RequestParam int num2) throws Exception {
        String s = num1 + " * " + num2 + " = " + calculatorService.printMultiply(num1, num2);
        return s;
    }

    @GetMapping("/divide")
    public String printDivide(@RequestParam int num1, @RequestParam int num2) throws Exception {
        String s = num1 + " / " + num2 + " = " + calculatorService.printDivide(num1, num2);
        return s;
    }
}

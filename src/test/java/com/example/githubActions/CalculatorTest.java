package com.example.githubActions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void addTwoNumbers(){
        Calculator calculator = new Calculator();

        int result = calculator.add(2, 2);
        Assertions.assertEquals(4, result);
    }

}
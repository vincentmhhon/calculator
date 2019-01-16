package com.vincentmhhon.calculator;

import org.springframework.stereotype.Service;

/**
 * Calculator
 */
@Service
public class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    int minus(int a, int b) {
        return a - b;
    }
}

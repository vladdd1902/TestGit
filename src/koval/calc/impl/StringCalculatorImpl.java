package koval.calc.impl;

import koval.calc.StringCalculator;

public class StringCalculatorImpl implements StringCalculator {

    @Override
    public String add(Number a, Number b) {
        return a.toString().concat(b.toString());
    }
}

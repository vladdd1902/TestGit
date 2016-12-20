package koval;

import koval.calc.Calculator;
import koval.calc.impl.CalculatorImpl;

public class Demo {

    public static void main(String[] args) {
        Calculator calculator = new CalculatorImpl();
        System.out.println(calculator.add(4, 7));
        System.out.println(calculator.minus(7, 1));
        System.out.println(calculator.mul(3, 3));
    }
}

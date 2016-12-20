package koval;

import koval.calc.Calculator;
import koval.calc.impl.CalculatorImpl;
import koval.calc.show.ShowUtils;

public class Demo {

    public static void main(String[] args) {
        Calculator calculator = new CalculatorImpl();
        ShowUtils.show(calculator);
    }
}

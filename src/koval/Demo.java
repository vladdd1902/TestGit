package koval;

import koval.calc.Calculator;
import koval.calc.StringCalculator;
import koval.calc.impl.CalculatorImpl;
import koval.calc.impl.StringCalculatorImpl;
import koval.calc.show.ShowUtils;

public class Demo {

    public static void main(String[] args) {
        Calculator calculator = new CalculatorImpl();
        ShowUtils.showSimpleCalculator(calculator);

        StringCalculator stringCalculator = new StringCalculatorImpl();
        ShowUtils.showStringCalculator(stringCalculator);
    }
}

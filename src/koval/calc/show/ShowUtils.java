package koval.calc.show;

import koval.calc.Calculator;
import koval.calc.StringCalculator;

public class ShowUtils {

    public static void showSimpleCalculator(Calculator calculator) {
        showAdd(calculator);
        showMinus(calculator);
        showMul(calculator);
    }

    public static void showStringCalculator(StringCalculator stringCalculator) {
        System.out.print("2 + 2 = ");
        System.out.println(stringCalculator.add(2, 2));
    }

    private static void showAdd(Calculator calculator) {
        System.out.print("2 + 2 = ");
        System.out.println(calculator.add(2, 2));
    }

    private static void showMinus(Calculator calculator) {
        System.out.print("5 - 6 = ");
        System.out.println(calculator.minus(5, 6));
    }

    private static void showMul(Calculator calculator) {
        System.out.print("4 * 2 = ");
        System.out.println(calculator.mul(4, 2));
    }
}

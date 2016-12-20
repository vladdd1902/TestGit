package koval.calc.show;

import koval.calc.Calculator;

public class ShowUtils {

    public static void show(Calculator calculator) {
        System.out.print("2 + 2 = ");
        System.out.println(calculator.add(2, 2));

        System.out.print("5 - 6 = ");
        System.out.println(calculator.minus(5, 6));

        System.out.print("4 * 2 = ");
        System.out.println(calculator.mul(4, 2));
    }
}

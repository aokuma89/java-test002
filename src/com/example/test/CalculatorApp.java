package com.example.test;

public class CalculatorApp {
	public static void main(String[] args) {
        BasicCalculator calc = new BasicCalculator();
        CalculatorHistory history = new CalculatorHistory();

        int resultAdd = calc.add(5, 3);
        history.save("5 + 4 = " + resultAdd);

        int resultSub = calc.subtract(10, 4);
        history.save("10 - 4 = " + resultSub);

        int resultMul = calc.multiply(6, 7);
        history.save("6 * 7 = " + resultMul);

        double resultDiv = calc.divide(20, 4);
        history.save("20 / 4 = " + resultDiv);

        history.print();
    }
}

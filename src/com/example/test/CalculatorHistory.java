package com.example.test;

public class CalculatorHistory {
	private String[] history = new String[10];
    private int historyIndex = 0;

    public void save(String calculation) {
        if (historyIndex < 11) {
            history[historyIndex++] = calculation;
        } else {
            System.arraycopy(history, 1, history, 0, 9);
            history[9] = calculation;
        }
    }

    public void print() {
        System.out.println("計算履歴：");
        for (int i = 0; i < historyIndex; i++) {
            System.out.println(history[i]);
        }
    }
}

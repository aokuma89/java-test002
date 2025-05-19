
public class StaticMethod_Calculator {
	
	public static int add(int a, int b) {
		return a + b;
	}
	
	public static int subtract(int a, int b) {
		return a - b;
	}
	
	public static int multiply(int a, int b) {
		return a * b;
	}
	
	public static int divide(int a, int b) {
		if (b == 0) {
	        throw new ArithmeticException("除算エラー：0で割ることはできません");
	    }
		return a / b;
	}
	
	public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
	
	public static void main(String[] args) {
		System.out.println("addメソッドの実行結果 " + StaticMethod_Calculator.add(5, 6));
		System.out.println("subtractメソッドの実行結果 " + StaticMethod_Calculator.subtract(7, 5));
		System.out.println("multiplyメソッドの実行結果 " + StaticMethod_Calculator.multiply(5, 5));
		System.out.println("divideメソッドの実行結果 " + StaticMethod_Calculator.divide(10, 2));
		System.out.println("maxメソッドの実行結果 " + StaticMethod_Calculator.max(5, 6));
		System.out.println("divideメソッドの実行結果(0での除算) " + StaticMethod_Calculator.divide(10, 0));
	}
}

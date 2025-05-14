
public class method {
	
	public static void showMessage(String message) {
	    System.out.println(message);
	}
	
	public static int add(int a, int b) {
	    int result = a + b;
	    return result;
	}
	
	public static void greet() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("こんにちは！Javaプログラミングの世界へようこそ！");
	}
	
	public static void showTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
	}
	
	public static double calcAverage(int a, int b, int c) {
		return (a + b + c) / 4.0;
	}
	

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		showMessage("こんにちは");  //  「こんにちは」が表示される
		
		int kei = add(1,4);
		
		System.out.println(kei);
		
		greet();
		
		showTriangle(3);
		
		double avg = calcAverage(12, 56, 78);
		
		System.out.println(avg);
		
	}

}

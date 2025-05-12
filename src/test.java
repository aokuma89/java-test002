import java.util.Random;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int num1 = 4;
		int num2 = 6;
		int num3 = num1*num2;
		
		System.out.println("縦幅" + num1 + "横幅" + num2 + "の長方形の面積は、" + num3);
		
		System.out.println(3+5*2);
		
		int ten = 10;
		System.out.println(++ten);
		
		System.out.println("Hello"+5);
		
		System.out.println("Hello");
		System.out.print("Hello");
		
		int i = (int) 7.9;
		System.out.println("　"+i);
		
		int result = 8/3;
		double result2 = 8 / 3.0;
		
		System.out.println(Math.max(4, 2));
		
		System.out.println(result);
		System.out.println(result2);
		
		System.out.println("\"java\"の勉強");
		
		int a = 3;
		int b = 5;
		
		System.out.println(Math.max(a + 2, b - 1));
		
		System.out.println();
		
		int taiju = 31;
		if (taiju > 30) {
			System.out.println("大きいね！");
		}
		
		for (int count = 1; count <= 10; count++) {
			System.out.println(count);
		}
		
		for (int count = 1; count <= 10; count++) {
			if (count % 2 == 0) {
				System.out.println(count);
			}
		}
		

        System.out.print("「グー」「チョキ」「パー」のいずれかを入力してください: ");
        String userHand = new Scanner(System.in).nextLine();

        String[] hands = {"グー", "チョキ", "パー"};
        int computerIndex = new Random().nextInt(3);
        String computerHand = hands[computerIndex];

        System.out.println("お前: " + userHand);
        System.out.println("コンピューター: " + computerHand);

        // 勝敗判定
        if (userHand.equals(computerHand)) {
            System.out.println("あいこ");
        } else if (
            (userHand.equals("グー") && computerHand.equals("チョキ")) ||
            (userHand.equals("チョキ") && computerHand.equals("パー")) ||
            (userHand.equals("パー") && computerHand.equals("グー"))
        ) {
            System.out.println("勝ち");
        } else {
            System.out.println("負け");
        }

		
	}

}

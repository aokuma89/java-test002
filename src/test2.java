import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] numList = {3, 4, 9};
		System.out.println("1から10までの好きな数字を入力して、あたりを当ててください。");
		int userNum = Integer.parseInt(new Scanner(System.in).nextLine());
		
		if (numList[0] == userNum || numList[1] == userNum || numList[2] == userNum) {
			System.out.println("あたりです");
		} else { 
			System.out.println("はずれです");
		}
		
		System.out.println();
		
		String[] myFavoriteFood = {"ラーメン", "ハンバーグ", "からあげ", "ステーキ", "机(荻野)"};
		
		for (int count = 0; count < myFavoriteFood.length; count++) {
			System.out.println(myFavoriteFood[count]);
		}
		
		System.out.println();
		
		int[] numSum = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int sum = 0;
		
		for (int count2 = 0; count2 < numSum.length; count2++) {
			sum += numSum[count2];
		}
		System.out.println(sum);
		
		System.out.println();
		
		String[] friendName = {"牧原", "進藤", "鈴木", "荻野"};
		
		for (int count3 = 0; count3 < friendName.length; count3++) {
			System.out.println(friendName[count3]);
		}
	}
}

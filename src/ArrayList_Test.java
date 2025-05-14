import java.util.ArrayList;

public class ArrayList_Test {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ArrayList<String> fluits = new ArrayList<>();
		
		fluits.add("りんご");
		fluits.add("みかん");
		fluits.add("バナナ");
		fluits.add("レモン");
		
		fluits.add(0, "いちご");
		
		fluits.set(3, "ぶどう");
		
		
		System.out.println("果物 : "+ fluits);
		System.out.println(fluits.get(1));

		if (fluits.contains("みかん")) {
			fluits.remove("みかん");
			System.out.println("みかんを削除しました");
			System.out.println("果物 : "+ fluits);
		} else {
			System.out.println("要素を確認できませんでした");
			System.out.println("果物 : "+ fluits);
		}
	}

}

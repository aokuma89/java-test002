import java.util.ArrayList;
import java.util.Collections;


public class List_Copy {
	public static void main(String[] args) {
		
		ArrayList<String> members = new ArrayList<>();
        members.add("kirishima");
        members.add("midorikawa");
        members.add("rokumura");
        // 以下にコードを追加
        
        ArrayList<String> members_copy = new ArrayList(members);
        members_copy.add("nara");
        
        System.out.println("members ：" + members);
        System.out.println("members_copy ：" + members_copy);
        
        ArrayList<String> fruits1 = new ArrayList<>();
        fruits1.add("apple");
        fruits1.add("banana");
        fruits1.add("orange");
        
        ArrayList<String> fruits2 = new ArrayList<>();
        fruits2.add("grape");
        fruits2.add("kiwi");
        fruits2.add("melon");
        
        //  ここに2 つのリストを結合し、ソートするコードを追加
        fruits1.addAll(fruits2);
        
        Collections.sort(fruits1);
        
        //  出力結果: [apple, banana, grape, kiwi, melon, orange]
        System.out.println(fruits1);
	}
}

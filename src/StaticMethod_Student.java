
public class StaticMethod_Student {
	static int count = 0;

    public StaticMethod_Student() {
        count++;
    }

    public static void showCount() {
        System.out.println("作られた人数：" + count);
    }

    public static void main(String[] args) {
    	int student = 10;  // ここで追加する人数を定義

        for (int i = 0; i < student; i++) {
            new StaticMethod_Student();  // インスタンスを作成
        }

        // 現在の人数を表示
        StaticMethod_Student.showCount();
    }
}

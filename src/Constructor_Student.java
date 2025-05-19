public class Constructor_Student {
    private String name;
    private int score;

    // コンストラクタ
    Constructor_Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    // clone メソッド
    public Constructor_Student clone() {
        return new Constructor_Student(this.name, this.score);
    }

    // 表示用のメソッド
    public void displayinfo(String label) {
        System.out.println(label + ": " + name + ", " + score);
    }


    public static void main(String[] args) {
        Constructor_Student student1 = new Constructor_Student("田中", 90);
        Constructor_Student student2 = student1; // 参照を代入
        Constructor_Student student3 = student1.clone(); // cloneでコピー

        student3.score = 85; // student3 のスコアだけ変更

        // 結果を表示
        student1.displayinfo("student1");
        student2.displayinfo("student2");
        student3.displayinfo("student3");
    }
}


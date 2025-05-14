
public class Constructor_Book {
	
//	フィールド
    private String title;
    private String author;
    
//  コンストラクタ
    public Constructor_Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
//  表示のための関数
    public void displayInfo() {
        System.out.println("タイトル: " + title);
        System.out.println("著者: " + author);
    }
    
//  mainメソッド
    public static void main(String[] args) {
        Constructor_Book book = new Constructor_Book("源氏物語", "紫式部");
        book.displayInfo();
    }
}

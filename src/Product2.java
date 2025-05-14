
public class Product2 {
	
	private String name;
    private int price;
    private int productId;
    private static int idCounter = 1;

    static {
        System.out.println("Product クラスが初期化されました");
    }

    // デフォルト
    public Product2() {
        this.name = "商品名未設定";
        this.price = 0;
        this.productId = idCounter++;
    }

    // 名前のみ
    public Product2(String name) {
        this.name = name;
        this.price = 0;
        this.productId = idCounter++;
    }

    // 全項目指定
    public Product2(String name, int price) {
        this.name = name;
        this.price = price;
        this.productId = idCounter++;
    }

    // 商品名変更
    public void setName(String name) {
        this.name = name;
    }

    // 価格変更
    public void setPrice(int price) {
        this.price = price;
    }

    // 商品情報表示
    public void displayInfo() {
        System.out.println("商品ID: " + productId);
        System.out.println("商品名: " + name);
        System.out.println("価格: " + price + " 円");
    }

    // 合計金額
    public static int calculateTotalPrice(Product2[] products) {
        int total = 0;
        for (Product2 p : products) {
            total += p.price;
        }
        return total;
    }

    public static void main(String[] args) {
        Product2[] products = new Product2[6];
        
        products[0] = new Product2(); // デフォルトコンストラクタ
        products[1] = new Product2("ノートパソコン");
        products[2] = new Product2("スマートフォン", 80000);
        products[3] = new Product2("タブレット", 70000);
        products[4] = new Product2("モニター", 50000);
        products[5] = new Product2("キーボード", 5000);

        System.out.println("---  商品1 ---");
        products[0].displayInfo();
        System.out.println("---  商品2 ---");
        products[1].displayInfo();
        System.out.println("---  商品3 ---");
        products[2].displayInfo();
        System.out.println("---  商品4 ---");
        products[5].displayInfo();

        System.out.println("---   価格変更後 ---");
        products[0].setName("デスクトップPC");
        products[0].setPrice(50000);
        System.out.println("---  商品1 ---");
        products[0].displayInfo();

        int total = Product2.calculateTotalPrice(products);
        System.out.println("合計金額: " + total + " 円");
    }

}

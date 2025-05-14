import java.util.ArrayList;

public class Product_arraylist {

	private String name;
    private int price;
    private int productId;
    private static int idCounter = 1;

    static {
        System.out.println("Product クラスが初期化されました");
    }

    // デフォルト
    public Product_arraylist() {
        this.name = "商品名未設定";
        this.price = 0;
        this.productId = idCounter++;
    }

    // 名前のみ
    public Product_arraylist(String name) {
        this.name = name;
        this.price = 0;
        this.productId = idCounter++;
    }

    // 全項目指定
    public Product_arraylist(String name, int price) {
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

    // 合計金額（ArrayList版）
    public static int calculateTotalPrice(ArrayList<Product_arraylist> products) {
        int total = 0;
        for (Product_arraylist p : products) {
            total += p.price;
        }
        return total;
    }

    public static void main(String[] args) {
        // ArrayListを使った商品管理
        ArrayList<Product_arraylist> products = new ArrayList<>();

        // 商品の追加
        products.add(new Product_arraylist()); // デフォルト
        products.add(new Product_arraylist("ノートパソコン"));
        products.add(new Product_arraylist("スマートフォン", 80000));
        products.add(new Product_arraylist("タブレット", 70000));
        products.add(new Product_arraylist("モニター", 50000));
        products.add(new Product_arraylist("キーボード", 5000));

        // 商品情報の一部を表示
        System.out.println("---  商品1 ---");
        products.get(0).displayInfo();
        System.out.println("---  商品2 ---");
        products.get(1).displayInfo();
        System.out.println("---  商品3 ---");
        products.get(2).displayInfo();
        System.out.println("---  商品4 ---");
        products.get(5).displayInfo(); // 6番目の要素

        // 価格変更
        System.out.println("---   価格変更後 ---");
        products.get(0).setName("デスクトップPC");
        products.get(0).setPrice(50000);
        System.out.println("---  商品1 ---");
        products.get(0).displayInfo();

        // 合計金額を計算
        int total = Product_arraylist.calculateTotalPrice(products);
        System.out.println("合計金額: " + total + " 円");
    }

}


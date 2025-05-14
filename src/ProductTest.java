
public class ProductTest {
	
	static class Product {
        private String name;
        private int price;
        private int productId;
        private static int idCounter = 1;

        static {
            System.out.println("Productクラスが初期化されました");
        }

        public Product() {
            this.name = "商品名未設定";
            this.price = 0;
            this.productId = idCounter++;
        }

        public Product(String name) {
            this.name = name;
            this.price = 0;
            this.productId = idCounter++;
        }

        public Product(String name, int price) {
            this.name = name;
            this.price = price;
            this.productId = idCounter++;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public void displayInfo() {
            System.out.println("商品ID: " + productId);
            System.out.println("商品名:  " + name);
            System.out.println("価格: " + price + " 円");
        }

        public static int calculateTotalPrice(java.util.List<Product> products) {
            int total = 0;
            for (Product p : products) {
                total += p.price;
            }
            return total;
        }
    }

    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product("ノートパソコン");
        Product p3 = new Product("スマートフォン", 80000);
        Product p4 = new Product("タブレット", 70000);
        Product p5 = new Product("モニター", 50000);

        System.out.println("---  商品1 ---");
        p1.displayInfo();
        System.out.println("---  商品2 ---");
        p2.displayInfo();
        System.out.println("---  商品3 ---");
        p3.displayInfo();

        System.out.println("---   価格変更後 ---");
        p1.setName("デスクトップPC");
        p1.setPrice(50000);
        System.out.println("---  商品1 ---");
        p1.displayInfo();

        java.util.List<Product> productList = new java.util.ArrayList<>();
        productList.add(p1);
        productList.add(p2);
        productList.add(p3);
        productList.add(p4);
        productList.add(p5);

        int total = Product.calculateTotalPrice(productList);
        System.out.println("合計金額: " + total + " 円");
    }
    
}


public class Constructor_Rectangle {
		private int width;
		private int height;

		// 引数なしのコンストラクタ
		public Constructor_Rectangle() {
			this.width = 1;
			this.height = 1;
		}

		// 1つの引数を受け取るコンストラクタ（正方形）
		public Constructor_Rectangle(int size) {
			this.width = size;
			this.height = size;
		}

		// 2つの引数を受け取るコンストラクタ（幅と高さを個別に設定）
		public Constructor_Rectangle(int width, int height) {
			this.width = width;
			this.height = height;
		}

		// 面積を計算するメソッド
		public int area() {
			return width * height;
		}

		// main メソッドでテスト
		public static void main(String[] args) {
			Constructor_Rectangle rect1 = new Constructor_Rectangle();         // 幅1, 高さ1
			Constructor_Rectangle rect2 = new Constructor_Rectangle(5);        // 幅5, 高さ5
			Constructor_Rectangle rect3 = new Constructor_Rectangle(3, 4);     // 幅3, 高さ4

			System.out.println("rect1の面積: " + rect1.area());
			System.out.println("rect2の面積: " + rect2.area());
			System.out.println("rect3の面積: " + rect3.area());
		}
	}


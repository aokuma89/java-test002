
public class Constructor_Person {
		private String name;
		private int age;

		public Constructor_Person(String name, int age) {
			this.name = name;
			this.age = age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public void printInfo() {
			System.out.println("名前: " + name + ", 年齢: " + age + "歳");
		}

		public static void main(String[] args) {
			Constructor_Person[] people = new Constructor_Person[3];
			people[0] = new Constructor_Person("牧原", 25);
			people[1] = new Constructor_Person("鈴木", 30);
			people[2] = new Constructor_Person("進藤", 22);

			System.out.println("===== 初期状態 =====");
			for (Constructor_Person p : people) {
				p.printInfo();
			}

			people[0].setAge(26);     
			people[1].setAge(22);
			people[2].setAge(22);

			System.out.println("\n===== 変更後 =====");
			for (Constructor_Person p : people) {
				p.printInfo();
			}
		}
		
}

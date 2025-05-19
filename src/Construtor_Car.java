
public class Construtor_Car {
	private String model;
	private int year;
	
	public Construtor_Car(String model, int year) {
		this.model = model;
		this.year = year;
	}
	

	public void printCarInfo() {
		if (this.model != null) {
			System.out.println("車の情報: " + this.model + " (" + this.year + "年)");
		} else {
			System.out.println("車の情報: 利用できません");
		}
	}
	
	public static void printCarInfo(Construtor_Car car) {
		if (car != null) {
			car.printCarInfo();
		} else {
			System.out.println("車の情報: 利用できません");
		}
	}
	
	public static void main(String[] args) {
		Construtor_Car car1 = new Construtor_Car("プリウス", 2022);
		Construtor_Car car2 = null;
		Construtor_Car car3 = new Construtor_Car(null, 0);

		// 安全に呼び出す
		printCarInfo(car1);
		printCarInfo(car2);
		printCarInfo(car3);
	}
}

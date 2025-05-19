
public class StaticMethod_AppConfig {
	
	static final String APP_NAME = "MyApp";
	static final double VERSION = 1.0;
	
	public static void main(String[] args) {
		System.out.println("アプリ名 ： " + StaticMethod_AppConfig.APP_NAME + " / " + "バージョン ： " + StaticMethod_AppConfig.VERSION);
	}
}

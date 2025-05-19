
public class StaticMethod_TestResult {
	
	static int totalScore;
	static int studentCount;
	
	public StaticMethod_TestResult(int score) {
		totalScore += score;
		studentCount++;
	}
	
	public static double average() {
		return (double) totalScore / studentCount;
	}
	
	public static void main(String[] args) {
		 new StaticMethod_TestResult(80);
         new StaticMethod_TestResult(90);
         new StaticMethod_TestResult(70);
         
         System.out.println("平均点：" + StaticMethod_TestResult.average());
	}
}

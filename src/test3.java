
public class test3 {
	
	public static int sum(int a, int b) {
		return a + b;
	}
	
	public static double calculateCircleArea(double a) {
		return 3.14 * a * a;
	}
	
	public static void checkEvenOdd(int a) {
		if (a % 2 == 0){
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
	}
	
	public static void repeat(String a, int b) {
		for(int count = 0; count < b; count++) {
			System.out.println(a);
		}
	}
	
	public static int findMax(int a, int b, int c) {
		int max = a;
		
		if (b > max) {
			max = b;
		} 
		if (c > max) {
			max = c;
		}
		return max;
	}
	
	public static int calculateArea(int a) {
		return a * a;
	}
	
	public static int calculateArea(int a, int b) {
		return a * b;
	}
	
	public static double calculateArea(double a, double b) {
		return a * b / 2;
	}
	
	public static double[] calculateStats(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
		    int num = a[i];
		    sum += num;
		}
		
		double avg = (double)sum / a.length;
		
		return new double[]{sum, avg};
	}
	
	public static void isprime(int a){
		if (a < 2) {
			System.out.println("false");
		}
		for (int i = 2; i < a; i++) {
		      if (a % i == 0) {
		        System.out.println("false");
		        return;
		      }
		}
		System.out.println("true");
	}
	
    public static int findMode(int[] nums) {
        int maxCount = 0;
        int mode = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int count = 0;

            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                mode = nums[i];
            }
            
            else if (count == maxCount && nums[i] < mode) {
                mode = nums[i];
            }
        }

        return mode;
    }
    
    public static double calculator(double a, String b, double c) {
    	switch(b){
    		case "+":
    			return a + c;
    		case "-":
    			return a - c;
    		case "*":
    		case "x":
    			return a * c;
    		case "/":
    		case "÷":
    			if (c == 0) {
                    throw new IllegalArgumentException("0で割ることはできません。");
                }
                return a / c;
            default:
                throw new IllegalArgumentException("無効な演算子です: " + b);
    	}
    }
	

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int sum = sum(5, 6);
		
		System.out.println(sum);
		
		double r = calculateCircleArea(5.0);
		System.out.println(r);
		
		checkEvenOdd(3);
		
		repeat("こんにちは", 3);
		
		System.out.println(findMax(67, 495, 35));
		
		int[] data = {10, 20, 30, 40, 50};
		double[] result = calculateStats(data);
		
		System.out.println(result[0]);
		System.out.println(result[1]);
		
		isprime(11);
		
		int[] nums = {4, 1, 2, 2, 2, 3, 3, 4, 4};
		System.out.println(findMode(nums));
		
	}

}

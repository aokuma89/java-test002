import java.util.ArrayList;
import java.util.Collections;

public class Collections_Test {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		numbers.add(8);
		numbers.add(1);
		numbers.add(3);
		
		Collections.reverse(numbers);
		
		System.out.println(numbers);
		
		Collections.sort(numbers);
		
		System.out.println(numbers);
		
		Collections.sort(numbers, Collections.reverseOrder());
		
		System.out.println(numbers);
		
	}
	
}

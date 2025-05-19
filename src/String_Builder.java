
public class String_Builder {
	
	public static String reverseString(String input) {
	    String reversed = "";
	    for (int i = input.length() - 1; i >= 0; i--) {
	        reversed += input.charAt(i);
	    }
	    return reversed;
	}
	
	public static String reverseStringBuilder(String input) {
	    return new StringBuilder(input).reverse().toString();
	}
	
	public static int countChar(String str, char target) {
	    StringBuilder sb = new StringBuilder(str);
	    int count = 0;
	    for (int i = 0; i < sb.length(); i++) {
	        if (sb.charAt(i) == target) {
	            count++;
	        }
	    }
	    return count;
	}
	
	public static String removeVowels(String input) {
	    StringBuilder sb = new StringBuilder();
	    for (int i = 0; i < input.length(); i++) {
	        char c = input.charAt(i);
	        if (!"aeiouAEIOU".contains(String.valueOf(c))) {
	            sb.append(c);
	        }
	    }
	    return sb.toString();
	}
	
	public static boolean isPalindrome(String input) {
	    String reversed = new StringBuilder(input).reverse().toString();
	    return input.equals(reversed);
	}
	
	public static String reverseWords(String input) {
	    String[] words = input.split(" ");

	    // 逆順
	    StringBuilder sb = new StringBuilder();
	    for (int i = words.length - 1; i >= 0; i--) {
	        sb.append(words[i]);
	        if (i != 0) sb.append(" ");
	    }

	    return sb.toString();
	}


	
	public static void main(String[] args) {
		//文字を逆順
		System.out.println(reverseString("Hello"));
		System.out.println(reverseStringBuilder("Hello"));
		
		//指定した文字を数える
		System.out.println(countChar("Hello World", 'l'));
		
		//母音を削除
		System.out.println(removeVowels("Hello World"));
		
		//回文かチェック
		System.out.println(isPalindrome("level"));
		System.out.println(isPalindrome("orange"));
		
		//単語を逆順
		System.out.println(reverseWords("Hello World"));
	}
}

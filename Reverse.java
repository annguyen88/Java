import java.util.*;

public class Reverse {
	public static void main(String args[]) {
		String word = "Hello";
		System.out.println(reverse2(word));
	}
	
	public static String reverse1(String text) {
	 int wordlength = text.length();
	for(int i = wordlength; i > 0; i--) {
		text = text.concat(text.substring(i-1, i));
		}	
	text = text.substring(wordlength, text.length());		
	return text;
	}
	public static String reverse2(String text) {
		if (text.length() == 0)
			return text;
		return reverse2(text.substring(1)) + text.charAt(0);
	}
}

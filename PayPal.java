

package week3;

import java.util.LinkedHashSet;
import java.util.Set;

public class PayPal {

	public static void main(String[] args) {
		
		String text = "PayPal India ";
		char[] word = text.toCharArray();
		Set<Character> charSet = new LinkedHashSet<Character>();
		Set<Character> dupCharSet = new LinkedHashSet<Character>();
		for (int i = 0; i < word.length; i++) {
			if (charSet.contains(word[i])) {
				dupCharSet.add(word[i]);
			} else {
				charSet.add(word[i]);
			}
			for (Character D : dupCharSet) {
				charSet.remove(D);
			}
			charSet.remove(' ');
		}
		System.out.println("Characters's In CharSet are: ");
		for (Character C : charSet) {
			System.out.println(C);
		}

	}
}
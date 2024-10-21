package level1_programs;

public class PalindromeExample {
	public static void main(String... args) {
		String inputString = "aabaa"; // String to be reversed
		System.out.println(
				isPalindrome(inputString) ? inputString + " is a palindrome." : inputString + "is not a palindrome.");
	}

	/*
	 * returns true if inputString is palindrome.
	 */
	public static boolean isPalindrome(String inputString) {
		char ar[] = inputString.toCharArray();
		for (int i = 0, j = ar.length - 1; i < (ar.length / 2); i++, j--) {
			if (ar[i] != ar[j])
				return false;
		}
		return true;
	}

}

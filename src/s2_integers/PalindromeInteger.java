package s2_integers;

public class PalindromeInteger {
	private static void isPalindrome(final int number) {
		int originalNum = number;
		int reverseNum = 0;
		while (originalNum > 0) {
			final int reminder = originalNum % 10;
			reverseNum = (reverseNum * 10) + reminder;
			originalNum = originalNum / 10;
		}
		if (number == reverseNum) {
			System.out.println(number + " is Palindrome.");
		} else {
			System.out.println(number + " is not Palindrome.");
		}
	}

	public static void main(final String[] args) {
		int number = 12321;
		System.out.println("Please enter the number : " + number);
		isPalindrome(number);

		number = 12324;
		System.out.println("Please enter the number : " + number);
		isPalindrome(number);
	}
}

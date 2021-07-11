package s2_integers;

import java.util.ArrayList;
import java.util.List;

/*
	WAP that outputs the String representation of numbers from 1 to n.
	But for multiple of 3 it should output "Fizz" and for multiple of 5 it should output "Buzz".
	For a number which are multiple of both 3 and 5 output "FizzBuzz".
	
 */
public class FizzBuzzPattern {

	private static void displayFizzbuzz(final int number) {
		final List<String> list = new ArrayList<>();
		for (int i = 1; i <= number; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				list.add("FizzBuzz");
			} else if (i % 3 == 0) {
				list.add("Fizz");
			} else if (i % 5 == 0) {
				list.add("Buzz");
			} else {
				list.add(String.valueOf(i));
			}
		}
		System.out.println(list);
	}

	public static void main(final String[] args) {
		int number = 20;
		System.out.println("Please enter the number : " + number);
		displayFizzbuzz(number);

		number = 45;
		System.out.println("Please enter the number : " + number);
		displayFizzbuzz(number);
	}
}

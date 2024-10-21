package level2_programs;

public class SumOfDigitsInNumberRecursion {
	public static void main(String... args) {

		int number = 1234;

		System.out.println("number     : " + number);
		System.out.println("sum of digits : " + sumOfDigitsUsingRecursion(number));

	}

	/**
	 * method returns sum of digits using recursion.
	 */
	static int sum = 0;

	public static int sumOfDigitsUsingRecursion(int number) {

		if (number == 0) {
			return sum;
		} else {
			sum = sum + (number % 10);
			sumOfDigitsUsingRecursion(number / 10);
		}
		return sum;
	}

}

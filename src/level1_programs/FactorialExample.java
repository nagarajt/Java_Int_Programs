package level1_programs;

public class FactorialExample {
	public static void main(String... args) {
		int num = 4;
		System.out.println("Factorial of " + num + " is: " + findFactorail(num));
	}

	/*
	 * return factorial of num.
	 */
	public static int findFactorail(int num) {
		int factorial = 1;
		while (num > 0) {
			factorial = factorial * num;
			num--;
		}
		return factorial;
	}

}

package level1_programs;

public class OccurrenceOfNumberInCubeExample {
	public static void main(String[] args) {

		long num = 1551;
		int occurrenceOf = 3; // calculate OccurrenceOf this digit in number.

		System.out.println("Cube of entered number(" + num + ") is: " + num * num * num);
		System.out.println("Occurrence of " + occurrenceOf + " in cube of " + num + " is: "
				+ calculateOccurrenceOf(num, occurrenceOf));

	}

	/**
	 * method return OccurrenceOf digit in cube of given number.
	 */
	public static int calculateOccurrenceOf(long num, int occurrenceOf) {
		long cubeOfNumber = num * num * num;
		int count = 0;

		while (cubeOfNumber > 0) {
			if (cubeOfNumber % 10 == occurrenceOf) {
				count++;
			}
			cubeOfNumber = cubeOfNumber / 10;
		}
		return count;
	}

}

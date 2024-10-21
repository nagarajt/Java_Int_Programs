package level1_programs;

public class FindTwoMaximumNumbersInArrayExample {
	public static void main(String a[]) {
		int ar[] = { 66, 7, 9, 70, 89, 11, 2, 93 };
		int maximum1 = 0;
		int maximum2 = 0;

		for (int i = 0; i < ar.length; i++) { // only one iteration
			if (maximum1 < ar[i]) {
				maximum2 = maximum1;
				maximum1 = ar[i];
			} else if (maximum2 < ar[i]) {
				maximum2 = ar[i];
			}
		}

		System.out.println("Maximum1 : " + maximum1);
		System.out.println("Maximum2 : " + maximum2);
	}

}

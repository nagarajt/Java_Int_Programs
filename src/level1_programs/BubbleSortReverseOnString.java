package level1_programs;

public class BubbleSortReverseOnString {
	String sortMethod(String s) {

		char ch[] = s.toCharArray();
		char chTemp;

		// bubble Sort - to perform sorting
		for (int i = ch.length - 1; i > 1; i--) {
			for (int j = 0; j < i; j++) {
				if (ch[j] < ch[j + 1]) {
					// Swap logic in below 3 lines
					chTemp = ch[j];
					ch[j] = ch[j + 1];
					ch[j + 1] = chTemp;
				}
			}
		}

		return new String(ch);
	}

	public static void main(String[] args) {
		BubbleSortReverseOnString o = new BubbleSortReverseOnString();
		String stringToBeSorted = "java";
		// String stringToBeSorted= "javaMadeSoEasy"; //Test String
		System.out.println(o.sortMethod(stringToBeSorted));
	}

}

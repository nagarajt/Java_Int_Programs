package level1_programs;

/**
 * This class holds reference of array, which has to be sorted. And performs
 * Selection sorting in java
 */
class SelectionSortArray {

	private int[] ar;
	private int index; // holds current position of array, by default it is initialized with 0

	/**
	 * Constructor for initializing Array
	 */
	public SelectionSortArray(int maxSize) {
		ar = new int[maxSize]; // creation of array
		index = 0;
	}

	/**
	 * This method inserts elements in Array.
	 */
	public void insert(int value) {
		ar[index++] = value; // increment the current index
	}

	/**
	 * This method Sort Array using Selection Sort in java
	 */
	public void selectionSort() {
		int outer, inner, minimum;
		for (outer = 0; outer < index - 1; outer++) // outer loop
		{
			minimum = outer;
			for (inner = outer + 1; inner < index; inner++)// inner loop
				if (ar[inner] < ar[minimum]) // if minimum greater,
					minimum = inner; // we have a new minimum

			swap(outer, minimum); // swap them
		}
	}

	/**
	 * This method swaps two elements in Array
	 */
	private void swap(int pos1, int pos2) {
		int temp = ar[pos1];
		ar[pos1] = ar[pos2];
		ar[pos2] = temp;
	}

	/**
	 * This method Display Array
	 */
	public void display() {
		for (int i = 0; i < index; i++)
			System.out.print(ar[i] + " ");
		System.out.println("");
	}

}

/**
 * Main class - Which will call SelectionSorting class
 */
public class SelectionSortAlgorithmExample {
	public static void main(String[] args) {

		int maxSize = 10; // initial size of Array

		SelectionSortArray selectionSortArray;
		selectionSortArray = new SelectionSortArray(maxSize); // creation of array

		selectionSortArray.insert(21);
		selectionSortArray.insert(1);
		selectionSortArray.insert(31);
		selectionSortArray.insert(51);
		selectionSortArray.insert(41);
		selectionSortArray.insert(91);
		selectionSortArray.insert(61);
		selectionSortArray.insert(32);
		selectionSortArray.insert(36);
		selectionSortArray.insert(93);

		System.out.print("Display Array elements before Selection sorting: ");
		selectionSortArray.display(); // display Array elements before sorting

		selectionSortArray.selectionSort(); // Selection sort the array

		System.out.print("Display Array elements after Selection sorting: ");
		selectionSortArray.display(); // display Array elements after sorting

	}
}

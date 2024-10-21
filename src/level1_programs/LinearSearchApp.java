package level1_programs;

/**
 *This class holds reference of array, in which data has to be searched.
 */
class LinearSearchArray {
 
    private int ar[];
    private int index; // holds current position of array, by default it is initialized with 0
 
    /**
     * Constructor for initializing array
     */
    public LinearSearchArray(int maxSize) {
           ar = new int[maxSize];
    }
 
    /**
     * Insert values into array
     */
    public void insert(int value) {
 
           ar[index++] = value; // increment the current index
    }
 
    /**
     * Find element using Linear search
     */
    public void linearSearch(int key) {
           
           int i;
           for (i = 0; i < index; i++){                 
                  if (ar[i] == key){ // This condition founds out whether we have found element.
                        System.out.print("\nElement=" + key + " found at position="   + i);
                        return; // We have found element, so exit for loop.
                  }
           }
           
           //Reaching this part of method means element wasn't found.
           System.out.print("\nElement=" + key + " not found");  
           
    }
 
    /**
     * Display Array
     */
    public void display() {
           System.out.print("Displaying Array: ");
           for (int i = 0; i < index; i++) {
                  System.out.print(ar[i] + " ");
           }
 
    }
    
}
  
  
  
/** Copyright (c), AnkitMittal www.JavaMadeSoEasy.com */
/**
 * Main class
 */
public class LinearSearchApp {
    public static void main(String[] args) {
 
           int maxSize = 10; // Initial size of array
 
           LinearSearchArray lSearchArray = new LinearSearchArray(maxSize);
 
           lSearchArray.insert(11);
           lSearchArray.insert(22);
           lSearchArray.insert(33);
           lSearchArray.insert(99);
           lSearchArray.insert(55);
           lSearchArray.insert(77);
           lSearchArray.insert(66);
           lSearchArray.insert(88);
           lSearchArray.insert(44);
           lSearchArray.insert(1);
 
           lSearchArray.display();
 
           lSearchArray.linearSearch(88); // FOUND
           lSearchArray.linearSearch(-1); // NOT FOUND
           lSearchArray.linearSearch(73); // NOT FOUND
    }
}

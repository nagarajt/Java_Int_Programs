package level1_programs;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicatNumberInListExample {
	  public static void main(String[] args) {
          List<Integer> list = new ArrayList<Integer>();      
          for (int i = 1; i <= 10; i++) {
                 list.add(i);
          }
          list.add(5);  //add duplicate number in list.
          list.add(10); //add another duplicate number in list.
          findDuplicateNumbersInList(list);
   }

   /*
    * Method prints duplicate numbers in List and returns list of non-duplicate numbers.
    */
   public static List<Integer> findDuplicateNumbersInList(List<Integer> list) {
          List<Integer> listWithoutDuplicates = new ArrayList<Integer>();
          System.out.println("list is: "+list);
          System.out.print("Duplicate numbers in list are: ");
          for (int i : list) {
                 if (listWithoutDuplicates.contains(i))
                       System.out.print(i+" ");
                 else
                       listWithoutDuplicates.add(i);
          }
          return listWithoutDuplicates;

   }

}

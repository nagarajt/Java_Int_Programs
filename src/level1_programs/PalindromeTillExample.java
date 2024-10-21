package level1_programs;

public class PalindromeTillExample {
	 public static void main(String[] args) {
         System.out.println("List of Palindrome between 1 to 1000");
         for(int i=10; i<=1000; i++){
                char[] ar = String.valueOf(i).toCharArray();
                boolean isPalindrome = true;
                for(int j=0;j<ar.length/2;j++){
                      if(ar[j]!=ar[ar.length-1-j]){
                             isPalindrome =false;
                             break;
                      }
                }
                if(isPalindrome)
                      System.out.println(i);                
         }
  }

}

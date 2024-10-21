package level1_programs;

public class SwapNumbersWithoutThirdVariableExample {
	public static void main(String[] args) {
        int n1 = 7, n2 = 5;
        
        System.out.println("before swapping, n1= " + n1 + " and n2= " + n2);
        
        n1 = n1 + n2;
        n2 = n1 - n2;
        n1 = n1 - n2;
        
        System.out.println("After swapping , n1= " + n1 + " and n2= " + n2);
        
 }

}

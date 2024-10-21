package level2_programs;

import java.util.ArrayList;
import java.util.List;

public class CombinationsInString {
	 public static void main(String[] args) {
         String s="hello";
         List<String> l=combinations(s);
         System.out.println(l);
  }
  
  /**
   * method returns required combinations of string.
   */
  static List<String> combinations(String s){
         
         List<String> l=new ArrayList<String>();
         char ch[]=s.toCharArray();
         
         for(int i=0;i<ch.length;i++){  
                int j=i;
                myRecursion(i,j,ch.length,ch,l);
                
         }
         return l;
  }
  
  static void myRecursion(int i,int j, int chLength,char ch[], List<String> l){
         
         char subStringChar[]=new char[(j+1)-i];
         int subStringCharIndex=0;
         int iReference=i;
         while(iReference<=j){
                subStringChar[subStringCharIndex++]=ch[iReference++];
         }
         l.add(new String(subStringChar));
         
         
         if(j+1==chLength){
                return;
         }
         myRecursion(i,j+1, chLength,ch,l);
  }

}

/*OUTPUT

[h, he, hel, hell, hello, e, el, ell, ello, l, ll, llo, l, lo, o]
 
*/

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.lang.Math;
import java.util.Iterator;

/**
   Implement a method for computing prime numbers. This method will
   compute all prime numbers up to n.
   Choose n
   Insert all numbers from 2 to n into a set
   Then erase all multiples of 2 (except2) 4,6,8,10,12 ...
   Erase all mulitples of 3; 6,9,12,15
   go up to square root of n then print the set

*/


// n = 36
// [
// n < 6
public class Primes
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.println("Compute primes up to which integer?");
      int n = in.nextInt();
      Set<Integer> numSet = new TreeSet<>(); 
      
      
      for(int i=2; i<n; i++){
         numSet.add(i);
      }
      
      Iterator<Integer> iter = numSet.iterator();
      int temp = numSet.size();
      for(int j=0; j<temp/Math.sqrt(n); j++){ 
          
          for(int i=2; i<Math.sqrt(n); i++){ //2, 3, 4, 5, 6, 7    50
              /*iter.next();
              iter.next();
              iter.next();
              iter.remove();*/
              if(iter.next()%i==0)iter.remove(); // 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12    --> 3
              //iter.previous();
             // iter.next();
         }
      }
      
      System.out.println(numSet);
   }    
}
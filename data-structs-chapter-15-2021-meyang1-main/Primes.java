
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

public class Primes
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.println("Compute primes up to which integer?");
      int n = in.nextInt();
      Set<Integer> numSet = new TreeSet<>(); //TreeSet so ordered and can locate faster
                                             //HashSet more efficient since only go
      
      for(int i=2; i<n; i++){
         numSet.add(i);
      }
      
      Iterator<Integer> iter = numSet.iterator();
      int temp = numSet.size();
      for(int k =2; k*k <=n; k++){ // k = number
          for(int i =2; i*k <=n; i++){ //i = 2 remove all multiples of i*k 2*2, 3*2, 4*2 ...
              numSet.remove(i*k);
          }
      }
      System.out.println(numSet);     
       
   }    
}

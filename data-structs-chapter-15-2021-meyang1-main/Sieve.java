import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
   A program that implements the sieve of Eratosthenes.
*/
public class Sieve
{  
   public static void main(String[] args)
   { 
      Scanner in = new Scanner(System.in);
      System.out.println("Compute primes up to which integer?");
      int n = in.nextInt();
      Set<Integer> s = new TreeSet<>();
      for (int i = 2; i <= n; i++)
         s.add(i);

      for (int k = 2; k * k <= n; k++)
         for (int i = 2; i * k <= n; i++)
            s.remove(i * k);

      System.out.println(s);
   }
}
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
   A program to test hash codes of bank accounts.
*/
public class BankAccountTester
{
   public static void main(String[] args)
   {
      BankAccount acct1 = new BankAccount(1729, 10000);
      BankAccount acct2 = new BankAccount(1730, 3400);
      BankAccount acct3 = new BankAccount(1731, 100);
      BankAccount acct4 = new BankAccount(1729, 98000);

      System.out.println(acct2.equals(acct3));
      System.out.println("Expected: false");
      System.out.println(acct1.equals(acct4));
      System.out.println("Expected: true");
      
      Set<BankAccount> accounts = new HashSet<BankAccount>();
      
      accounts.add(acct1);
      System.out.println(acct1.hashCode()); //hashCode must coincide with equals method (write equals method)
      System.out.println("Expected: 1729");
      accounts.add(acct2);
      System.out.println(acct2.hashCode());
      System.out.println("Expected: 1730");
      accounts.add(acct3);
      System.out.println(acct3.hashCode());
      System.out.println("Expected: 1731");
      accounts.add(acct4);
      
      System.out.println(accounts.size());
      System.out.println("Expected: 3");
   }
}

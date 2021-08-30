import java.util.LinkedList;
import java.util.ListIterator;

/**
   This program demonstrates the LinkedList class.
*/
public class ListDemo
{
   public static void main(String[] args)
   {

       LinkedList<String> staff = new LinkedList<>();
       staff.addLast("Diana");
       staff.addLast("Harry");
       staff.addLast("Romeo");
       staff.addLast("Tom");

      // | in the comments indicates the iterator position
      ListIterator<String> iterator = staff.listIterator();// |DHRT

      iterator.next();  // DHRT
      iterator.next();  // DHRT

      // Add more elements after second element

      iterator.add("Juliet");              // DHJRT
      iterator.add("Nina");              // DHJNRT

      iterator.next();              // DHJNRT

      // Remove last traversed element

      iterator.remove();              // DHJNT

      // Print all elements

      System.out.println(staff);
      System.out.println("Expected: [Diana, Harry, Juliet, Nina, Tom]");
   }
}

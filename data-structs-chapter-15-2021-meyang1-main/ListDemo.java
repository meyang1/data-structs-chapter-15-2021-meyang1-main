import java.util.LinkedList;
import java.util.ListIterator;

/**
   This program demonstrates the LinkedList class.
*/
public class ListDemo
{
   public static void main(String[] args)
   {

       LinkedList<String> staff = new LinkedList<>(); //Diamond Syntax
       staff.addLast("Diana"); //This is a series of objects connected by a node
       staff.addLast("Harry");
       staff.addLast("Romeo");
       staff.addLast("Tom");

      // | in the comments indicates the iterator position
      // Need an iterator for LL's
      ListIterator<String> iterator = staff.listIterator();// |DHRT 

      iterator.next();  // D|HRT
      iterator.next();  // DH|RT

      // Add more elements after second element

      iterator.add("Juliet");              // DHJ|RT
      iterator.add("Nina");              // DHJN|RT

      iterator.next();              // DHJNR|T


      // Remove last traversed element

      iterator.remove();              // DHJN |T 
            // returns last one traversed ('R')
            // DHJN T; In b/w N and T is empty
            
      // Must call next or previous first to move on
      // Cannot call remove twice, IllegalStateException

      iterator.previous(); //goes to previous  DHJ|NT
      iterator.remove(); //removes last one traversed DHJT
      
      // Print all elements

      System.out.println(staff);
      System.out.println("Expected: [Diana, Harry, Juliet, Nina, Tom]");
   }
}

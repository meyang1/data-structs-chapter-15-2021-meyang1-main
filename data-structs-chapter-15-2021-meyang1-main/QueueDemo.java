import java.util.LinkedList;
import java.util.Queue;

/**
   This program simulates a print queue. Note that documents are printed
   in the same order as they are submitted.
*/
public class QueueDemo
{
   public static void main(String[] args)
   {
      //create Queue of Strings = new LinkedList<>
      Queue<String> jobs = new LinkedList<>();
      //add several "jobs"
      //print jobs as you remove from the list
      jobs.add("Maxwell: Fix Thomas Car Fuel Line #1");
      jobs.add("Henry: Fill out apps for College #2");
      jobs.add("Kyle: Pre-Calc Homework #3");
      jobs.add("Joey: Nothing (help his Mom) to do this weekend #4");
      jobs.add("Landon: APUS History Homework #5");
      System.out.println("Printing " + jobs.remove());
      jobs.add("Kevin: Keep pool open #6");

      //display the rest of the Queue (remove as you print
      while (jobs.size() > 0)
      {
          System.out.println("Printing " + jobs.remove());
      }
   }
}

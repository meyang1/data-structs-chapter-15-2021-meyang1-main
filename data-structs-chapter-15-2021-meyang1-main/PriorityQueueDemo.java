import java.util.PriorityQueue;

/**
   This program demonstrates a priority queue of work orders. The
   most important work orders are removed first.
*/
public class PriorityQueueDemo
{
   public static void main(String[] args)
   {
      //create PriorityQueue of WorkOrder
      PriorityQueue<WorkOrder> q = new PriorityQueue<>();
     
      
      //add several WorkOrder
      //Makes arbitrary decision in order if same priority element like 1 and 5
      q.add(new WorkOrder(1, "Drop off at Lab"));
      q.add(new WorkOrder(1, "Walk the Dog")); 
      q.add(new WorkOrder(5, "Kids Investment")); 
      q.add(new WorkOrder(2, "Sept. 21st Doc Appt - get a sub"));
      q.add(new WorkOrder(3, "Bill Certificate"));
      q.add(new WorkOrder(10, "Mom's Car to EPA tester"));
      q.add(new WorkOrder(8, "Bike seat and grips"));
      q.add(new WorkOrder(5, "Pool? Keep it open - ask Carlie"));
      q.add(new WorkOrder(5, "Grade SE work"));
      
      
      //display WorkOrder and you "finish"/remove from the list (the greatest priority)
      while (q.size() > 0)
      {
          System.out.println(q.remove()); 
      }
   }
}

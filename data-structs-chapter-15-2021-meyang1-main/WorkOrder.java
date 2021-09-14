/**
   This class encapsulates a work order with a priority.
*/
public class WorkOrder implements Comparable //must implement comparable interface**
{
   private int priority; 
   private String description;

   /**
      Constructs a work order with a given priority and description.
      @param aPriority the priority of this work order
      @param aDescription the description of this work order
   */
   public WorkOrder(int aPriority, String aDescription)
   {
      priority = aPriority;
      description = aDescription;
   }

   public String toString()
   {
      return "priority=" + priority + ", description=" + description;
   }

   public int compareTo(Object otherObject) //Object will let it take any obj whatsoever, so sorting will be readily available
   {
      WorkOrder other = (WorkOrder) otherObject; //cast otherObject to a WorkOrder
      if (priority < other.priority) { return -1; } //if in the same class, can access the objects' private data
      else if (priority > other.priority) { return 1; }
      else { return 0; }
   }
}

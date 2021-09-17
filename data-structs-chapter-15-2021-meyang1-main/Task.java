 

/**
   Class for creating a priority To Do list.
*/
public class Task implements Comparable<Task>
{
   private final int priority;
   private final String description;

   /**
      Constructor.
      @param description The description of the task.
      @param priority The priority of the task.
   */
   public Task(int priority, String description)
   {
      this.priority = priority;
      this.description = description;
   }

   /**
    * The task priority.
    * @return the priority.
    */
   public int getPriority()
   {
      return priority;
   }

   /**
    * The task description.
    * @return the task description.
    */
   public String getDescription()
   {
      return description;
   }

   @Override
   public int compareTo(Task otherTask)
   {
       Task other = (Task) otherTask;
       if (priority < other.priority) {return -1;}
       else if (priority > other.priority) {return 1;}
       else {return 0;}

   }
}
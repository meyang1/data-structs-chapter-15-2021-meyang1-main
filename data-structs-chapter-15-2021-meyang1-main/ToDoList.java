 

import java.util.PriorityQueue;
import java.util.Scanner;
/**
 * Implement a to do list. Tasks have a priority between 
 * 1 and 9 (with 1 being most urgent), and a description.
 * When the user enters the command 'add priority description', 
 * the program adds a new task. When the user enters next, 
 * the program removes and prints the most urgent task. 
 * The quit command quits the program. 
 * Use a priority queue in your solution.
*/
public class ToDoList
{
   // Instance variable(s)
   private PriorityQueue<Task> todolist;

   
   /**
      Constructor
   */
   public ToDoList()
   {
      // Complete this
      todolist = new PriorityQueue<>();
      
   }

   /**
    * Display a menu and accepts commands.
    */
   public void run()
   {
      String option = "";
      System.out.println("To Do List - Please enter an option");
      System.out.println("  add priority description (add a new task)");
      System.out.println("  next (remove and print most urgent task)");
      System.out.println("  quit (exit this program)");
      System.out.println();
      
      Scanner in = new Scanner(System.in);
      
      do
      {
         System.out.print("> ");
         option = in.nextLine();
         if (option.startsWith("add"))
         {
            addTask(option);
         }
         else if (option.equals("next"))
         {
            nextTask();
         }
      } 
      while (! option.equals("quit"));
   }
   int tempIndex = 0;
   /**
    * Parse the add option line.
    * @param optionStr the option line
   */
   public void addTask(String optionStr)
   {
      // Complete this method
       int check = 0;
       
       //roundabout way of getting index of 2nd space
      for(int i=0; i<optionStr.length(); i++){
          if(optionStr.charAt(i)==' '){
              tempIndex=i;
              check++;
            }
            
           if(check==2) break;
           
      }
      
      //separates priority
      int tempPriority = Integer.parseInt(optionStr.substring(4,tempIndex)); //cuts out priority from string sent in, changes string to int
      //separates task
      String sepTask = optionStr.substring(optionStr.indexOf(" ")+1,optionStr.length()); //removes priority from string sent in
      
      todolist.add(new Task(tempPriority,sepTask));
  
   }

   /**
      Get the next highest priority task and 
      display the description to the user.
   */
   public void nextTask()
   {
      Task next = null;
      
      // Complete this method
      next = todolist.peek();
      //System.out.print(next);
      
      
      if (next == null)
      {
         System.out.println("There are no tasks in the list.");
      }
      else
      {
         todolist.remove();
         System.out.println(next.getDescription());
      }
   }
}
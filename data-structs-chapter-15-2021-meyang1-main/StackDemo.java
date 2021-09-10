import java.util.Stack;
    
/**
   This program simulates an undo stack. Note that operations
   must be undone in the opposite order in which they are first
   issued.
*/
public class StackDemo
{
   public static void main(String[] args)
   {
      //create Stack of <Strings> commands
      Stack<String> commands = new Stack<> ();
      //LIFO
      
      //push onto Stack a list of commands
      commands.push("Insert 'Hello'");
      commands.push("Insert','");
      commands.push("Insert' '");
      commands.push("Insert'World'");
      commands.push("Insert'?'");
      commands.push("Insert'?'");
      commands.push("Insert'!'");
      System.out.println("First-In: " + commands.peek()); //Looks at 1st element

      // Now we undo the last four commands
      for (int i = 1; i <= 4; i++)
      {
          String command = commands.pop();
          System.out.println("Undo " + command);
        
      }
   }
}

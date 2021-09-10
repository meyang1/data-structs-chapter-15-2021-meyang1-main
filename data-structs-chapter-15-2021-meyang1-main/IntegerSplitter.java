import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;

/**
   Class for splitting an integer into its individual digits.
*/
public class IntegerSplitter
{
   /**
      Splits the given integer into its individual digits
      and prints them to the screen.
      @param number Integer to be split.
   */
   public static void split(int number) //1 2 3 4 5
   {
      // Complete this method. Use a Stack
      Stack<Integer> splitNum = new Stack<>();
      String tempNum = "" +  number;
      for(int i=0; i<tempNum.length(); i++){
          splitNum.push(number%10);
          number -= number%10;
          number /= 10;
      }
      for(int i=0; i<tempNum.length(); i++){
          int command = splitNum.pop();
          System.out.print(command + " ");
      }
   }
}

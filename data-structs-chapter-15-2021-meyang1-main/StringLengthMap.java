import java.util.*;
import java.io.*;
/**
   Read all words from a file and add them to a
   map whose keys are word lengths and whose values
   are comma-separated strings of words of the same length.
   Then print out those strings, in increasing order by
   the length of their entries.
   Modify Worked Example 15.1.
*/

public class StringLengthMap
{
   public static void main(String[] args) throws FileNotFoundException
   {
      String filename = "test1.txt"; 

      try (Scanner in = new Scanner(new File(filename)))
      {

         Map<Integer, String> wordMap = new TreeMap<>();
         
         String temp = "";
         while (in.hasNext())
         {
            String word = clean(in.next());
            Integer len = word.length();
            
            
            // Update the map here
            // Modify Worked Example 15.1
            temp = wordMap.get(len); //stores word
            temp += word; //adds to current str
            textMap.put(len, temp); //puts into map
            temp += ", "; //formatting "one, two"
         }
         
         for(Integer key : wordMap){
            String words = wordMap.get(key);  
            System.out.println(key + ": " + words);
         }
         // Print the strings, in increasing order of their length
         // Use this format: 1: i, a, i
      }
      catch (FileNotFoundException e)
      {
         System.out.println("Cannot open: " + filename);
      }
   }

   public static String clean(String s)
   {
      String r = "";
      for (int i = 0; i < s.length(); i++)
      {
         char c = s.charAt(i);
         if (Character.isLetter(c))
         {
            r = r + c;
         }
      }
      return r.toLowerCase();
   }

}

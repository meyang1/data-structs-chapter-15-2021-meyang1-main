import java.util.*;
import java.io.*;
/**
 StringLengthMap Program:
 Max Yang
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
         String temp = " ";
         Map<Integer, String> wordMap = new TreeMap<>(); //create Map 'wordMap'
        
         while (in.hasNext())
         {
            String word = clean(in.next());
            Integer len = word.length();
            System.out.println(word);
            
            // Update the map here
            // Modify Worked Example 15.1
            
            temp = wordMap.get(len);
            if(temp == null) {
                temp = " "; //check for first null value
            }
            
             
            temp += " " + word + ","; //add word and comma
            wordMap.put(len, temp); 
        }
        
         // Print the strings, in increasing order of their length
         // Use this format: 1: i, a, i,
        for (Integer words : wordMap.keySet()) 
        {
            System.out.println(words + ":" + wordMap.get(words)); //iterate & print keys/values
        }
      }
         
       
      catch (FileNotFoundException e){
        {
            System.out.println("Cannot open: " + filename);
        }
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

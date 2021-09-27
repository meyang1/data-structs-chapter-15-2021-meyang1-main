import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.HashMap;

/**
   Searches for words with the same hash code
   based on the filename.
   P15.5 (pg 717)
*/
public class TwoWordsSameHashCode extends MaxYang_Parentheses
{
   /**
      Makes a hash code to string map based on the words in the specified file
      @param filename the filename to read words from
      @return a hash map mapping hash values to words found in the filename
   */
   public static Map<Integer, HashSet<String>> generateHashMap(String filename)
   {
      Map<Integer, HashSet<String>> fileWords = new HashMap<>();
      
      try (Scanner scan = new Scanner(new File(filename)))
      {
          while(scan.hasNext()){
              String word = scan.next(); 
               
              Set<Integer> keySet = fileWords.keySet();
              Integer hash = Integer.valueOf(word.hashCode());
              
              if(fileWords.get(hash)==null){        
                  HashSet <String> wordSet = new HashSet<>();
                  wordSet.add(word);
                  fileWords.put(word.hashCode(), wordSet);
              }
              else{
                  HashSet <String> wordSet = fileWords.get(word.hashCode());
                  wordSet.add(word);
                  fileWords.put(word.hashCode(), wordSet);
              }
          }
      }
      catch (FileNotFoundException e){
        {
            System.out.println("Cannot open: " + filename);
        }
      }
      return fileWords;
   }

   /**
      Prints all the words with the same hash codes
      @param hashCodes the map to print from
   */
   public static void printSameCodes(Map<Integer, HashSet<String>> hashCodes)
   {
       Set<Integer> keySet = hashCodes.keySet();
 
       for(Integer num : keySet){
          if(hashCodes.get(num).size()>1){
             System.out.println(num + ": " + hashCodes.get(num));
             
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
      return r;
   }
}

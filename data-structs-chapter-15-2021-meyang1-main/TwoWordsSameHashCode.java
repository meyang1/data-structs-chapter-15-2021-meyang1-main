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
public class TwoWordsSameHashCode
{
   /**
      Makes a hash code to string map based on the words in the specified file
      @param filename the filename to read words from
      @return a hash map mapping hash values to words found in the filename
   */
   public static Map<Integer, HashSet<String>> generateHashMap(String filename)
   {
      Map<Integer, HashSet<String>> fileWords = new HashMap<>();
      Scanner scan = new Scanner(new File(filename));
      while(scan.hasNext()){
          String word = scan.next();
          fileWords.put(word.hashCode(), (fileWords.get(Integer.valueOf(word.hashCode()))).add());
      }
      System.out.println(fileWords);
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
             System.out.println(hashCodes.get(num));
          }
          
      }

   }
}

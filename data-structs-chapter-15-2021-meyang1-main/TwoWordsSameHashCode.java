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
      
      try (Scanner scan = new Scanner(new File(filename)))
      {
          while(scan.hasNext()){
              String word = scan.next(); 
            //  System.out.println(word);
               
              Set<Integer> keySet = fileWords.keySet();
              Integer hash = Integer.valueOf(word.hashCode());
              System.out.println(fileWords.get(hash));
              if(fileWords.get(hash)==null){        
                  HashSet <String> wordSet = new HashSet<>();
                  wordSet.add(word);
                  fileWords.put(word.hashCode(), wordSet);
              }
              //fileWords.put(word.hashCode(), fileWords.get(hash).add(word));
            }
            System.out.println(fileWords);
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
             System.out.println(hashCodes.get(num));
          }
          
      }

   }
}

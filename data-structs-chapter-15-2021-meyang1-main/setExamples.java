import java.util.HashSet;
import java.util.TreeSet;
import java.util.Scanner;
import java.util.Set;
import java.io.File;
import java.io.FileNotFoundException;

/**
   This program checks which words in a file are not present in a dictionary.
*/
public class setExamples
{
   public static void main(String[] args)
      throws FileNotFoundException
   {
       //Considerd good style to store a reference to a HashS or TreeS 
       //in variable of type Set
       Set <String> words = new TreeSet<>();
       
       words.add("Apple");
       // the set will ignore this dup
       words.add("Apple");
       words.add("Bat");
       words.add("Candy");
       words.add("Doug");
       words.add("Eat");
       words.add("Follow");
       words.add("Gate");
       words.add("Hello");
       words.add("Icicle");
       words.add("Jacal");
       
        Set <String> t = new HashSet<>();
       t.add("Apple");
       t.add("Bat");
       t.add("Civilian");
       t.add("Doofenshmirtz");
       t.add("Eat");
       t.add("Phineas");
       t.add("Gate");
       t.add("Whole");
       t.add("Icicle");
       t.add("Genie");
       
       
       
       // the set will ignore the removal of item not in the set
       words.remove("Kevin");
       
       
       
       //print out HashSet will display in what seems like random order
       for (String word :words)
       {
           System.out.println(word);
           
       }
       
       
       
   }
}

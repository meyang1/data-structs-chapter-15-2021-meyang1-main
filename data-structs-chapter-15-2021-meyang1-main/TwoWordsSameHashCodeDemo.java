import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.HashMap;

public class TwoWordsSameHashCodeDemo
{
   public static void main(String[] args)
   {
      //TwoWordsSameHashCode.printSameCodes(
      TwoWordsSameHashCode.printSameCodes(TwoWordsSameHashCode.generateHashMap("words.txt"));
      TwoWordsSameHashCode.printSameCodes(TwoWordsSameHashCode.generateHashMap("book-war-and-peace.txt"));
        
   }
}

import java.awt.Color;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;
import java.util.Set;

/**
   This program demonstrates a map that maps names to colors.
*/
public class MapDemo
{
   public static void main(String[] args)
   {
       //create Map: favoriteColors
       //  key   values
       //Map<String, Color> favColors = new HashMap<>();
       //Will display in order Hash does not
       Map<String, Color> favColors = new TreeMap<>();
       
       //add obj to a Map
       favColors.put("Kennny",Color.blue);
       favColors.put("Tom",Color.pink);
       favColors.put("Payton",Color.green);
       favColors.put("Hana",Color.magenta);
       favColors.put("Hayes",Color.green);
       favColors.put("Brad",Color.white);
       favColors.put("Sarah",Color.BLUE);
       
       // change the value -> use put method
       favColors.put("Tom",Color.red);


      //create Set<String> keySet
      Set<String> keySet = favColors.keySet();

      // Print all keys and values in the map


      for (String key: keySet)
      {
          Color value = favColors.get(key);
          System.out.println(key +":"+value);

      }
   }
}

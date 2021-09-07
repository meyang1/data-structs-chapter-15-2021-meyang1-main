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
       Map<String, Color> favColors = new TreeMap<>(); //String and Color const.
       
       //add obj to a Map
       favColors.put("Jason",Color.blue);
       favColors.put("Henry",Color.pink);
       favColors.put("Basil",Color.green);
       favColors.put("Jack",Color.magenta);
       favColors.put("Hayes",Color.green);
       favColors.put("Joey",Color.white);
       favColors.put("Kyle",Color.BLUE);
       
       // change the value -> use put method
       favColors.put("Jason",Color.red);


      //create Set<String> keySet
      Set<String> keySet = favColors.keySet();

      // Print all keys and values in the map


      for (String key: keySet)
      {
          //to access the "value collection" use the get method
          Color value = favColors.get(key);
          System.out.println(key +":"+value);   

      }
   }
}

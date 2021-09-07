import java.util.LinkedList;
import java.util.ListIterator;

/**
   This class supplies a utility method to reverse the entries in a linked list.
*/
public class ListUtil
{
   /**
      Reverses the elements in a linked list
      @param strings the linked list to reverse
   */
   
   public static void reverse(LinkedList<String> strings)
   {
       
      if(strings.size() > 1){
          String s= strings.removeFirst();
          reverse(strings);
          strings.addLast(s);
        }
        
   }
}

/*for(int i=0; i<strings.size(); i++){ iterator.next(); }
      
      
      for(int i=0; i<strings.size(); i++){
          temp = iterator.previous(); //M
          strings.remove();
          strings.addLast(temp);
          for(int j=0; j<i; j++){
            iterator.previous();
           }
      }
      */
     
     
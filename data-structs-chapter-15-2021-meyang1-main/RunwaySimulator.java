import java.util.Queue; 
import java.util.LinkedList;

/**
   Class for simulating a runway.
*/
public class RunwaySimulator
{
   private Queue<String> takeOff;
   private Queue<String> landing;
   
   /** 
      Constructor.
   */
   public RunwaySimulator()
   {
      takeOff = new LinkedList<>();
      landing = new LinkedList<>();
   }

   /**
      Add a flight symbol to the taking off queue.
      @param flightSymbol the flight symbol.
   */
   public void addTakeOff(String flightSymbol)
   {
      takeOff.add(flightSymbol);
   }

   /**
      Add a flight symbol to the landing queue.
      @param flightSymbol the flight symbol.
   */
   public void addLanding(String flightSymbol)
   {
      landing.add(flightSymbol);

   }

   /**
      Handle the next action.
   */
   public void handleNextAction()
   {
      String nextAction = "";
      if(landing.size()!=0) //landing is not empty, priority
      {
          System.out.println(landing.remove()); 
          if(landing.size()!=0) nextAction = landing.peek();         
          else if(takeOff.size()!=0) nextAction = takeOff.peek();
          else nextAction = "All processes are complete!";
      }
      else if(takeOff.size()!=0) 
      {
          System.out.println(takeOff.remove());
          if(landing.size()!=0) nextAction = landing.peek();         
          else if(takeOff.size()!=0) nextAction = takeOff.peek();
          else nextAction = "All processes are complete!";
      }
      
      if(nextAction.equals("")){
          System.out.println("All flights are done.");
      }
      else{
          System.out.println("Next: " + nextAction);
      }
      
   }
}

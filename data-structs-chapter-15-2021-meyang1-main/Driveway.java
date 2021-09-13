import java.util.Stack;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
/**
   Class for simulating a driveway and a street, using stacks
   of cars with license plate numbers as representation.
*/
public class Driveway
{
   /**
      Stack representing the cars in the driveway.
   */
   private Stack<Integer> driveway;
   /**
      Stack representing the cars in the street.
   */
   private Queue<Integer> street;
   int driveCount=0, streetCount=0;
   
   /**
      Constructor.
   */
   public Driveway()
   {
      // Complete the constructor
      driveway = new Stack<>();
      street = new LinkedList<>();

   }

   /**
      Add the given license plate to the driveway.
      @param licencePlate number of license plate.
   */
   public void add(int licensePlate)
   {
      // Complete this method
      driveway.push(licensePlate);
      driveCount++;
   }

   /**
      Remove the given license plate from the driveway.
      @param licencePlate number of license plate.
   */
   public void remove(int licensePlate)
   {
      // Complete this method
      int count = 0;
      for(int i=0; i<driveCount; i++){
          if(licensePlate != driveway.peek()){
             street.add(driveway.pop()); //remove a car from driveway to street
             count++;
          }
          else{
             street.add(driveway.pop()); //remove a car from driveway to street
             count++;
             driveCount -= count;
             break;
          }
        }
      for(int i=0; i<count-1; i++){
          driveway.push(street.remove());
          driveCount++;
      }
   } 

   /**
      Prints the driveway and street details to the screen.
   */
   public void print()
   {
      System.out.println("In Driveway, starting at first in (one license plate per line):");
      // Print the cars in the driveway here
      for(int drPlate : driveway){
          System.out.print(drPlate+", ");
      }
      System.out.println();
      System.out.println("In Street, starting at first in (one license plate per line):");
      // Print the cars in the street here
      for(int stPlate : street){
          System.out.print(stPlate+", ");
      }
      System.out.println();
   }
}

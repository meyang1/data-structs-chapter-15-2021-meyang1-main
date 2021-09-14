import java.util.Stack;
import java.util.Scanner;
/**
   Driveway.java: 
   Class for simulating a driveway and a street, using stacks
   of cars with license plate numbers as representation.
   By: Max Yang
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
   private Stack<Integer> street;
   int driveCount=0, streetCount=0;
   
   /**
      Constructor.
   */
   public Driveway()
   {
      // Complete the constructor
      driveway = new Stack<>();
      street = new Stack<>();

   }

   /**
      Add the given license plate to the driveway.
      @param licencePlate number of license plate.
   */
   public void add(int licensePlate)
   {
      driveway.push(licensePlate);
      driveCount++;
   }

   /**
      Remove the given license plate from the driveway.
      @param licencePlate number of license plate.
   */
   public void remove(int licensePlate)
   {
      int count = 0;
      boolean checkCar = false;
      
      for(int drPlate : driveway){
          if(drPlate == licensePlate){
              checkCar = true;
          }
      } 
      
      System.out.println("Removing Cars (process): ");  
      if(checkCar){ 
          for(int i=0; i<driveCount; i++){
              if(licensePlate == driveway.peek()){
                  driveway.pop(); //remove a car from driveway to street
             
                  driveCount -= count;
                  break;
                }
                street.push(driveway.pop()); //remove a car from driveway to street
                count++;
                this.print(); // show process of removing
          }
      
      
      System.out.println("\nAdding Cars Back (process): ");
      for(int i=0; i<count; i++){ //puts cars back
          driveway.push(street.pop());
          driveCount++;
          this.print(); //show process of adding back
      }
    }
    else
        System.out.println("Not in driveway!");
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

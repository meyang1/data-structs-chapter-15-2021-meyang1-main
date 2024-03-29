import java.util.Scanner;

public class DrivewayDemo
{
   public static void main(String[] args)
   {
      Driveway testDriveway = new Driveway();
      Scanner in = new Scanner(System.in);
      System.out.println("Positive integers add cars to the driveway");
      System.out.println("Negative license numbers remove cars.");
      System.out.println("0 stops the simulation.");

      while (in.hasNextInt())
      {
         int licensePlate = in.nextInt();
         if (licensePlate > 0)
         {
            testDriveway.add(licensePlate);
            testDriveway.print();
            
         }
         else if (licensePlate < 0)
         {
            testDriveway.remove(0 - licensePlate);
            System.out.println("Completed Process: ");
            testDriveway.print();
            System.out.println();
         }
         else
         {
             testDriveway.print();
             return;
         }
      }
   }
}

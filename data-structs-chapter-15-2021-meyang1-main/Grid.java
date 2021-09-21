
import java.util.Stack;

public class Grid
{
   private static final int SIZE = 10;
   int[][] pixels = new int[SIZE][SIZE];
   Stack<Pair> RC = new Stack<>();
   
   //Order: top, right, bottom, left
   //
   public void Grid(){
       //initialize an array values to 0
       for(int i=0; i<SIZE; i++){
           for(int j=0; j<SIZE; j++){
               pixels[i][j]=0;
           }
       }
    }
   /**
      Flood fill, starting with the given row and column.
   */
   public void floodfill(int row, int column)
   {
      int count = 1;
      pixels[row][column] = count;
      count++;
      RC.push(new Pair(row, column));
      //while(true){
          //RC.pop();
          //filling 
          if(pixels[row-1][column] == 0 && row!=0) { //up
              pixels[row-1][column] = count;
              count++;
              RC.push(new Pair(row-1, column));
          }
          if(pixels[row][column+1] == 0 && column!=9) { //right
              pixels[row][column+1] = count;
              count++;
              RC.push(new Pair(row, column+1));
          }
          if(pixels[row+1][column] == 0 && row!=9){ //right 
              pixels[row+1][column] = count;
              count++;
              RC.push(new Pair(row+1, column));
          }
          if(pixels[row][column-1] == 0 && column!=0) { //up
              pixels[row][column-1] = count;
              count++;
              RC.push(new Pair(row, column-1));
          }
          
          //choosing next coordinate pair
          
          
          
          
          System.out.println(pixels);
      //}
   }
   
   @Override
   public String toString()
   {
      String r = "";
      for (int i = 0; i < SIZE; i++)
      {
         for (int j = 0; j < SIZE; j++)
            r = r + String.format("%4d", pixels[i][j]);
         r = r + "\n";
      }
      return r;
   }
}

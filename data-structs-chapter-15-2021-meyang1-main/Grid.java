
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
      Pair coordPair = new Pair(0, 0); //moves to last highest Num
      pixels[row][column] = count;
      count++;
      RC.push(new Pair(row, column));
      for(int i=0; i<100; i++){
          //RC.pop();
          //filling 
          if(row!=0 && pixels[row-1][column] == 0 ) { //up
              pixels[row-1][column] = count;
              count++;
              coordPair = new Pair(row-1,column);
              RC.push(coordPair);
          }
          if( column!=9 && pixels[row][column+1] == 0 ) { //right
              pixels[row][column+1] = count;
              count++;
              coordPair = new Pair(row, column+1);
              RC.push(coordPair);
          }
          if(row!=9 && pixels[row+1][column] == 0){ //right 
              pixels[row+1][column] = count;
              count++;
              coordPair = new Pair(row+1, column);
              RC.push(new Pair(row+1, column));
              highestCoord = new Pair(row+1, column);
          }
          if(column!=0 && pixels[row][column-1] == 0) { //up
              pixels[row][column-1] = count;
              count++;
              RC.push(new Pair(row, column-1));
              highestCoord = new Pair(row, column-1);
          }
              //choosing next coordinate pair direction
              //gets last highest number coordinate and sets to new
              row = highestCoord.getRow();
              column = highestCoord.getCol();
                  
                  
              System.out.println(pixels);
      }
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


import java.util.Stack;

public class Grid
{
   private static final int SIZE = 10;
   int[][] pixels = new int[SIZE][SIZE];
   Stack<Pair> RC = new Stack<>();  
    
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
      int count = 1; int checkNew = 0; 
      Pair highestCoord = new Pair(0, 0); //moves to last highest Num
      pixels[row][column] = count; //set first coord pair
      count++;
      RC.push(new Pair(row, column)); //push onto stack
      while(count<=100){
          RC.pop();
          //filling 
          if(row!=0 && pixels[row-1][column] == 0 ) { //up
              pixels[row-1][column] = count;
              count++;
              RC.push(new Pair(row-1, column));         
              highestCoord = new Pair(row-1, column);
              checkNew++;
          }
          if(column!=9 && pixels[row][column+1] == 0 ) { //right
              pixels[row][column+1] = count;
              count++;
              RC.push(new Pair(row, column+1));
              highestCoord = new Pair(row, column+1);
              checkNew++;
          }
          if(row!=9 && pixels[row+1][column] == 0){ //down 
              pixels[row+1][column] = count;
              count++;
              RC.push(new Pair(row+1, column));
              highestCoord = new Pair(row+1, column);
              checkNew++;
          }
          if(column!=0 && pixels[row][column-1] == 0) { //left
              pixels[row][column-1] = count;
              count++;
              RC.push(new Pair(row, column-1));
              highestCoord = new Pair(row, column-1);
              checkNew++;
          }
          //choosing next coordinate pair direction
          //gets last highest number coordinate and sets to new
          row = highestCoord.getRow();
          column = highestCoord.getCol();
          
          //conditional if does not reach 100
          if(checkNew==0){ 
              if(row>0){ //set new to up
                  row--;
              }
              else if(column<9){ //right
                  column++;
              }
              else if(row<9){ //down
                  row++; 
              }
              else if (column>0){ //left
                  column--; 
              }
              highestCoord = new Pair(row, column); //set to new highest pair
          }
          checkNew = 0; //check if repeated coordinate (no new)
     
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

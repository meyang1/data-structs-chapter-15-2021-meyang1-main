//Coordinate Pair Class
public class Pair
{
    private int x, y;
    public Pair(int xC, int yC)
    {
        x = xC;
        y = yC;
    }

    public void printCoordinates(){
        System.out.println("("+ x + ", " + y + ")");
    }
}

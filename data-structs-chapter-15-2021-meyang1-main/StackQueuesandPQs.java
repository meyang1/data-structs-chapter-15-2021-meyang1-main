import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.ListIterator;
/**
 * Write a description of class StackQueuesandPQs here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StackQueuesandPQs
{
public static void main(String[] args)
{
    Stack<String> list = new Stack();
    //Queue<String> list = new LinkedList();
    
    list.push("Apple");
    list.push("Bat");
    list.push("Civilian");
    
    System.out.print(list);
    System.out.println(list.pop());
    System.out.print(list);
    System.out.println(list.pop());
    System.out.print(list);
    System.out.println(list.pop());
    
}
}

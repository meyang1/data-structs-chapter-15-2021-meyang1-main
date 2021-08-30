import java.util.Stack;//Stack only
import java.util.Queue;// need both Q & LL for a Queue
import java.util.LinkedList;
import java.util.PriorityQueue;// PQ only
/**
 * Write a description of class StackQPQ here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StackQPQ
{
    
public static void main(String[] args)
{
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    
    pq.add(2);
    pq.add(4);
    pq.add(1);
    pq.add(3);
    
    int first = pq.remove();
    int second = pq.remove();
    
    System.out.println(first);
    System.out.println(second);
    
    
    
    
    
    /*
    // Q is a LL but has restrictions
    // FIFO order First in - First out
    Queue<Integer> nums2 = new LinkedList<>();
    
    nums2.add(1);
    nums2.add(2);
    nums2.add(3);
    nums2.add(4);
    
    //look at the top of the queue
    System.out.println(nums2.peek());
    
    //take out of a queue
    System.out.println(nums2.remove());
    System.out.println(nums2.remove());
    
    System.out.println(nums2.peek());
    
 /*
    //LIFO last in first out order
    Stack<Integer> nums = new Stack<>();
    
    nums.push(1);
    nums.push(2);
    nums.push(3);
    nums.push(4);
    
    //look at the top of the stack
    System.out.println(nums.peek());
    
    //remove top of the stack
    System.out.println(nums.pop());
    System.out.println(nums.pop());
    System.out.println(nums.peek());
    
    
    
    
 /**/   
}

}

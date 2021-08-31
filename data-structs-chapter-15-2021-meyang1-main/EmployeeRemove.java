import java.util.LinkedList;
import java.util.Scanner;
import java.util.ListIterator;

public class EmployeeRemove
{
    public static void main(String[] args){
        LinkedList<String> employees = new LinkedList();
        Scanner in = new Scanner(System.in);
       
        //15 Employees
        employees.addLast("John"); 
        employees.addLast("Ron"); 
        employees.addLast("Jake");
        employees.addLast("Mike"); 
        employees.addLast("Thomas"); 
        employees.addLast("Jack"); 
        employees.addLast("Jacob"); 
        employees.addLast("Rick"); 
        employees.addLast("Joseph");
        employees.addLast("Cooper");
        employees.addLast("Andrew");
        employees.addLast("Tony");
        employees.addLast("Diana");
        employees.addLast("Harry");
        employees.addLast("Mary");
       
        ListIterator<String> iterator = employees.listIterator();
        System.out.println(employees);
            
        int n = 2;
        
        for( int i = employees.size() - 1; i >=0; i--){
            if(i%n == 0){
                employees.remove(i);
            }
        }
        System.out.println(employees);
    }
}

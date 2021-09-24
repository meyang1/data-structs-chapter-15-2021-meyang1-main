import java.util.Stack;

/**
 * change the class name to your firstlast_parentheses
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MaxYang_Parentheses
{

    /**
     * A quiz
     * Exam whether an expression is correctly formed with Parentheses
     * thus are balanced
     *
     * Use a queue or a stack to push and pop parenthesis from a String
     * If the opening and closing parentheses don't match
     *      The parentheses are unbalanced. Exit
     * If at the end the stack/queue is empty
     *      The parentheses are balanced.
     * Else
     *      The parentheses are not balanced
     *
     * Write the code to test the the strings below
     * You should create at least one test of your own
     */
    public static void  main(String[] args)
    {
        //Test if stack is empty balanced
        String quiz1 = "-((b*b-(4*a*c))/(2*a))";//balanced
        System.out.println(checkBalanced(quiz1));
        System.out.println("expected: true");
        
        //Test if parentheses don't match
        String quiz2 = "-{[b*b-(4*a*c)]/(2*a)}";//balanced
        System.out.println(checkBalanced(quiz2));
        System.out.println("expected: true");
        

        //Test if stack is empty balanced
        String quiz3 = "-((b*b-(4*a*c))/(2*a)";//unbalanced
        System.out.println(checkBalanced(quiz3));
        System.out.println("expected: false");
        //Test if parentheses don't match
        String quiz4 = "-{[b*b-(4*a*c)]/(2*a}";//unbalanced
        System.out.println(checkBalanced(quiz4));
        System.out.println("expected: false");
        
        /* 
        //Test if parentheses are balanced - test case, extra
        String quiz5 = "{[(a*b)-(b*c)]/[(c-a)+(b-c)]}";//balanced
        System.out.println(checkBalanced(quiz5));
        System.out.println("expected: true");*/ 
    }
    
    public static boolean checkBalanced(String equation){
        Stack<String> parentheses = new Stack<>();
        String temp = "";
        
        for(int i=0; i<equation.length(); i++){ 
            temp += equation.charAt(i); 
            
            //push onto stack if open parenthesis (type)
            if(temp.equals("(")){
                parentheses.push(temp); 
             }
            if(temp.equals("{")){
                parentheses.push(temp);
            } 
            if(temp.equals("[")){
                parentheses.push(temp);
            }
            
            //check if open parenthesis not empty and if next is a closed parenthesis
            if(parentheses.empty()==false && parentheses.peek().equals("(") && temp.equals(")")){ 
               parentheses.pop(); //pops if matches parenthesis/bracket
            }
            if(parentheses.empty()==false && parentheses.peek().equals("[") && temp.equals("]")){ 
               parentheses.pop();                
            }
            if(parentheses.empty()==false && parentheses.peek().equals("{") && temp.equals("}")){ 
               parentheses.pop();                
            }
            
            temp = ""; //reset temp character
        }
        
        if(!parentheses.empty()){ // stack is not empty = unbalanced 
            return false;
        } 
        
        return true; // stack is empty = all open parenthesis closed off
        
     } 
    } 

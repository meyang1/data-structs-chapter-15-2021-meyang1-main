/**
 * Write a description of class HashCode here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class hashCodeExamples
{
    public static void main(String[] args){ 
        //if 8 million people/values in a distribution, 16 million in the hashset
        //2x times amount needed to store
        System.out.println("how".hashCode()); //must have a hash code method for hash maps
        System.out.println("who".hashCode()); //hashCode() inherited from Object class, but not recommended
        
        //Same hashCode 
        System.out.println("Ugh".hashCode());
        System.out.println("VII".hashCode());
        System.out.println("thegrass".hashCode());
        
        String s = "thegrass";
        
        int Hash_mult = 31; //prime num
        int hc = 0; 
        
        for(int i=0; i<s.length(); i++){
            hc = Hash_mult * hc +s.charAt(i); //formula for hashCode() method 
        }
        //31 * (31 * h + o) + w
        System.out.println(hc+"?"); 
        
    }
}

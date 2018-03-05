/*
 * Find out if all the numbers read until meeting 0 have the same sign or not.
 */

package Set2;

import java.util.Scanner;

public class SameSignNumbers {
    
    public boolean allPositive, allNegative;
    
    public SameSignNumbers() {
        this.allPositive = false;
        this.allNegative = false;
    }
    
    public void readNumbersUntil0() {
        
        System.out.println("Insert numbers: ");
        
        Scanner s = new Scanner(System.in);
        
        int n;
        
        while((n=s.nextInt())!=0) {
            //if we already found both positive and negative numbers continue
            if(allPositive && allNegative) {
                continue;
            }
            
            //else checking to see the next number's sign
            if(n<0) {
                allNegative = true;
            }
            
            if(n>0) {
                allPositive = true;
            }
        }
    }
    
    public boolean checkSameSign() {
        if(allPositive && allNegative)
            return false;
        return true;
    }
    
    public static void main(String args[]) {
        SameSignNumbers ssn = new SameSignNumbers();
        ssn.readNumbersUntil0();
        System.out.println( "Numbers " + 
                            (ssn.checkSameSign() ? "have " : "do not have ") +
                            "the same sign.");
    }
    
}

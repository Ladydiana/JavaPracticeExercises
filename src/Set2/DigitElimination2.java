/*
 * Write a program which reads a number n formed of 4 digits.
 * Write an algorithm to eliminate the 2 middle digits of n.
 */

package Set2;

import java.util.Scanner;

public class DigitElimination2 {
    
    int n;
    
    public DigitElimination2 () {
        
    }
    
    public DigitElimination2(int n) {
        this.n = n;
    }
    
    public void checkNumber() {
        // Checking to see if our number has 4 digits
        if(n/1000==0 || n/1000>9) {
            System.err.println("Inserted number doesn't have 4 digits.");
            System.exit(0);
        }
    }
    
    public void readNumber() {
        System.out.print("n= ");
        Scanner s = new Scanner(System.in);
        this.n = s.nextInt();
        
        checkNumber();
    }
    
    public int eliminateDigits() {
        int new_n = (n/1000)*10 + n%10;
        return new_n;
    }
    
    public static void main(String args[]) {
        DigitElimination2 de = new DigitElimination2();
        de.readNumber();
        System.out.println(de.eliminateDigits());
    }
        
}

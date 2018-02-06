/*
 * Write a program to reverse a number.
 */


package tier1;

import tier2.StringReverseRecursive;
import java.util.Scanner;


public class NumberReverse {
    
    int number;
    
    public NumberReverse() {
        this.number = 0;
    }
    
    public NumberReverse(int n) {
        this.number = n;
    }
    
    public void readNumber() {
        Scanner s = new Scanner(System.in);
        System.out.println("Insert number to reverse: ");
        this.number = s.nextInt();
        s.close();
    }
    
    // Solution 1 - We treat the number as String and use the previously written String Recursive class
    public void Solution1 () {
        System.out.println ("Solution 1 result: " + 
                            new StringReverseRecursive().reverseRecursive(Integer.toString(this.number)));
        
    }
    
    // Solution 2 - We do it the mathematical way
    public void Solution2 () {
        int reverse = 0;
        while (this.number!=0) {
            reverse = reverse*10 + this.number%10;
            this.number = this.number/10;
        }
        System.out.println ("Solution 2 result: " + reverse);
    }
    
    public static void main (String args[]) {
        NumberReverse nr = new NumberReverse();
        nr.readNumber();
        nr.Solution1();
        nr.Solution2();
    }



}

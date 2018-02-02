/*
 * Write a program to reverse a number.
 */


package java2novice;

import java.util.Scanner;


public class NumberReverse {
    
    int number;
    
    public NumberReverse() {
        this.number = 0;
    }
    
    public void readNumber() {
        Scanner s = new Scanner(System.in);
        System.out.println("Insert number to reverse: ");
        this.number = s.nextInt();
        s.close();
    }
    
    // Solution 1 - We treat the number as String and use the previously written String Recursive class
    public void Solution1 () {
        System.out.println ("Solution 1 reseult: " + 
                            new StringReverseRecursive().reverseRecursive(Integer.toString(this.number)));
        
    }
    
    
    
    public static void main (String args[]) {
        NumberReverse nr = new NumberReverse();
        nr.readNumber();
        nr.Solution1();
    }



}

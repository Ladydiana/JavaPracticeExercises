/*
 * Write a program to find out if a number is a palindrome or not.
 * A palindrome is a number which is equal to its reverse.
 */

package Set2;

import java.util.Scanner;

public class Palindrome {
    
    int n, reverse = 0, checkSign;
            
    public void readNumber() {
        System.out.print("n= ");
        Scanner s = new Scanner(System.in);
        this.n = s.nextInt();
        s.close();
    }
    
    public void checkNumber() {
        if(n<0) {
            checkSign = -1;
            n *= -1;
        }
        else {
            checkSign = 1;
        }
    }
    
    public void reverseN() {
        int tempN = n;
                
        while(tempN>0) {
            reverse = reverse * 10 + tempN%10;
            tempN /= 10;
        }
        
        //Checking if original number was positive or negative
        reverse *= checkSign;
    }
    
    public boolean checkPalindrome() {
        if (n==reverse)
            return true;
        return false;
    }
    
    public static void main(String args[]) {
        Palindrome p = new Palindrome();
        p.readNumber();
        p.checkNumber();
        p.reverseN();
        System.out.println("Is the number a palindrome? " + (p.checkPalindrome() ? "Yes" : "No"));
    }
}

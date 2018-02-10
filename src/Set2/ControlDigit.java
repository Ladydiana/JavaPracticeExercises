/*
 * Write a program which reads a number n and outputs its control digit.
 * The control digit is obtained by doing the sum of all the digits of n, \
 * until the number obtined is smaller than 10.
 * Example:
 * 267 -> 2+6+7=15 -> 1+5=6 -> 6 < 10 
 * So the control digit for 267 is 6
 */

package Set2;

import java.util.Scanner;

public class ControlDigit {
    
    int n;
    
    public ControlDigit () {
        
    }
    
    public ControlDigit(int n) {
        this.n = n;
    }
    
    public void readNumber() {
        System.out.print("n= ");
        Scanner s = new Scanner(System.in);
        this.n = s.nextInt();
    }
    
    public int computeControlDigit() {
        //Initializing cDigit to a random value grater than 10.
        //This value is changed later while computing.
        int cDigit = Integer.MAX_VALUE;
        
        while(cDigit>10) {
            cDigit = 0;
            while(n>0) {
                cDigit += n%10;
                n /= 10;
            }
            n = cDigit;
        }
        return cDigit;
    }
    
    public static void main(String args[]) {
        ControlDigit cd = new ControlDigit();
        cd.readNumber();
        System.out.println(cd.computeControlDigit());
    }
}

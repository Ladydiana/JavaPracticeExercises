/*
 * Print the number of digits forming number n.
 */

package Set2;

import java.util.Scanner;

public class DigitNumber {
    
    int n;

    public void readNumber() {
        System.out.print("n= ");
        Scanner s = new Scanner(System.in);
        this.n = s.nextInt();
        s.close();
    }
    
    public void checkNumber() {
        if(n<0) {
            n *= -1;
        }
    }
    
    // Solution 1, making use of Java conversion
    public int numberOfDigitsUsingConversion() {
        return Integer.toString(n).length();
    }
    
    //Solution 2
    public int numberOfDigitsUsingDivision(int n) {
        if(n<=0)
            return 0;
        else
            return 1 + numberOfDigitsUsingDivision(n/10);
    }
    
    public static void main(String args[]) {
        DigitNumber dn = new DigitNumber();
        dn.readNumber();
        dn.checkNumber();
        System.out.println("Number of digits using string conversion: " + 
                            dn.numberOfDigitsUsingConversion());
        System.out.println("Number of digits using division: " + 
                            dn.numberOfDigitsUsingDivision(dn.n));
    }
}
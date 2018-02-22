/*
 * Compute the sum of the digits forming number n.
 */

package Set2;

import java.util.Scanner;

public class DigitSum {
    
    int n, sum=0;

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
    
    public int computeSum(int n) {
        if(n<=0) 
            return sum;
        else return sum + n%10 + computeSum(n/10);
    }
    
    public static void main(String args[]) {
        DigitSum ds = new DigitSum();
        ds.readNumber();
        ds.checkNumber();
        System.out.println("Sum of digits: " + ds.computeSum(ds.n));
    }
}

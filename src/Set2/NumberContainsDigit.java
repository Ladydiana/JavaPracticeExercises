/*
 * You read a natural number n and a digit k. Decide if the digit k appears \
 * inside n (different from the first and last digit).
 */

package Set2;

import java.util.Scanner;

public class NumberContainsDigit {
    
    int n, k;
    
    public void readNumbers() {
        Scanner s = new Scanner(System.in);
        System.out.print("n= ");
        this.n = s.nextInt();
        System.out.print("k= ");
        this.k = s.nextInt();
        s.close();
    }
    
    public void checkNumbers() {
        if(n<=0) {
            System.err.println("Number is not positive.");
            System.exit(0);
        }
        if(k<0) {
            System.err.println("k is not positive.");
            System.exit(0);
        } 
    }
    
    public boolean checkIfContains() {
        //Getting rid of the first and last digit
        n = n/10;
        n = n% 10;
        while(n>0) {
            if(k==n%10) {
                return true;
            }
            n /= 10;
        }
        return false;
    }
    
    public static void main(String args[]) {
        NumberContainsDigit ncd = new NumberContainsDigit();
        ncd.readNumbers();
        ncd.checkNumbers();
        System.out.println("Does " + ncd.n + " appear inside " + ncd.k + "?\n" + 
                            (ncd.checkIfContains() ? "Yes" : "No"));
    }
}

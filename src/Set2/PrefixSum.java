/*
 * Find the sum of all the prefixes of natural number n.
 * 1285 -> 1 + 12 + 128 + 1285
 */

package Set2;

import java.util.Scanner;

public class PrefixSum {
    
    int n;
    
    public void readNumber() {
        System.out.print("n= ");
        Scanner s = new Scanner(System.in);
        this.n = s.nextInt();
        s.close();
    }
    
    public void checkNumber() {
        if(n<0) {
            System.err.println("Number is not positive.");
            System.exit(0);
        } 
    }
    
    public int computePrefixSum(int n) {
        if(n<=0)
            return 0;
        return n + computePrefixSum(n/10);
    }
    
    public static void main(String args[]) {
        PrefixSum ps = new PrefixSum();
        ps.readNumber();
        ps.checkNumber();
        System.out.println("Sum of all prefixes of " + ps.n + " is " +
                            ps.computePrefixSum(ps.n));
    }
}

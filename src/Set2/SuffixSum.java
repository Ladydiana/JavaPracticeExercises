/*
 * Find the sum of all the suffixes of natural number n.
 * 1285 -> 5 + 85 + 285 + 1285
 */

package Set2;

import java.util.Scanner;

public class SuffixSum {
    
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
    
    public int computeSuffixSum() {
        int divisor = 10, sum = n;
        while(n/divisor>0) {
            sum += n%divisor;
            divisor *=10;
        }
        return sum;
    }
    
    public static void main(String args[]) {
        SuffixSum ss = new SuffixSum();
        ss.readNumber();
        ss.checkNumber();
        System.out.println("Sum of all suffixes of " + ss.n + " is " +
                            ss.computeSuffixSum());
    }
}

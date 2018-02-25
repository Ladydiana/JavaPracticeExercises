/*
 * Print all the prime numbers found in positive interval [a, b].
 */

package Set2;

import java.util.Scanner;

public class PrimeInIntervalAB {
    
    int a, b;
    
    public void readInterval() {
        Scanner s = new Scanner(System.in);
        System.out.print("a= ");
        this.a = s.nextInt();
        System.out.print("b= ");
        this.b = s.nextInt();
        s.close();
    }
    
    public void checkInterval() {
        if(a<0 || b<0) {
            System.err.println("Interval has to be positive.");
            System.exit(0);
        }
        if(b<a) {
            System.err.println("Invalid interval. b<a.");
            System.exit(0);
        }
    }
    
    public void findPrimesInInterval() {
        int i, j;
        for(i=a; i<=b; i++) {
            for(j=2; j<=i/2; j++) {
                if(i%j==0) {
                    break;
                }
            }
            // if i%j==0 it means that we previously found a divisor
            if(i%j!=0 || i==2) {
                System.out.print(i+ " ");
            }
        }
    }
    
    public static void main(String args[]) {
        PrimeInIntervalAB piiab = new PrimeInIntervalAB();
        piiab.readInterval();
        piiab.checkInterval();
        System.out.println("Primes in interval ["+piiab.a+","+piiab.b+"] : " );
        piiab.findPrimesInInterval();
    }
}

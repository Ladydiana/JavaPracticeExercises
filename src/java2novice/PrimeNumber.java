/*
 * Write a program to check the given number is a prime number.
 */

package java2novice;

import java.util.Scanner;

public class PrimeNumber {
    
    public boolean findIfPrime(int n) {
        for(int i=2; i<=Math.sqrt(n); i++) {
            if(n%i==0 && n!=i) {    // the n!=i is in order to consider 2 as prime
                return false;
            }
        }
        
        return true;
    }
    
    public static void main(String args[]) {
        System.out.println("Insert number: ");
        System.out.println(new PrimeNumber().findIfPrime(new Scanner(System.in).nextInt()));
        
    }
}

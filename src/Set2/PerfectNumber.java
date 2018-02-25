/*
 * Write a program to find if a number n is a perfect number or not.
 * A perfect number is a positive integer that is equal to the sum \
 * of its proper positive divisors, that is, the sum of its positive \
 * divisors excluding the number itself. Equivalently, a perfect number \
 * is a number that is half the sum of all of its positive divisors.
 * The first perfect number is 6, because 1, 2 and 3 are its proper \
 * positive divisors, and 1 + 2 + 3 = 6. Equivalently, the number 6 \
 * is equal to half the sum of all its positive divisors:
		( 1 + 2 + 3 + 6 ) / 2 = 6.
 */

package Set2;

import java.util.Scanner;

public class PerfectNumber {
    
    private static Integer computeSum (int number) {
        int sum = 1;
        int n = number;
        
        for(int i=2; i<=n/2; i++) {
            while(number%i==0) {
                sum += i;
                number = number/i;
            }
        }
        return sum;
    }
    
    String findIfPerfect (int number) {
        
        if(computeSum(number)==number)
            return "Yes";
        else 
            return "No";
    }
    
    public static void main (String args[]) {
        System.out.print("Insert number: ");
        System.out.println(new PerfectNumber().findIfPerfect(new Scanner(System.in).nextInt()));
    }
}

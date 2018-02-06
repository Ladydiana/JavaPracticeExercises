/**
 * @author Diana Cristina Culincu
 */

package tier1;

import java.util.Scanner;



/*
 * Write a program to find perfect number or not.
 * A perfect number is a positive integer that is equal to the sum
of its proper positive divisors, that is, the sum of its positive
divisors excluding the number itself. Equivalently, a perfect number
is a number that is half the sum of all of its positive divisors.
The first perfect number is 6, because 1, 2 and 3 are its proper
positive divisors, and 1 + 2 + 3 = 6. Equivalently, the number 6
is equal to half the sum of all its positive divisors:
		( 1 + 2 + 3 + 6 ) / 2 = 6.
 */

public class PerfectNumber {
    
    private static Integer computeSum (int number) {
        int sum = 1;
        int n = number;
        
        for(int i=2; i<=n/2; i++) {
        //for(int i=2; i<=Math.sqrt(n); i++) {
            while(number%i==0) {
                sum += i;
                number = number/i;
                //System.out.println(i);
            }
        }
        return sum;
    }
    
    static String findIfPerfect (int number) {
        
        if(computeSum(number)==number)
            return "Yes";
        else 
            return "No";
    }
    
    public static void main (String args[]) {
        Scanner s = new Scanner (System.in);
        System.out.print("Insert number: ");
        int number = s.nextInt();
        
        
        System.out.println(findIfPerfect(number));
        
        //s.close();
    }
}

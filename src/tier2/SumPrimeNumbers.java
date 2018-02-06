/*
 * Write a program to find the sum of the first x prime numbers.
 */

package java2novice;

import java.util.Scanner;

public class SumPrimeNumbers {
    
    public int computeSumOfFirstXPrimeNumbers(int x) {
        int sum = 0;
        int count = 0;
        int i=2;
        int j;
        
        while(true) {
            if(count == x-1)
                break;
            
            // Starting with 2 as the first prime
            if(i==2)
                sum = 2;
            
            for(j=2; j<= Math.sqrt(i); j++) {
                if(i%j == 0)
                    break;
            }
            if(i%j != 0) {
                count++;
                sum += i;
            }
            i++;
        }
        
        return sum;
    }
    
    public static void main(String args[]) {
        System.out.print("x= ");
        int x = new Scanner(System.in).nextInt();
        System.out.println();
        
        // Extra checking for the inserted number
        if(x<1) {
            System.out.println("Please insert a valid number");
            System.exit(0);
        }
        
        System.out.println  ("Sum of the first "+x+" prime numbers is: "+
                            new SumPrimeNumbers().computeSumOfFirstXPrimeNumbers(x)
                            );
    }
}

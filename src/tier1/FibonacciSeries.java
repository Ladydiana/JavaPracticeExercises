/*
 * Write a program to print fibonacci series.
 */

package java2novice;

import java.util.Scanner;

public class FibonacciSeries {
    
    
    public int generateFibonacci(int first, int second, int number) {
        if(number==0)
            return 0;
        
        System.out.print(second + " ");
        
        return generateFibonacci(second, first + second, number-1);
    }
    
    
    public static void main(String args[]) {
        int first = 0;
        int second = 1;
        
        System.out.println("How many numbers should we generate: ");
        int n = new Scanner(System.in).nextInt();
        if(n<=2) {
            System.out.println("Wrong number. Please try again.");
            System.exit(0);
        }
        
        
        System.out.print("\nFiboncci series: \n0 ");
        new FibonacciSeries().generateFibonacci(0, 1, n-1);
    }
}

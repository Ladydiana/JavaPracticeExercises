/*
 * Write a program to print of the first n prime numbers.
 */

package Set2;

import java.util.Scanner;

public class PrintFirstNPrimes {
    
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
    
    public void printFirstNPrimeNumbers () {
        int count = 0;
        int i=2;
        int j;
        
        while(true) {
            if(count == n-1)
                break;
            
            // Starting with 2 as the first prime
            if(i==2) {
                System.out.print(i+" ");
            }
            
            for(j=2; j<= Math.sqrt(i); j++) {
                if(i%j == 0)
                    break;
            }
            if(i%j != 0) {
                count++;
                System.out.print(i+" ");
            }
            i++;
        }
        
    }
    
    public static void main(String args[]) {
        PrintFirstNPrimes pfnp = new PrintFirstNPrimes();
        pfnp.readNumber();
        pfnp.checkNumber();
        pfnp.printFirstNPrimeNumbers();
    }
}

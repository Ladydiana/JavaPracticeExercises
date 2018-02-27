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
    
    public static void main(String args[]) {
        PrintFirstNPrimes pfnp = new PrintFirstNPrimes();
        pfnp.readNumber();
        pfnp.checkNumber();
    }
}

/*
 * Print all the perfect squares smaller or equal to n.
 */

package Set2;

import java.util.Scanner;

public class PerfectSquaresUntilN {
    
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
    
    public void printPerfectSquares() {
        for(int i=1; i<=Math.sqrt(n); i++) {
            System.out.print(i*i+ " ");
        }
    }
    
    public static void main(String args[]) {
        PerfectSquaresUntilN psun = new PerfectSquaresUntilN();
        psun.readNumber();
        psun.checkNumber();
        psun.printPerfectSquares();
    }
}

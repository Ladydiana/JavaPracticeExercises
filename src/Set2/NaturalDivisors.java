/*
 * Print all natural divisors of number n.
 */

package Set2;

import java.util.Scanner;

public class NaturalDivisors {
    
    int n;
            
    public void readNumber() {
        System.out.print("n= ");
        Scanner s = new Scanner(System.in);
        this.n = s.nextInt();
        s.close();
    }
    
    public void checkNumber() {
        if(n<=0) {
            System.err.println("Number of terms has to be greater than 0.");
            System.exit(0);
        }
    }
    
    public void printDivisors() {
        for(int i=1; i<= n/2; i++) {
            if(n%i==0) {
                System.out.print(i+" ");
            }
        }
        System.out.print(n); //because a number also divides itself
    }
    
    public static void main(String args[]) {
        NaturalDivisors nd = new NaturalDivisors();
        nd.readNumber();
        nd.checkNumber();
        nd.printDivisors();
    }
}

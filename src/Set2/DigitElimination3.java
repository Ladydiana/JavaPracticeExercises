/*
 * Elimitate de middle digit from a 5 digit number n.
 */

package Set2;

import java.util.Scanner;

public class DigitElimination3 {
    
    int n;
    
    public void checkNumber() {
        // Checking to see if our number has 5 digits
        if(n/10000==0 || n/10000>9) {
            System.err.println("Inserted number doesn't have 5 digits.");
            System.exit(0);
        }
    }
    
    public void readNumber() {
        System.out.print("n= ");
        Scanner s = new Scanner(System.in);
        this.n = s.nextInt();
        checkNumber();
    } //12345
    
    public int eliminateDigits() {
        int new_n = (n/1000)*100 + n%100;
        return new_n;
    }
    
    public static void main(String args[]) {
        DigitElimination3 de3 = new DigitElimination3();
        de3.readNumber();
        System.out.println(de3.eliminateDigits());
    }
}

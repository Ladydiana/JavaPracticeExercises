/*
 * Find the sum of the second powers of the first n digits.
 * S= 1^2 + 2^2 + ... + n^2
 * We will do it by applying the mathematical formula for this sum.
 */

package Set2;

import java.util.Scanner;

public class Sum2ndPowerFirstNDigits {
    
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
    
    public int computeSum() {
        return (n*(n+1)*(2*n+1))/6;
    }
    
    public static void main(String args[]) {
        Sum2ndPowerFirstNDigits s2pfnd = new Sum2ndPowerFirstNDigits();
        s2pfnd.readNumber();
        s2pfnd.checkNumber();
        System.out.println("S= " + s2pfnd.computeSum());
    }
}

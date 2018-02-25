/*
 * Find the sum of the third powers of the first n digits.
 * S= 1^3 + 2^3 + ... + n^3
 * We will do it by applying the mathematical formula for this sum.
 */

package Set2;

import java.util.Scanner;

public class Sum3rdPowerFirstNDigits {
    
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
    
    //we know that the sum of integers is an integer so there's no problem
    public int computeSum() {
        return (int)(Math.pow(n,2)*Math.pow((n+1),2))/4; 
    }
    
    public static void main(String args[]) {
        Sum3rdPowerFirstNDigits s3pfnd = new Sum3rdPowerFirstNDigits();
        s3pfnd.readNumber();
        s3pfnd.checkNumber();
        System.out.println("S= " + s3pfnd.computeSum());
    }
}

/*
 * Print the sum of the first n numbers.
 */

package Set2;

import java.util.Scanner;

public class SumFirstNNumbers {
    int n;
    
    public void readNumber() {
        System.out.print("n= ");
        Scanner s = new Scanner(System.in);
        this.n = s.nextInt();
        s.close();
    }
    
    public void checkNumber() {
        if(n<0) {
            System.err.println("Number has to be greater than 0.");
            System.exit(0);
        }
    }
    
    public void computeSum() {
        double sum = n*(n+1)/2;
        System.out.println("Sum: " + sum);
    }
    
    public static void main(String args[]) {
        SumFirstNNumbers sfnn = new  SumFirstNNumbers();
        sfnn.readNumber();
        sfnn.checkNumber();
        sfnn.computeSum();
    }
}

/*
 * Print the product of the first n numbers.
 */

package Set2;

import java.util.Scanner;

public class ProductFirstNNumbers {
    
    int n;
    
    public void readNumber() {
        System.out.print("n= ");
        Scanner s = new Scanner(System.in);
        this.n = s.nextInt();
        s.close();
    }
    
    public void checkNumber() {
        if(n<1) {
            System.err.println("Number has to be greater than 1.");
            System.exit(0);
        }
    }
    
    public void computeProduct() {
        double product = 1;
        
        for(int i=1; i<=n; i++) {
            product *= i;
        }
        System.out.println("n! =  " + product);
    }
    
    public static void main(String args[]) {
        ProductFirstNNumbers pfnn = new  ProductFirstNNumbers();
        pfnn.readNumber();
        pfnn.checkNumber();
        pfnn.computeProduct();
    }
}

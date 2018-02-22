/*
 * Find the sum of an arithmetic series, where the first element is a1, common \
 * difference d and n number of terms.
 */

package Set2;

import java.util.Scanner;

public class ArithmeticSeries {
    double a1, d;
    int n;
    
    public void readTerms() {
        Scanner s = new Scanner(System.in);
        System.out.print("a1= ");
        this.a1 = s.nextDouble();
        System.out.print("d= ");
        this.d = s.nextDouble();
        System.out.print("n= ");
        this.n = s.nextInt();
        s.close();
    }
    
    public void checkTerms() {
        if(n<=0) {
            System.err.println("Number of terms has to be greater than 0.");
            System.exit(0);
        }
    }
    
    public double computeSum() {
        return (0.5*n*(2*a1+ (n-1)*d));  
    }
    
    public static void main(String args[]) {
        ArithmeticSeries as = new ArithmeticSeries();
        as.readTerms();
        as.checkTerms();
        System.out.println("Arithmetic serie sum: "+as.computeSum());
    }
}

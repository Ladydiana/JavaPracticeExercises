/*
 *  Find the area of a square of length L.
 */

package Set1;

import java.util.Scanner;

public class AreaSquare {
    double L;
    
    public void readLength() {
        System.out.print("L= ");
        Scanner s = new Scanner(System.in);
        this.L = s.nextDouble();
        s.close();
    }
    
    public void checkLength() {
        if(L<=0) {
            System.err.println("Length has to be greater than 0.");
            System.exit(0);
        }
    }
    
    public void computeArea() {
        System.out.println("Area: " + L*L);
    }
    
    public static void main(String args[]) {
        AreaSquare as = new AreaSquare();
        as.readLength();
        as.checkLength();
        as.computeArea();
    }
}

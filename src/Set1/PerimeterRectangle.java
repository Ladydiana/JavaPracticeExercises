/*
 * Find the perimeter of a rectangle of length L and width W.
 */

package Set1;

import java.util.Scanner;

public class PerimeterRectangle {
    double L, W;
    
    public void readLength() {
        System.out.print("L= ");
        Scanner s = new Scanner(System.in);
        this.L = s.nextDouble();
        
    }
    
    public void readWidth() {
        System.out.print("W= ");
        Scanner s = new Scanner(System.in);
        this.W = s.nextDouble();
    }
    
    public void checkLength() {
        if(L<0) {
            System.err.println("Length has to be greater than 0.");
            System.exit(0);
        }
    }
    
    public void checkWidth() {
        if(W<0) {
            System.err.println("Width has to be greater than 0.");
            System.exit(0);
        }
    }
    
    public void computePerimeter() {
        System.out.println("Perimeter: " + (2*L+2*W));
    }
    
    public static void main(String args[]) {
        PerimeterRectangle pr = new PerimeterRectangle();
        pr.readLength();
        pr.checkLength();
        pr.readWidth();
        pr.checkWidth();
        pr.computePerimeter();
    }
}
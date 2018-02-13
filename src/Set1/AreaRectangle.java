/*
 * Find the area of a rectangle of length L and width W.
 */

package Set1;

import java.util.Scanner;

public class AreaRectangle {
    
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
        if(L<=0) {
            System.err.println("Length has to be greater than 0.");
            System.exit(0);
        }
    }
    
    public void checkWidth() {
        if(W<=0) {
            System.err.println("Width has to be greater than 0.");
            System.exit(0);
        }
    }
    
    public void computeArea() {
        System.out.println("Area: " + L*W);
    }
    
    public static void main(String args[]) {
        AreaRectangle ar = new AreaRectangle();
        ar.readLength();
        ar.checkLength();
        ar.readWidth();
        ar.checkWidth();
        ar.computeArea();
    }
}

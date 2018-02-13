/*
 * Find the perimeter of a triangle of lengths a, b, c.
 */

package Set1;

import java.util.Scanner;

public class PerimeterTriangle {
    
    double a, b, c;
    
    public void readSideLengths() {
        Scanner s = new Scanner(System.in);
        System.out.print("a= ");
        this.a = s.nextDouble();
        System.out.print("b= ");
        this.b = s.nextDouble();
        System.out.print("c= ");
        this.c = s.nextDouble();
        s.close();
    }
    
    public void checkSideLengths() {
        if(a<=0 || b<=0 || c<=0) {
            System.err.println("Lengths have to be greater than 0.");
            System.exit(0);
        }
    }
    
    public void computePerimeter() {
        System.out.println("Perimeter: " + (a+b+c));
    }
    
    public static void main(String args[]) {
        PerimeterTriangle pt = new PerimeterTriangle();
        pt.readSideLengths();
        pt.checkSideLengths();
        pt.computePerimeter();
    }
}

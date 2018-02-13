/*
 * Find the perimeter of a right triangle of lengths of the 2 legs a and b.
 */

package Set1;

import java.util.Scanner;

public class PerimeterRightTriangle {
    
    double a, b;
    
    public void readSideLegsLengths() {
        Scanner s = new Scanner(System.in);
        System.out.print("a= ");
        this.a = s.nextDouble();
        System.out.print("b= ");
        this.b = s.nextDouble();
        s.close();
    }
    
    public void checkSideLegsLengths() {
        if(a<=0 || b<=0) {
            System.err.println("Lengths have to be greater than 0.");
            System.exit(0);
        }
    }
    
    public void computePerimeter() {
        System.out.println  ("Perimeter: " +    ( a + b + Math.sqrt( 
                                                Math.pow(a, 2) + Math.pow(b,2))
                                                )
                            );
    }
    
    public static void main(String args[]) {
        PerimeterRightTriangle prt = new PerimeterRightTriangle();
        prt.readSideLegsLengths();
        prt.checkSideLegsLengths();
        prt.computePerimeter();
    }
}

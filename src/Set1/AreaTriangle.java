/*
 * Find the area of a triangle of lengths a, b, c.
 */

package Set1;

import java.util.Scanner;

public class AreaTriangle {
    
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
    
    public double computeSemiperimeter() {
        return (a+b+c)/2;
    }
    
    public void computeArea() {
        double s = computeSemiperimeter();
        System.out.println("Area: " + Math.sqrt ( s*(s-a)*(s-b)*(s-c) ) );
    }
    
    public static void main(String args[]) {
        AreaTriangle at = new AreaTriangle();
        at.readSideLengths();
        at.checkSideLengths();
        at.computeArea();
    }
}

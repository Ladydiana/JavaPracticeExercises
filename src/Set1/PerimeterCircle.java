/*
 * Find the perimeter of a circle of radius r.
 */

package Set1;

import java.util.Scanner;

public class PerimeterCircle {
    double r;
    
    public void readLength() {
        System.out.print("r= ");
        Scanner s = new Scanner(System.in);
        this.r = s.nextDouble();
        s.close();
    }
    
    public void checkLength() {
        if(r<=0) {
            System.err.println("Length has to be greater than 0.");
            System.exit(0);
        }
    }
    
    public void computePerimeter() {
        System.out.println("Perimeter: " + (2*r)+ " * π = " + ((2*r)*Math.PI));
    }
    
    public static void main(String args[]) {
        PerimeterCircle pc = new PerimeterCircle();
        pc.readLength();
        pc.checkLength();
        pc.computePerimeter();
    }
}

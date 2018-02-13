/*
 * Find the area of a circle of radius r.
 */

package Set1;

import java.util.Scanner;

public class AreaCircle {
    
    double r;
    
    public void readRadius() {
        System.out.print("r= ");
        Scanner s = new Scanner(System.in);
        this.r = s.nextDouble();
        s.close();
    }
    
    public void checkRadius() {
        if(r<=0) {
            System.err.println("Length has to be greater than 0.");
            System.exit(0);
        }
    }
    
    public void computeArea() {
        System.out.println("Perimeter: " + (r*r)+ "π = " + ((r*r)*Math.PI));
    }
    
    public static void main(String args[]) {
        AreaCircle ac = new AreaCircle();
        ac.readRadius();
        ac.checkRadius();
        ac.computeArea();
    }
}

/*
 * Find the area of a triangle of base B and height H.
 */

package Set1;

import java.util.Scanner;

public class AreaTriangleBH {
    
    double B, H;
    
    public void readBH() {
        Scanner s = new Scanner(System.in);
        System.out.print("B= ");
        this.B = s.nextDouble();
        System.out.print("H= ");
        this.H = s.nextDouble();
        s.close();
    }
    
    public void checkBH() {
        if(B<=0 || H<=0) {
            System.err.println("Lengths have to be greater than 0.");
            System.exit(0);
        }
    }
    
    public void computeArea() {
        System.out.println("Perimeter: " + (0.5*B*H));
    }
    
    public static void main(String args[]) {
        AreaTriangleBH atbh = new AreaTriangleBH();
        atbh.readBH();
        atbh.checkBH();
        atbh.computeArea();
    }
}

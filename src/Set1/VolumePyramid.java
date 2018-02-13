/*
 * Find the volume of a pyramid with base area A and height H.
 */

package Set1;

import java.util.Scanner;

public class VolumePyramid {
    
    double A, H;
    
    public void readAH() {
        Scanner s = new Scanner(System.in);
        System.out.print("A= ");
        this.A = s.nextDouble();
        System.out.print("H= ");
        this.H = s.nextDouble();
        s.close();
    }
    
    public void checkAH() {
        if(A<=0 || H<=0) {
            System.err.println("Lengths have to be greater than 0.");
            System.exit(0);
        }
    }
    
    public void computeVolume() {
        System.out.println("Volume: " + (A*H)*(1/(double)3));
    }
    
    public static void main(String args[]) {
        VolumePyramid vp = new VolumePyramid();
        vp.readAH();
        vp.checkAH();
        vp.computeVolume();
    }
}

/*
 * Find the volume of a prism of length L, height H and width W.
 */

package Set1;

import java.util.Scanner;

public class VolumeRectangularPrism {
    
    double L, H, W;
    
    public void readLWH() {
        Scanner s = new Scanner(System.in);
        System.out.print("L= ");
        this.L = s.nextDouble();
        System.out.print("W= ");
        this.W = s.nextDouble();
        System.out.print("H= ");
        this.H = s.nextDouble();
        s.close();
    }
    
    public void checkLWH() {
        if(L<=0 || H<=0 || W<=0) {
            System.err.println("Lengths have to be greater than 0.");
            System.exit(0);
        }
    }
    
    public void computeVolume() {
        System.out.println("Volume: " + (L*W*H));
    }
    
    public static void main(String args[]) {
        VolumeRectangularPrism vrp = new VolumeRectangularPrism();
        vrp.readLWH();
        vrp.checkLWH();
        vrp.computeVolume();
    }
}

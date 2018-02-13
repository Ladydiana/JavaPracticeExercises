/*
 * Find the volume of a cube of length L.
 */

package Set1;

import java.util.Scanner;

public class VolumeCube {
    
    double L;
    
    public void readLength() {
        System.out.print("L= ");
        Scanner s = new Scanner(System.in);
        this.L = s.nextDouble();
        s.close();
    }
    
    public void checkLength() {
        if(L<=0) {
            System.err.println("Length has to be greater than 0.");
            System.exit(0);
        }
    }
    
    public void computeVolume() {
        System.out.println("Volume: " + L*L*L);
    }
    
    public static void main(String args[]) {
        VolumeCube vc = new VolumeCube();
        vc.readLength();
        vc.checkLength();
        vc.computeVolume();
    }
}

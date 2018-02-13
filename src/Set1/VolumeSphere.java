/*
 *  Find the volume of a sphere of radius r.
 */

package Set1;

import java.util.Scanner;

public class VolumeSphere {
    
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
    
    public void computeVolume() {
        System.out.println("Volume: " + Math.pow(r,3)*4/3+ "π = " + 
                            (Math.pow(r,3)*4/3*Math.PI));
    }
    
    public static void main(String args[]) {
        VolumeSphere vs = new VolumeSphere();
        vs.readRadius();
        vs.checkRadius();
        vs.computeVolume();
    }
}

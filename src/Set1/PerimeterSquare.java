/*
 * Find the perimeter of a square of length L.
 */

package Set1;

import java.util.Scanner;

public class PerimeterSquare {
    int L;
    
    public void readLength() {
        System.out.print("L= ");
        Scanner s = new Scanner(System.in);
        this.L = s.nextInt();
        s.close();
    }
    
    public void checkLength() {
        if(L<0) {
            System.err.println("Length has to be greater than 0.");
            System.exit(0);
        }
    }
    
    public void computePerimeter() {
        System.out.println("Perimeter: " + 4*L);
    }
    
    public static void main(String args[]) {
        PerimeterSquare ps = new PerimeterSquare();
        ps.readLength();
        ps.checkLength();
        ps.computePerimeter();
    }
}

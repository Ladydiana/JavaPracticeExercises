/*
 * Write a program to compute the geometric mean of 2 numbers a and b.
 * The geometric mean is defined as the nth root of the product of n numbers.
 * For instance, the geometric mean of two numbers, say 2 and 8, is just the \
 * square root of their product, that is, sqrt(2*8)=4.
 * As another example, the geometric mean of the three numbers 4, 1, and 1/32 \
 * is the cube root of their product sqrt[{3}](4*1*1/32=1/2.
 */

package Set2;

import java.util.Scanner;

public class GeometricMean {
    
     int a, b;
    
    
    public void readVariables() {
        Scanner s = new Scanner(System.in);
        System.out.print("a= ");
        this.a = s.nextInt();
        System.out.print("b= ");
        this.b = s.nextInt();
        System.out.println();
    }
    
    public void computeGeometricMeanOf2Numbers() {
        double geometricMean = Math.sqrt(a*b);
        System.out.println("Geometric Mean: " + geometricMean);
    }
    
    public static void main(String args[]) {
        GeometricMean gm = new GeometricMean();
        gm.readVariables();
        gm.computeGeometricMeanOf2Numbers();
    }
}

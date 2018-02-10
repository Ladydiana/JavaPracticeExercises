/*
 * Write a program to compute the arithmetic mean of 2 numbers a and b.
 */

package Set2;

import java.util.Scanner;

public class ArithmeticMean {
    int a, b;
    
    
    public void readVariables() {
        Scanner s = new Scanner(System.in);
        System.out.print("a= ");
        this.a = s.nextInt();
        System.out.print("b= ");
        this.b = s.nextInt();
        System.out.println();
    }
    
    public void computeArithmeticMean() {
        System.out.println("Arithmetic Mean: " + (double)(a+b)/2);
    }
    
    public static void main(String args[]) {
        ArithmeticMean am = new ArithmeticMean();
        am.readVariables();
        am.computeArithmeticMean();
    }
    
}

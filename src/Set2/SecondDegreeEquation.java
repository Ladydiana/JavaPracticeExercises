/*
 * Solve the second degree equation: ax^2+bx+c.
 */

package Set2;

import java.util.Scanner;

public class SecondDegreeEquation {
    int a, b, c;
    
    public SecondDegreeEquation() {
        
    }
    
    public SecondDegreeEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public void readNumbers() {
        Scanner s = new Scanner(System.in);
        System.out.print("a= ");
        this.a = s.nextInt();
        System.out.print("b= ");
        this.b = s.nextInt();
        System.out.print("c= ");
        this.c = s.nextInt();
        s.close();
    }
    
    public double findDiscriminant() {
        return (double) Math.pow(b, 2) - 4*a*c;
    }
    
    public void checkDiscriminant(double discriminant) {
        if(discriminant < 0) {
            System.out.println("There are no real roots.");
            System.exit(0);
        }
    }
    
    public void findSquareRoots(double discriminant) {
        double x1, x2;
        
        x1 = (-b + Math.sqrt(discriminant))/(2*a);
        x2 = (-b - Math.sqrt(discriminant))/(2*a);
        
        System.out.println("Square root one: " + x1);
        System.out.println("Square root two: " + x2);
    }
    
    public void solveEquation() {
        double discriminant = findDiscriminant();
        checkDiscriminant(discriminant);
        findSquareRoots(discriminant);
    }
    
    public static void main(String args[]) {
        SecondDegreeEquation sde = new SecondDegreeEquation();
        sde.readNumbers();
        sde.solveEquation();
    }
}

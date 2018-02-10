/*
 * Write a program to interchange the values of 2 variables a and b:
 *   a. using one auxiliary variable
 *   b. without using one auxiliary variable
 */

package Set2;

import java.util.Scanner;

public class NumbersSwap {
    
    int a, b;
    
    public void swapWithoutVariable() {
        a = a + b;
        b = a - b;
        a = a - b;
    }
    
    public void swapWithVariable() {
        int aux = a;
        a = b;
        b = aux;
    }
    
    public void readVariables() {
        Scanner s = new Scanner(System.in);
        System.out.print("a= ");
        this.a = s.nextInt();
        System.out.println();
        System.out.print("b= ");
        this.b = s.nextInt();
        System.out.println();
    }
    
    
    public static void main(String args[]) {
        
        NumbersSwap ns = new NumbersSwap();
        ns.readVariables();
        
        ns.swapWithVariable();
        System.out.println("Swapping with variable: \na= " + ns.a + "\nb= "+ ns.b);
        
        ns.swapWithoutVariable();
        System.out.println("Re-swapping without variable: \na= " + ns.a + "\nb= "+ ns.b);
        
    }
}

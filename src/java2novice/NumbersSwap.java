/*
 * Write a program to swap two numbers without using temporary variable.
 */

package java2novice;

import java.util.Scanner;

public class NumbersSwap {
    
    public Swap swap(int a, int b) {
        Swap sw = new Swap(a, b);
        
        sw.a = sw.a + sw.b;
        sw.b = sw.a - sw.b;
        sw.a = sw.a - sw.b;
        
        return sw;
    } 
    
    
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("a= ");
        int a = s.nextInt();
        System.out.println();
        System.out.print("b= ");
        int b = s.nextInt();
        System.out.println();
        
        NumbersSwap ns = new NumbersSwap();
        Swap sw = ns.swap(a, b);
        System.out.println("After swap: \na= " + sw.a + "\nb= "+ sw.b);
        
    }
}

class Swap {
    public int a;
    public int b;
    
    public Swap() {
        
    }
    
    public Swap(int a, int b) {
        this.a = a;
        this.b = b;
    }
}

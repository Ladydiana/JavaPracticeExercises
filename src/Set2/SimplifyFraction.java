/*
 * Simplify a fraction a/b, where a and b are different from 0.
 * Ex: 20/8 = 10/4 = 5/2  
 */

package Set2;

import java.util.Scanner;

public class SimplifyFraction {
    
    Fraction f;
    
    public void readFractionTerms() {
        int a, b;
        Scanner s = new Scanner(System.in);
        System.out.print("a= ");
        a = s.nextInt();
        System.out.print("b= ");
        b = s.nextInt();
        s.close();
        
        if((a<0 && b>0) || (a>0 && b<0))
            f = new Fraction(Math.abs(a), Math.abs(b), -1);
        else
            f = new Fraction(Math.abs(a), Math.abs(b), 1);
    }
    
    public void simplifyTerms() {
        int c=f.a;
        
        for(int i=2; i<c; i++) {
            while((f.a%i==0) && (f.b%i==0)) {
                f.a /= i;
                f.b /= i;
            }
            if(f.a < f.b) {
                c = f.a;
            }
            else {
                c= f.b;
            }
        }
    }
    
    public static void main(String args[]) {
        SimplifyFraction sf = new SimplifyFraction();
        sf.readFractionTerms();
        sf.simplifyTerms();
        System.out.println("Simplified fraction: " +
                            (sf.f.sign * sf.f.a) +
                            " / " +
                            sf.f.b);
    }
}


class Fraction {
    int a, b;
    int sign;
    
    Fraction(int a, int b, int sign) {
        this.a = a;
        this.b = b;
        this.sign = sign;
        checkFractionTerms();
    }
    
    private void checkFractionTerms() {
        if(a==0 || b==0) {
            System.err.println("Terms have to be not null.");
            System.exit(0);
        }
    }
}
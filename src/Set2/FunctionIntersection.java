/*
 * We have functions f,g :R->R, where 
 * f(x)=a*x+b and 
 * g(x)=c*x+d
 * Find the intersection point in the graphs of these 2 functions.
 * Since these are linear functions, their graphs are lines.
 * We consider that this point has (x, y) coordinates. So, at the point of \
 * intersection the (x, y) coordinates for function 1 equal the (x, y) \
 * coordinates for function 2.
 * Since at the point of intersection the two y-coordinates are equal, the \
 * y-coordinate from Line 1 equal to the y-coordinate from Line 2.
 * The y-coordinate for Line 1 is calculated this way:
 * y = ax + b
 * The y-coordinate for Line 2 is calculated this way:
 * y = cx + d
 * Setting the two y-coordinates equal looks like this:
 * ax + b = cx + d
 * From here we can find out the x using algebra.
 * ax - cx = d - b
 * x(a - c) = d - b
 * x = (d - b)/(a - c)
 */

package Set2;

import java.util.Scanner;

public class FunctionIntersection {
    
    int a, b, c, d;
    
    public FunctionIntersection() {
        
    }
    
    public FunctionIntersection(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public void readNumber() {
        Scanner s = new Scanner(System.in);
        System.out.print("a= ");
        this.a = s.nextInt();
        System.out.print("b= ");
        this.b = s.nextInt();
        System.out.print("c= ");
        this.c = s.nextInt();
        System.out.print("d= ");
        this.d = s.nextInt();
        s.close();
    }
    
    public double getIntersectionPoint() {
        return (double)(d - b)/(a - c);
    }
    
    public static void main(String args[]) {
        FunctionIntersection fi = new FunctionIntersection();
        fi.readNumber();
        System.out.println("Intersection point: " + fi.getIntersectionPoint());
    }
}

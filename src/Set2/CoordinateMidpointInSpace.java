/*
 * We consider coordinate points A(x1,y1) and B(x2,y2) in space.
 * Find the coordinates of the midpoint between the 2 points.
 * The midpoint of two points, (x1, y2) and (x2, y2) is the point M found by \
 * the following formula:
 * M = ((x1+x2)/2, (y1+y2)/2)
 */
package Set2;

import java.util.Scanner;

public class CoordinateMidpointInSpace {
    
    Point A, B, C;
    
    class Point {
        int x;
        int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    
    private Point readCoordinates() {
        int x, y;
        Scanner s = new Scanner(System.in);
        
        System.out.print("x= ");
        x = s.nextInt();
        System.out.print("y= ");
        y = s.nextInt();
        System.out.println();
        
        return new Point(x,y);
    }
    
    public Point computeMidpoint() {
        C = new Point ( (A.x+B.x)/2, (A.y+B.y)/2);
        return C;
    }
    
    public void printPoint(Point p) {
        System.out.println("Coordinates: (" + p.x + "; " + p.y + ")");
    }
    
    public static void main(String args[]) {
        CoordinateMidpointInSpace cmis = new CoordinateMidpointInSpace();
        
        System.out.println("Coordinates for point A: ");
        cmis.A = cmis.readCoordinates();
        
        System.out.println("Coordinates for point B: ");
        cmis.B = cmis.readCoordinates();
        
        cmis.computeMidpoint();
        cmis.printPoint(cmis.C);
    }
}
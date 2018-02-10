/*
 * We consider coordinate points A(x1,y1) and B(x2,y2) in space.
 * Find the distance between the 2 points.
 * The distance formula is derived from the Pythagorean theorem. To find the \
 * distance between two points (x1,y1) and (x2,y2), you need to do is use the \
 * coordinates of these ordered pairs and apply the formula:
 * distance = sqrt ( (x2-x1)^2 + (y2-y1)^2 )
 */

package Set2;

import java.util.Scanner;

public class CoordinateDistanceInSpace {
    
    Point A, B;
    
    class Point {
        int x;
        int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    
    
    public Point readCoordinates() {
        int x, y;
        Scanner s = new Scanner(System.in);
        
        System.out.print("x= ");
        x = s.nextInt();
        System.out.print("y= ");
        y = s.nextInt();
        System.out.println();
        
        return new Point(x,y);
    }
    
    public void computeDistance() {
        double dist = Math.sqrt ( Math.pow(A.x - B.x, 2) +
                                  Math.pow(A.y - B.y, 2));
                
        System.out.println("Distance: "+dist);
    }
    
    public static void main(String args[]) {
        CoordinateDistanceInSpace cdis = new CoordinateDistanceInSpace();
        
        System.out.println("Coordinates for point A: ");
        cdis.A = cdis.readCoordinates();
        
        System.out.println("Coordinates for point B: ");
        cdis.B = cdis.readCoordinates();
        
        cdis.computeDistance();
    }
}
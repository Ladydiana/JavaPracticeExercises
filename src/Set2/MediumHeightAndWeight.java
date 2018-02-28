/*
 * Find the medium weight and height for the n students from a classroom, with \
 * each weight and height read from keyboard.
 */

package Set2;

import java.util.Scanner;
import java.util.ArrayList;

public class MediumHeightAndWeight {
    
    public ArrayList<Double> weights;
    public ArrayList<Double> heights;
    public int n;
    
    public void readNumberOfStudents() {
        System.out.print("n= ");
        Scanner s = new Scanner(System.in);
        this.n = s.nextInt();
        checkNumberOfStudents();
    } 
    
    public void checkNumberOfStudents() {
        if(n<=0) {
            System.err.println("Classroom has no students.");
            System.exit(0);
        } 
    }
}

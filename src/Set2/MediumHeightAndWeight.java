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
    
    public MediumHeightAndWeight() {
        weights = new ArrayList<>();
        heights = new ArrayList<>();
    }
    
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
    
    public void readWeightAndHeight() {
        Scanner s = new Scanner(System.in);
        for(int i=0; i<n; i++) {
            System.out.print("Height of student " + (i+1) + ": ");
            heights.add(s.nextDouble());
            System.out.print("Weight of student " + (i+1) + ": ");
            weights.add(s.nextDouble());
        }
        s.close();
    }
    
    public double computeMedianHeight() {
        return heights.stream().mapToDouble(Double::doubleValue).sum()/n;
    }
    
    public double computeMedianWeight() {
        return weights.stream().mapToDouble(Double::doubleValue).sum()/n;
    }
    
    public static void main(String args[]) {
        MediumHeightAndWeight mhaw = new MediumHeightAndWeight();
        mhaw.readNumberOfStudents();
        mhaw.readWeightAndHeight();
        System.out.println("Medium height for the classroom: " + 
                            mhaw.computeMedianHeight());
        System.out.println("Medium weight for the classroom: " + 
                            mhaw.computeMedianWeight());
    }
}

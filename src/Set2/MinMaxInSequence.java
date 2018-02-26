/*
 * You read numbers until meeting 0. Find the minimum and maximum in the \
 * sequence you read.
 */

package Set2;

import java.util.Scanner;

public class MinMaxInSequence {
    
    private int min, max;

    public MinMaxInSequence() {
        this.min = Integer.MAX_VALUE;
        this.max = Integer.MIN_VALUE;
    }
    
    public int getMin() {
        return min;
    }
    
    public int getMax() {
        return max;
    }
    
    public void setMin(int min) {
        this.min = min;
    }
    
    public void setMax(int max) {
        this.max = max;
    }
    
    public void readSeriesUntil0() {
        int n;
        System.out.println("Insert sequence: ");
        Scanner s = new Scanner(System.in);
        
        while((n=s.nextInt())!=0) {
            if(n>getMax()) {
                setMax(n);
            }
            
            if(n<getMin()) {
                setMin(n);
            }
        }
        s.close();
    }
    
    public static void main(String args[]) {
        MinMaxInSequence mmis = new MinMaxInSequence();
        mmis.readSeriesUntil0();
        if (    mmis.getMin()==Integer.MAX_VALUE || 
                mmis.getMax()==Integer.MIN_VALUE) {
                System.err.println("No number inserted.");
                System.exit(0);
        }
        System.out.println("Min in sequence: " + mmis.getMin());
        System.out.println("Max in sequence: " + mmis.getMax());
    }
}

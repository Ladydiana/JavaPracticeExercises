/*
 * You read numbers until meeting 0. Find the first even and last odd number \
 * in the series you read.
 */

package Set2;

import java.util.Scanner;

public class FirstEvenLastOdd {
    
    private int firstEven, lastOdd;

    // initializing the odd variable to an even number and vice versa to know \
    // if and when we have an even or odd number in the sequence
    public FirstEvenLastOdd() {
        this.firstEven = 1;
        this.lastOdd = 2;
    }
    
    public int getFirstEven() {
        return firstEven;
    }
    
    public int getLastOdd() {
        return lastOdd;
    }
    
    public void setFirstEven(int even) {
        this.firstEven = even;
    }
    
    public void setLastOdd(int odd) {
        this.lastOdd = odd;
    }
    
    public void readSeriesUntil0() {
        
        System.out.println("Insert sequence: ");
        
        Scanner s = new Scanner(System.in);
        
        int n;
        
        while((n=s.nextInt())!=0) {
            // checing to see if we need to reinitialize the last odd number
            if(n%2!=0) {
                setLastOdd(n);
            }
            
            // checking to see if we have the first even number yet or not
            if(getFirstEven()%2!=0 && n%2==0) {
                setFirstEven(n);
            }
        }
    }
    
    public static void main(String args[]) {
        FirstEvenLastOdd felo = new FirstEvenLastOdd();
        felo.readSeriesUntil0();
        System.out.println("First even: " + ( felo.getFirstEven()%2==0 ? 
                                              felo.getFirstEven() :
                                              "No even number in the sequence"
                                            )
                            );
        System.out.println("Last odd: " + ( felo.getLastOdd()%2!=0 ? 
                                            felo.getLastOdd() :
                                            "No odd number in the sequence"
                                          )
                            );
    }
}

/*
 * You read a number of 3 digits. 
 * Eliminate 1 digit so that you obtain the biggest number you can formed by the remaining 2 digits in their respective order.  
 */

package Set2;

import java.util.Scanner;

public class BiggestNumberByElimination {
    int number;
    
    public void readNumber() {
        System.out.print("number= ");
        Scanner s = new Scanner(System.in);
        this.number = s.nextInt();
        s.close();
    }
    
    public static void main(String args[]) {
        BiggestNumberByElimination bnbe = new BiggestNumberByElimination();
        bnbe.readNumber();
    }
}

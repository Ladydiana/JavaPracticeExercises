/*
 * You read a number of 3 digits. 
 * Eliminate 1 digit so that you obtain the biggest number you can formed by the remaining 2 digits in their respective order.  
 */

package Set2;

import java.util.Scanner;

public class BiggestNumberByElimination {
    int number;
    
    public void checkNumber() {
        if(number/100==0 || number/100>9) {
            System.err.println("Number doesn't have 3 digits.");
            System.exit(0);
        }
    }
    
    public void readNumber() {
        System.out.print("number= ");
        Scanner s = new Scanner(System.in);
        this.number = s.nextInt();
        s.close();
    }
    
    public void eliminateDigit() {
        int max = Integer.MIN_VALUE;
        
        if(max < number/10)
            max = number/10;
        if(max < number%100)
            max = number%100;
        if(max < number/100 * 10 + number%10)
            max=number/100 * 10 + number%10;
        
        System.out.println("Max: " + max);
        
    }
    
    public static void main(String args[]) {
        BiggestNumberByElimination bnbe = new BiggestNumberByElimination();
        bnbe.readNumber();
        bnbe.checkNumber();
        bnbe.eliminateDigit();
    }
}

/*
 * Write a program to find sum of each digit in the given number. 
 */

package tier1;

import java.util.Scanner;


public class SumDigitsInNumber {
    
    private int number;
    private int sum;
    
    public SumDigitsInNumber() {
        this.sum = 0;
    }
    
    public SumDigitsInNumber(int number) {
        this.sum = 0;
        this.number = number;
    }
    
    public void resetSum() {
        this.sum = 0;
    }
    
    public int getNumber() {
        return this.number;
    }
    
    public int computeSum() {
        int num = this.number;
        
        while(num!=0) {
            this.sum += num%10;
            num /=10;
        }
        
        return this.sum;
    }
    
    public int computeSumRecursive(int number) {
        if(number == 0)
            return 0;
        else 
            return this.sum + number % 10 + computeSumRecursive(number/10);
    }
    
    public static void main(String args[]) {
        
        System.out.println("Insert the number: ");
        SumDigitsInNumber sdin = new SumDigitsInNumber(new Scanner(System.in).nextInt());
        
        System.out.println("Solution non-recursive: " + sdin.computeSum());
        
        // resetting sum
        sdin.resetSum();
        
        System.out.println("Solution recursive: " + sdin.computeSumRecursive(sdin.getNumber()));
    }
    
}

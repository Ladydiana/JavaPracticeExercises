/*
 * Write a program to find if a given number is an Armstrong number.
 */

package tier2;

import java.util.Scanner;

public class ArmstrongNumber {
    
    public boolean findIfArmstrong(int number) {
        int sum = 0;
        int numberOfDigits = String.valueOf(number).length();
        int numberCopy = number;
                
        while(numberCopy>0) {
            sum += Math.pow(numberCopy%10, numberOfDigits);
            numberCopy /= 10;
        }
        
        if(number == sum)
            return true;
        return false;
    }
    
    public static void main(String args[]) {
        System.out.println("Insert number to check:");
        System.out.println(new ArmstrongNumber().findIfArmstrong(new Scanner(System.in).nextInt()));
    }
}

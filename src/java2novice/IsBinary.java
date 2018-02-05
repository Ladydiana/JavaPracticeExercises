/*
 * Write a program to check if a given number is binary or not.
 */

package java2novice;

import java.util.Scanner;

public class IsBinary {
    
    public boolean findIfBinary(String binaryNumber) {
        for(int i=0; i<binaryNumber.length(); i++) {
            if  (Character.getNumericValue(binaryNumber.charAt(i))==0
                || Character.getNumericValue(binaryNumber.charAt(i))==1    
                )
                continue;
            else
                return false;
        }
        return true;
    }
    
    public static void main(String args[]) {
        System.out.println("Insert number to check if binary: ");
        System.out.println(new IsBinary().findIfBinary(new Scanner(System.in).nextLine()));
    }
    
}

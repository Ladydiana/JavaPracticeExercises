/*
 * Write a program to convert binary format to decimal number.
 */

package java2novice;

import java.util.Scanner;

public class Binary2Decimal {
    
    
    public int convert2Decimal(String binaryNumber) {
        int decimalNumber=0;
        int numberOfCharacters = binaryNumber.length();
        
        for(int i=0; i< numberOfCharacters; i++) {
            decimalNumber += Math.pow(2, i) * Character.getNumericValue(binaryNumber.charAt(numberOfCharacters -1 -i));
            
        }
        
        return decimalNumber;
    }
    
    
    public static void main(String args[]) {
        System.out.println("Insert binary number to convert: ");
        System.out.println(new Binary2Decimal().convert2Decimal(new Scanner(System.in).nextLine()));
    }
}

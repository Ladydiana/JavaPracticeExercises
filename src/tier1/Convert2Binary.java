/*
 * Write a program to convert decimal number to binary format
 */

package tier1;

import java.util.Scanner;

public class Convert2Binary {
    
    private int number;
    private int[] binary;
    
    public Convert2Binary() {
        this.number = 0;
    }
    
    public void readNumber() {
        Scanner s = new Scanner(System.in);
        this.number = s.nextInt();
        this.binary = new int[this.number/2];
        s.close();
    }
    
    public void convert() {
        int i=1;
        
        //calculating binary
        while(this.number!=0) {
            this.binary [this.binary.length-i] = this.number % 2;
            this.number = this.number / 2;
            ++i;
        }
        
        String s = new String();
        for(i=0; i < this.binary.length; i++) {
            s = s+ this.binary[i]; 
        }
        
        System.out.println(s);
    }

    
    public static void main (String args[]) {
        Convert2Binary c2b = new Convert2Binary();
        
        System.out.println("Number to convert: ");
        c2b.readNumber();
        c2b.convert();
    }
}

/*
 * Print the reverse of natural number n.
 */

package Set2;

import java.util.Scanner;

public class NumberReverse {
    
    int n, reverse = 0, checkSign;
            
    public void readNumber() {
        System.out.print("n= ");
        Scanner s = new Scanner(System.in);
        this.n = s.nextInt();
        s.close();
    }
    
    public void checkNumber() {
        if(n<0) {
            checkSign = -1;
            n *= -1;
        }
        else {
            checkSign = 1;
        }
    }
    
    // Attention, this works accurately for numbers which are not multiples of
    // 10, as for example 120 reversed is 021 which is not a number format and
    // yields 21
    public int reverseN() {
        while(n>0) {
            reverse = reverse * 10 + n%10;
            n /= 10;
        }
        
        //Checking if original number was positive or negative
        if(checkSign == 1)
            return reverse;
        else
            return reverse * -1;
    }
   
    public static void main(String args[]) {
        NumberReverse nr = new NumberReverse();
        nr.readNumber();
        nr.checkNumber();
        System.out.println("Reverse: " + nr.reverseN());
    }
}
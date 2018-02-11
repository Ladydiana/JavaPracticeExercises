/*
 * Print the first n numbers different from 0.
 */
package Set2;

import java.util.Scanner;

public class FirstNNumbers {
    int n;
    
    public void readNumber() {
        System.out.print("n= ");
        Scanner s = new Scanner(System.in);
        this.n = s.nextInt();
        s.close();
    }
    
    public static void main(String args[]) {
        FirstNNumbers fnn = new FirstNNumbers();
        fnn.readNumber();
    }
}

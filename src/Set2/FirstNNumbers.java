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
    
    public void checkNumber() {
        if(n<0) {
            System.err.println("Number has to be greater than 0.");
            System.exit(0);
        }
    }
    
    public void printFirstNNumbers() {
        for(int i=1; i<=n; i++) {
            System.out.print(i+" ");
        }
    }
    
    public static void main(String args[]) {
        FirstNNumbers fnn = new FirstNNumbers();
        fnn.readNumber();
        fnn.checkNumber();
        fnn.printFirstNNumbers();
    }
}

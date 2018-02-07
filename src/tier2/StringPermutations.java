/*
 * Write a program to print all permutations of a given string.
 */

package tier2;

import java.util.Scanner;
import java.util.TreeSet;

public class StringPermutations {
    
    public void permuteString(String first, String s, TreeSet<String> h) {
        h.add(first + s);
        
        for(int i=0; i<s.length(); i++) {
            permuteString(  first + s.charAt(i), 
                            s.substring(0, i) + s.substring(i+1), h);
        }
    }
    
    public static void main(String args[]) {
        System.out.println("Insert string to permute: ");
        String s = new Scanner(System.in).nextLine();
        TreeSet<String> permSet = new TreeSet<>();
        
        System.out.println("\nPERMUTATIONS: ");
        new StringPermutations().permuteString("",s, permSet);
        
        System.out.println(permSet);
    }
}
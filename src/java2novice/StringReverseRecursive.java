/*
 * Write a program to reverse a string using recursive methods.
 */

package java2novice;

import java.util.Scanner;

public class StringReverseRecursive {
    static String s;
    
    public StringReverseRecursive () {
        s = new String();
    }
    
    public static void readS() {
        Scanner sc = new Scanner (System.in);
        s = sc.nextLine();
        sc.close();
    }
    
    public String reverseRecursive(String str) {
        if(str.length()==1) {
            return str;
        }
        
        else {
            return str.charAt(str.length()-1) + reverseRecursive(str.substring(0, str.length()-1));
        }
    }
    
    public static void main(String args[]) {
        StringReverseRecursive srr = new StringReverseRecursive();
        System.out.println("Insert string to be reversed: ");
        srr.readS();
        
        System.out.println("Reverse: "+ srr.reverseRecursive(srr.s));
        
    }
}

/*
 * Write a program to find the maximum number in a given array.
 */
package java2novice;

import java.util.Scanner;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ArrayMaxDuplicate {
    
    int[] arr;
    
    ArrayMaxDuplicate(int arr[]) {
        this.arr = arr;
    }
    
    ArrayMaxDuplicate(int size) {
        this.arr = new int[size];
    }
    
    // Solution 1 using Arrays.sort
    public int Solution1 (int [] arr) {
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
    
    public static void main(String args[]){
        int [] ar;
        int size = 0;
        int i = 0;
        
        // Reading array size
        Scanner s = new Scanner(System.in);
        System.out.println("Insert array size: ");
        size = s.nextInt();
        s.nextLine();   // necesarry in this case to bypass the fact that nextInt
                        // does not also read the carriage return
        
        if(size <= 0) {
            System.out.println("Wrong array size.");
            System.exit(0);
        }
        ar = new int[size];
        
        // Reading array, separated by space
        System.out.println("Insert array, separated by space: "); 
        StringTokenizer sc = new StringTokenizer(s.nextLine() ," ");
        
        while(i< size) {
            ar[i] = Integer.parseInt(sc.nextToken());
            i++;
        }
        if(i != size) {
            System.out.println("Array smaller than declared size. Declared size:" 
                                + size + ". Actual size: " + i);
            System.exit(0);
        }
        s.close();
        
        ArrayMaxDuplicate amd = new ArrayMaxDuplicate(ar);
        
        System.out.println("Solution 1 with sorting: " + amd.Solution1(ar));
        
    }
    
}

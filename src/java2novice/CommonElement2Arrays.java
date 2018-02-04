/*
 * Write a program to identify common elements or numbers between two given arrays. 
 */

package java2novice;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class CommonElement2Arrays {
    
    public int[] readArray() {
        int [] ar;
        int size = 0;
        int i = 0;
        
        // Reading array size
        Scanner s = new Scanner(System.in);
        System.out.println("Insert array size: ");
        size = s.nextInt();
        //size = Integer.parseInt(s.nextLine());
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
        //s.nextLine();
        //s.close(); 
        
        System.out.println();
        return ar;
    }
    
    
    /* 
     * Solution using a HashMap
     * The complexity of this solution is 2xO(n)
     */
    public HashMap<Integer, Integer> findCommonElementsHM(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> hm = new HashMap();
        for(int i=0;i<arr1.length;i++) {
            if(!hm.containsKey(arr1[i])) {
                hm.put(arr1[i], 1);
            }
        }
        
        for(int i=0;i<arr2.length;i++) {
            if(hm.containsKey(arr2[i])) {
                hm.put(arr2[i], 2);
            }
        }
        
        return hm;
    }
    
    /*
     * Printing the values in the Hash Map which we detected as common
     */
    public void printHM(HashMap<Integer, Integer> hm) {
        System.out.println("Common elements: ");
        Iterator it = hm.entrySet().iterator();
        while(it.hasNext()) {
            Map.Entry<Integer,Integer> me = (Map.Entry) it.next();
            if(me.getValue()>=2) {
                System.out.print(me.getKey() + " ");
            }
        }
    }
    
    public static void main(String args[]) {
        int []arr1;
        int []arr2;
        
        CommonElement2Arrays ce2a= new CommonElement2Arrays(); 
        
        arr1 = ce2a.readArray();
        arr2 = ce2a.readArray();
        
        ce2a.printHM(ce2a.findCommonElementsHM(arr1, arr2));
        
    }
}

/*
 * Write a program for Insertion Sort.
 */

package tier1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class InsertSort {
    
    public ArrayList<Double> insertSort(ArrayList<Double> al) {
        
        for(int i=1; i<al.size();i++) {
            int j = i;
            while ( j>0 && al.get(j-1) > al.get(j) ) {
                double d = al.get(j);
                al.set(j, al.get(j-1));
                al.set(j-1, d);
                j--;
            }
        }
            
        return al;
    }
 
    
    public static void main(String args[]) {
        System.out.println("Insert array to insert sort separated by space: ");
        ArrayList<Double> al = new ArrayList<Double>();
        
        Scanner s = new Scanner(System.in);
        String line = s.nextLine();
        StringTokenizer st = new StringTokenizer(line, " ");
        s.close();
        while(st.hasMoreElements()) {
            al.add(Double.parseDouble(st.nextElement().toString()));
        }
        
        System.out.println("Sorted array: "+ new InsertSort().insertSort(al));
    }
}

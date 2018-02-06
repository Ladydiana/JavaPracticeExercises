/*
 * Write a program to sort an array using Bubble Sort.
 */

package tier1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BubbleSort {
    
    public ArrayList<Double> bubbleSort(ArrayList<Double> al) {
        double temp;
        for(int i=0; i< al.size(); i++)
            for(int j=i+1; j< al.size(); j++) 
                if(al.get(i) > al.get(j)) {
                    temp = al.get(i);
                    al.set(i, al.get(j));
                    al.set(j, temp);
                }
        
        return al;
    }
    
    public static void main(String args[]) {
        System.out.println("Insert array to bubble sort separated by space: ");
        ArrayList<Double> al = new ArrayList<Double>();
        
        Scanner s = new Scanner(System.in);
        String line = s.nextLine();
        StringTokenizer st = new StringTokenizer(line, " ");
        s.close();
        while(st.hasMoreElements()) {
            al.add(Double.parseDouble(st.nextElement().toString()));
        }
        
        System.out.println("Sorted array: "+ new BubbleSort().bubbleSort(al));
        
    }
}

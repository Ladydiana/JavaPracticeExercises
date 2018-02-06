/*
 * Write a program to implement your own ArrayList class.
 */

package java2novice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayListX {
    
    private Object[] arr;
    private int objSize;
    private int actSize;
    
    public ArrayListX() {
        this.objSize = 5;
        this.actSize = 0;
        arr = new Object[objSize];
    }
    
    public void add(Object o) {
        if(this.actSize+1>=this.objSize) {
            System.out.println("Resizing");
            resize();
        }
        else {
            System.out.println("Adding");
        }
        
        this.arr[actSize] = o;
        actSize++;
    }
    
    public void remove(Object o) {
        int i;
        
        for (i=0; i< actSize; i++) {
            if(o.equals(arr[i])) 
                break;
        }
        if(i==actSize) {
            System.out.println("Object not found in array");
            return;
        }
        
        for (int j=i; j<actSize-1; j++) {
            arr[j] = arr[j+1];
        }
        
        arr[actSize-1] = 0;
        actSize--;
    } 
    
    public void resize() {
        arr = Arrays.copyOf(arr, objSize*2);
        objSize *= 2;
    }
    
    public void print() {
        System.out.println("Array: ");
        for(int i=0; i< actSize; i++) {
            System.out.print(arr[i] + "; ");
        }
        System.out.println();
    }
    
    public Object get(int x) {
        return arr[x];
    }
    
    public int size() {
        return actSize;
    }
    
    public static void main(String args[]) {
        ArrayListX alx = new ArrayListX();
        String s = new String();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert array: ");
        
        while(true) {
            s=sc.nextLine();
            if(s.contains("exit")) {
                sc.close();
                break;
            }
            else
                alx.add(s);
        }
        
        System.out.println("Element at 0: "+alx.get(0));
        System.out.println("Element at "+ (alx.actSize-1) + ": " + alx.get(alx.actSize-1));
        System.out.println("Element at "+ (alx.actSize/2) + ": " +alx.get(alx.actSize/2));
        System.out.println("Array size: " + alx.size());
        alx.print();
        alx.remove(alx.get(alx.actSize/2));
        System.out.println("Element at "+ (alx.actSize-1) + ": " + alx.get(alx.actSize-1));
        System.out.println("Element at "+ (alx.actSize/2) + ": " +alx.get(alx.actSize/2));
        System.out.println("Array size: " + alx.size());
        alx.print();
        
    }
}

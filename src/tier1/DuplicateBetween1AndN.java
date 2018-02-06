package java2novice;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Diana Cristina Culincu
 */

/*
 * Find out duplicate number between 1 to N numbers.
 */
public class DuplicateBetween1AndN {
    
    public static Integer getDuplicate(ArrayList<Integer> l) {
        int max = l.size();
        int sum = 0;
        
        for (int i = 0; i < l.size(); i++) {
            sum += l.get(i);
        }
        
        return sum - (max * (max-1) /2);
    }
    
    public static void main(String args[]) {
        
        int N;
        ArrayList <Integer> listNum = new ArrayList<Integer>();
        
        Scanner s = new Scanner(System.in);
        N = s.nextInt();
        
        while(N != 0) {
            listNum.add(N);
            N = s.nextInt();
        }   
        
        System.out.println(getDuplicate(listNum));
    }
}

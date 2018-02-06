/* 
You are given an array of numbers. Find out the array index or position
where sum of numbers preceeding the index is equals to sum of numbers
succeeding the index.
*/
package tier2;

import java.util.ArrayList;

public class MiddleIndexEqualSum {
    
    int index = -1;
    
    
    public static int findMiddleIndex(ArrayList<Integer> a) throws Exception {
        int start = 0;
        int end = a.size() - 1;
        int sumLeft = 0;
        int sumRight = 0;
        
        while(true) {
            if(sumLeft > sumRight) {
                sumRight += a.get(end);
                end-=1;
            }
            else if (sumLeft < sumRight){
                sumLeft += a.get(start);
                start+=1;
            }
            //System.out.println("We got here");
            else if(start > end && sumLeft==sumRight)
                return end;
            else if (start > end && sumLeft!=sumRight )
                throw new Exception("Invalid array.");
        }
        
    }
    
    
    public static void main(String args[]) {
        ArrayList <Integer> al = new ArrayList<Integer>();
        
        al.add(1);
        al.add(2);
        al.add(1);
        al.add(2);
        
        try {
            System.out.println(findMiddleIndex(al));
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}

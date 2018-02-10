/*
 * Implement a Set using only primitives.
 */

package tier2;

import java.util.Arrays;

public class SetX {
    
    public int [] set;
    public int length;
    public int actSize;
    
    public SetX(int []set) {
        this.set = set;
        this.length = set.length;
        this.actSize = set.length;
    }
    
    public SetX(int size) {
        this.length = size;
        this.set=new int[size];
        this.actSize = 0;
    }
    
    public SetX() {
        this(10);
    }
    

    public void add(int x) {
        if(actSize<length-1) {
            if(!contains(x)) {
                set[actSize] = x;
                actSize++;
            }
        }
        else {
            resize();
            add(x);
        }
    }
    
    public void resize() {
        set = Arrays.copyOf(set, length*2);
        length *= 2;
    }
    
    
    public void clear(){
        this.length = 5;
        this.actSize = 0;
        this.set = new int[5];
    }
    
    
    public void remove(int x) {
        if(!contains(x))
            return;
        else {
            for(int i=0; i < actSize; i++) {
                if(x == set[i]) {
                    for(int j=i+1; j< actSize; j++) {
                        set[j-1] = set[j];
                    }
                actSize -= 1;
                break;
                }
            }
        }
    }
    
    
    public boolean contains(int y) {
        for(int i=0; i < actSize; i++) {
            if(y == set[i]) { 
                return true;
            }
        }
        return false;
    }
    
    public int size() {
        return actSize;
    }
    
    @Override
    public String toString() {
        String s = "[ ";
        for(int i=0; i<actSize; i++) {
            s = s+ set[i] + "; ";
        }
        s += "]";
        return s;
    }
    
    public static void main(String args[]) {
        SetX sx = new SetX();
        
        System.out.println(sx.size());
        sx.add(10);
        sx.add(5);
        sx.add(2);
        System.out.println(sx.size());
        System.out.println(sx.toString());
        sx.add(7);
        sx.add(9);
        System.out.println(sx.size());
        System.out.println(sx.toString());
        sx.add(-5);
        sx.add(-8);
        System.out.println(sx.size());
        System.out.println(sx.toString());
        sx.remove(5);
        System.out.println(sx.size());
        System.out.println(sx.toString());
    }
}

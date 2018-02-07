/*
 * Implement a Set using only primitives.
 */

package tier2;

public class SetX {
    
    public int [] set;
    public int length;
    public int actSize;
    
    public SetX(int []set) {
        this.set = set;
        this.length = 10;
        this.actSize = 0;
    }
    
    public SetX(int size) {
        this.length = size;
        this.set=new int[size];
        this.actSize = 0;
    }
    
    

    public void add(int x) {
        
    }
    
    
    public void clear(){
        this.length = 10;
        this.actSize = 0;
        this.set = new int[10];
    }
    
    
    public void remove(int x) {
        if(!contains(x))
            return;
        else {
            for(int i=0; i < actSize; i++) {
                if(x == set[i]) {
                    for(int j=i+1; j< actSize-1; j++) {
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
    
    public static void main(String args[]) {
        
    }
}

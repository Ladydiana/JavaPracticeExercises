/*
 * Write a program to find out duplicate or repeated characters in a string.
 */

package java2novice;


import java.util.Scanner;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DuplicateCharacters {
    
    private String s;
    HashMap<Character, Integer> hm;
    
    public DuplicateCharacters() {
        this.s = new String();
        hm = new HashMap<Character, Integer>();
    }
    
    public DuplicateCharacters(String s) {
        this.s = s;
        hm = new HashMap<Character, Integer>();
    }
    
    public HashMap findDuplicateCharacters() {
        char c;
        for(int i=0; i< s.length(); i++) {
            c=s.charAt(i);
            if(hm.containsKey(c)) {
                hm.put(c, hm.get(c)+1);
            }
            else {
                hm.put(c, 1);
            }
        }
        
        HashMap <Character, Integer> duplicates = new HashMap<Character, Integer>();
        
        Iterator it = hm.entrySet().iterator();
        while(it.hasNext()) {
            Map.Entry<Character, Integer> me = (Map.Entry) it.next();
            if(me.getValue()>1) {
                duplicates.put(me.getKey(), me.getValue());
            }
        }
        
        return duplicates;
    }
    
    public HashMap findDuplicateCharacters(String s) {
        this.s = s;
        return findDuplicateCharacters();    
    }
    
    public void printDuplicates(HashMap h) {
        Iterator it = h.entrySet().iterator();
        
        while(it.hasNext()) {
            Map.Entry<Character, Integer> me = (Map.Entry) it.next();
            Character c = me.getKey();
            int v = me.getValue();
            System.out.println(c + "-" + v);
        }
    }
    
    public static void main(String args[]) {
        
        System.out.print("Insert string: ");
        DuplicateCharacters dc = new DuplicateCharacters(new Scanner(System.in).next());
        dc.printDuplicates(dc.findDuplicateCharacters());
    }
}
/*
 * Given a string, find the longest substrings without repeating characters.
 */

package tier2;

import java.util.Scanner;
import java.util.HashMap;

public class LongestSubstringNonRepeat {
    
    
    public String findLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        String longestS = new String();
        HashMap<Character, Integer> map = new HashMap<>(); // current index of character
        
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            if(longestS.length()<s.substring(i, j+1).length())
                longestS = s.substring(i, j+1);
            map.put(s.charAt(j), j + 1);
        }
       return longestS;
    }
    
    
    public static void main(String args[]) {
        System.out.print("String to check: ");
        String s = new Scanner(System.in).nextLine();
        
        System.out.println( "Longest distinct substring: " +
                            new LongestSubstringNonRepeat().findLongestSubstring(s));
    }
}

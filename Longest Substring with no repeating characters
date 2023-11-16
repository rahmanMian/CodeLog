
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() <= 1) {  //edge case if substring is only one val
            return s.length();
        }
        //use a hashSet-> no duplicates allowed
        //sliding window approach

        Set<Character> HashSet = new HashSet<>();
        //this will store our non-dup values
        int left = 0, max = 0;
        
        for(int right = 0; right <  s.length(); right++){

            if(!HashSet.add(s.charAt(right))){
               
                  while (s.charAt(left) != s.charAt(right)) {
            HashSet.remove(s.charAt(left));
            left++;
        }

        left++;
            }

           
            max = Math.max(max, (right - left + 1));
        }

              return max;

        
    }
}

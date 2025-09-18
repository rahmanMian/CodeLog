/*
Sliding window approach - O(N)
We keep moving till we find a duplicate. How do we find a duplicate. using a hashset.contains().
keep removing values from the left until the duplicate is removed. Restart the substring.


If you dont use contains it reduces time by 2 ms
*/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        //set up 
        Set<Character> set = new HashSet<>();

        
        int left = 0;
        int maxSubString = 0;
        // move right poitner
        for(int right = 0; right < s.length(); right++){
            // pick char
            char currValue = s.charAt(right);
            // if set has star contains dup - start removing till you find
            while(set.contains(currValue)){
                //remove
                set.remove(s.charAt(left));
                // mvove left
                left++;
            }
            // add value back in
            set.add(currValue);
            // r - l cuz if both same char we need + 1
            maxSubString = Math.max(maxSubString, right - left + 1);
        }

        return maxSubString;
        
    }
}

/*
Sliding window approach - O(N)
We keep moving till we find a duplicate. How do we find a duplicate. using a hashset.contains().
keep removing values from the left until the duplicate is removed. Restart the substring.


If you dont use contains it reduces time by 2 ms
*/

class Solution {
    public int lengthOfLongestSubstring(String s) {

        Set<Character> set = new HashSet<>();


        int left = 0;
        int maxSubString = 0;

        for(int right = 0; right < s.length(); right++){
            char currValue = s.charAt(right);

            while(set.contains(currValue)){
                set.remove(s.charAt(left));
                left++;
            }

            set.add(currValue);

            maxSubString = Math.max(maxSubString, right - left + 1);
        }

        return maxSubString;
        
    }
}

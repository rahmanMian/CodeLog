/*
Sliding Window - O(26 * N) coud be 26 characters
The slide window is for skipping checking every substring. Moves the left pointer to a new point where it can restart


*/

class Solution {
    public int characterReplacement(String s, int k) {
        Set<Character> charSet = new HashSet<>();
       
        int result = 0;
  

        for(char val: s.toCharArray()){
            charSet.add(val);
        }

        for(char c: charSet){
            int count = 0; int left = 0;
            for(int right = 0; right < s.length(); right++){
                if(s.charAt(right) == c){
                    count++;
                }

                while((right - left + 1) - count > k){
                    if(s.charAt(left) == c){
                        count--;
                    }
                    left++;
                }

                result = Math.max(result, (right - left + 1));
            }
        }

        return result;
        
    }
}

/*
  BRUTEFORCE - O(N^3)
   String subString = s.substring(i, j + 1);
*/


class Solution {
    public int countSubstrings(String s) {

        int count = 0;
        for(int i = 0; i <  s.length(); i++){
            for(int j = i; j < s.length(); j++){
                String subString = s.substring(i, j + 1);
        
                if(isPalindrome(subString)){
                    count++;
                }
            }
        }
        return count;
    }
    
    
    public boolean isPalindrome(String subString){
        int left = 0;
        int right = subString.length() - 1;

        while(left <= right){
            if(subString.charAt(left) != subString.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }   
    
}
/*
EXPAND FROM MIDDLE - O(N^2)
-EDGE CASE WHEN YOU JUST USE ONE CHAR FROM MIDDLE ONLY ACCOUNTS FOR ODD STRINGS
-USE TWO VALUES FOR EVEN EDGE CASE




*/

//BRUTE FORCE
class Solution {
    public String longestPalindrome(String s) {

        int maxCount = 0;
        String maxPalindrome = "";

        
        for(int i = 0; i < s.length(); i++){
            //KEEP I+1 AS RIGHT NOT INCLUSIVE
            for(int j = i + 1; j <= s.length(); j++){
                String subString = s.substring(i, j);
               if(isPalindrome(subString) == true){
                    if(subString.length() > maxCount){
                        maxPalindrome = subString;
                        maxCount = subString.length();
                    }
               }
            }
        }
        
        return maxPalindrome;
    }

    public Boolean isPalindrome(String subString){
        int left = 0;
        int right = subString.length() - 1;


        if(subString.length() == 1){return true;}

        for(int i = 0; i < subString.length(); i++){
            if (subString.charAt(left) != subString.charAt(right)){
                return false;
            }   
            left++;
            right--;
        }

        return true;
    }
}


class Solution {
    public String longestPalindrome(String s) {
       if(s.length() <= 1){
           return s;
       }
           String maxSubStr = "";
           for(int i = 0; i < s.length() - 1; i++){
              String odd = subSet(s, i, i);
            //  String even = subSet(s, i, i + 1);
            if (odd.length() > maxSubStr.length()) {
                maxSubStr = odd;
            }
           }
          return maxSubStr;
    }
    public String subSet(String s,int left,int right){
     while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
         left--;
         right++;
      }
     return s.substring(left + 1, right);// right isnt inclusive left is(left + 1) right normal
    }
}

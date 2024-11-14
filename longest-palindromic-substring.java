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

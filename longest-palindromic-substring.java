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
       if(s.length() <= 1 ){return s;}

        //WE SEND TWO VALUES AS THERE IS AN EVEN OR ODD CASE FOR EACH SUBSTRING
        String val1 = subSet(s,0);
        String val2 = subSet(s,1);
     return val1.length() > val2.length() ? val1 : val2;

    
    }


    //POINT IS WE HAVE TO FIND A VALUE INSIDE A STRING HENCE WE PULSE FROM THE MIDDLE NOT FROM THE START AND END IN NORMAL PALINDROME
    public String subSet(String s,int val){
         String longest = "";
        for(int i = 0;  i < s.length(); i++){
           int left = i;
           int right = i + val;
           //make sure to keep the index checkes first
           while( left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
               left--;
               right++;
           }

          //the last move in while moves the indexes out of place so we need to shift back in left is inclusive hence +1 while right is not
                                              //^^^^^^^^^^^^^
            String palindrome = s.substring(left + 1,right);
           if (palindrome.length() >longest.length()){
               longest = palindrome;
           }
        }
           return longest;
    }
}


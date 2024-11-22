
//My solution
class Solution {
    public boolean isPalindrome(String s) {
        //first remove whute soaces and keep values only a-z
                                                      //^means not and swap all these values with ""
        String cleaned =  s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        int start = 0;
        int end = cleaned.length() - 1;

        while(start < end){
            if(cleaned.charAt(start) == cleaned.charAt(end)){
                start++;
                end--;
            }else{
                return false;
            }
        }

        return true;
    }
}

//optimxe values
Solution {
    public boolean isPalindrome(String s) {

        if(s.isEmpty()){
            return true;
        }

        int start = 0;
        int end = s.length() - 1;

        while(start <= end){
         char startChar = s.charAt(start);
         char endChar = s.charAt(end);

         if(!(Character.isLetterOrDigit(startChar))){
            start++;
         }else if(!(Character.isLetterOrDigit(endChar))){
            end--;
         }else{
            if(Character.toLowerCase(startChar) != Character.toLowerCase(endChar)){
                return false;
            }
            start++;
            end--;
         }
        }

        return true;
    }
}

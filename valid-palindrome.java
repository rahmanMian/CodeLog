
//My solution

//you will have to remember replaceAll or isLetterOrDigit ^a-zA-Z0-9
class Solution {
    public boolean isPalindrome(String s) {
        String cleanS = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = cleanS.length() - 1;


        while(left < right){
            char lChar = cleanS.charAt(left);
            char rChar = cleanS.charAt(right);

            if(lChar != rChar){return false;}
            left++;
            right--;
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

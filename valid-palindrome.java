class Solution {
    public boolean isPalindrome(String s) {
        //first remove whute soaces and keep values only a-z
                                                      //this means keep all tehse values in
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

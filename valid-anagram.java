class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int[] arr = new int[26]; //26 characters in alphabet


        for(int i = 0; i < s.length(); i++){

            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;

            // 'a' - 'a' = 0
            // 'b' - 'a' = 1
            // 'z' - 'a' = 25
        }


        for(int val: arr){
            if(val != 0){
                return false;
            }
        }

        return true;


    }
}

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        //26 letters in alphabet
        int[] store = new int[26];

        for(int i = 0; i < s.length(); i++){
            char sVal =  s.charAt(i);
            char tVal = t.charAt(i);
            store[sVal - 'a']++;
            store[tVal  - 'a']--;
        }

        for(int val : store){
            if (val != 0){
                return false;
            }
        }
        return true;
    }

/*
BRUTE FORCE - O(N^2)


*/



class Solution {
    public boolean checkInclusion(String s1, String s2) {

        char[] arr1 = s1.toCharArray();
        Arrays.sort(arr1);
       
       
    
                        //stop the substring length amount away
        for(int i = 0; i <= s2.length() - s1.length(); i++){
             String sub = s2.substring(i, i + s1.length());
             char[] subArr = sub.toCharArray();
             Arrays.sort(subArr);

             if (Arrays.equals(arr1, subArr)) {
                return true;
            }
        }


        return false;

    }
}

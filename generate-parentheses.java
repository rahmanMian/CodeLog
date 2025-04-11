//Brute force
//O(2^2n∗n)

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        dfs("", res, n);
        return res;
    }

    void dfs(String s, List<String> res, int n){
        if (n * 2 == s.length()){
            if(valid(s)) res.add(s);
            return;
        }
      //tries every single possibility
        dfs(s + '(', res, n);
        dfs(s + ')', res, n);
    }

    public boolean valid(String s){
        int open = 0;
       //open should never go negative in the loop 
        for (char c : s.toCharArray()){
            open += c == '(' ? 1 : -1;
            if (open < 0) return false;
        }
        return open == 0;
    }
}

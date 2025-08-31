//Use .equals for strings 

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String token: tokens){
           if( !(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/"))){
            //Integer.parseInt(token) remember the syntac
            stack.push(Integer.parseInt(token));
           }else{
            int val2 = stack.pop();
            int val1 = stack.pop();
            ///.equals for strings
               
            if(token.equals("/")){
                stack.push(val1 / val2);
            }else if (token.equals("+")){
                  stack.push(val1 + val2);
            }else if (token.equals("-")){
                  stack.push(val1 - val2);
            }else{
                  stack.push(val1 * val2);
           }
          }
        }
        
         return stack.pop();
    }
   
}

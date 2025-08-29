//add the other bracket and we have to remove it for the next line

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char val : s.toCharArray()) {
            if (val == '(') {
                stack.push(')');
            } else if (val == '{') {
                stack.push('}');
            } else if (val == '[') {
                stack.push(']');
            } else {
                // If it's a closing bracket, check if stack is empty or if the popped value doesn't match
                //isEmpty for  edge case: "]" 
                if (stack.isEmpty() || stack.pop() != val) {
                    return false;
                }
            }
        }

        return stack.isEmpty(); // Ensure all brackets are matched
    }
}


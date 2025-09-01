//O(n^2)

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int[] arr = new int[temperatures.length];

        for(int i = 0; i < temperatures.length - 1;i++){
            for(int j = i + 1; j < temperatures.length; j++){
                if (temperatures[i] < temperatures[j]){
                    arr[i] = j - i;
                    break;
                }
            }
        }
        return arr;
    }
}


//Stack   - O(2n) -> O(n)
//stack like pancakes unitl you find a value higher - > that means that val is higher than all the values in the stack. You can now empty the stack one by one and get the days till


class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] days =  new int[temperatures.length];

        for(int i = 0; i < temperatures.length ; i++){
            while(!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]){
                 days[stack.peek()] = i - stack.pop();
            }
            stack.push(i);
        }

        return days;
      
    }

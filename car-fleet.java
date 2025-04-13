
/*
Why double -> time can be integer
Why hashMap -> we have to sort position and keeo links with speed
Why stack -> values will merge and move forwared
Why descending -> Values closer to target might finish -> starting from the back will be more complicated. You will have to keep account of more variables
Why time -> (target - position[i]) /  speed[i]) -> simple takes longer wont become fleet vice versa

O(nlogn) -> Dual-Pivot Quicksort -> O(n) < O(nlogn) -> we take the worse time
 
*/


class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        
        Map<Integer, Double> map = new HashMap<>();
        for(int i = 0; i < position.length; i++){
            map.put(position[i] ,(double) (target - position[i]) /  speed[i]);
        }

        Arrays.sort(position);

        Stack<Double> stack = new Stack<>();
        
        for(int i =  position.length - 1; i >= 0; i--){
            if(stack.isEmpty() || map.get(position[i]) > stack.peek()){
                stack.push(map.get(position[i]));
            }
            
        }
        return stack.size();
    }

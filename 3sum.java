import java.util.Collections;

//loook carefully at thos
class Solution {
public List<List<Integer>> threeSum(int[] nums) {
        //array we need to find triplets that are unique and add up to zero
        
        List<List<Integer>> listOfLists = new ArrayList<>();
         

         Arrays.sort(nums);
     

       
          if (nums.length < 3){ return listOfLists; }

        
          for(int i = 0; i < nums.length - 2; i++){

               if (i > 0 && nums[i] == nums[i - 1]){
                   continue;
               }

            int j = i + 1;
            int k = nums.length - 1;

              while(j < k){
                  int sum = nums[i] + nums[j] + nums[k];

                  if((sum == 0)){
                                            //Convert array to list
                      listOfLists.add(Arrays.asList(nums[i], nums[j], nums[k]));

                         // Skip duplicate elements for j
                    while (j < k && nums[j] == nums[j + 1]) {
                        j++;
                    }

                    // Skip duplicate elements for k
                    while (j < k && nums[k] == nums[k - 1]) {
                        k--;
                    }


                    
                  j++;
                  k--;


                  }else if (sum < 0){
                      j++;
                  } else{
                      k--;
                  }
              }
            
             }

        


                return listOfLists;
    }

}

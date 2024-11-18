//inefficient

public int[] productExceptSelf(int[] nums) {
        int[] array = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int product = 1; // Temporary variable for the product
          for (int j = 0; j < nums.length; j++) {
             if (j != i){
                product *= nums[j];
              }
            }
        array[i] = product; // Assign the computed product to array[i]
      }
        return array;
    }

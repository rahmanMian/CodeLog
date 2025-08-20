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

// prefix postifx -- calculate prodcut for values before and store, calcuata for each step after and store
// store in two arrays
// make a final array to store the pre and post mult
//good sol you just made nums.length - 1 while making array
// just make 3 arrays


    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] post = new int[n];
        int[] pre = new int[n];
        int[] result = new int[n];

        pre[0] = 1;
        post[n - 1] = 1;

        for(int i = 1; i < n; i++){
            pre[i] = pre[i - 1] * nums[i - 1];
        }

        for(int i = n - 2; i >= 0; i--){
            post[i] = post[i + 1] * nums[i + 1];
        }

        for(int i = 0; i < n; i++){
            result[i] = post[i] * pre[i];
        }

        return result;
    }



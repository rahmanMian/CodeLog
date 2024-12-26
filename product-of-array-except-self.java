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
public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int[] pre = new int[n];
        int[] post = new int[n];

        //nothing before so pre is identity element
        pre[0] = 1;
        ////nothing after so post is identity element
        post[n - 1] = 1;

        //multiply the pre nums value and the array for the prev array for prev valuue
        for(int i = 1; i < n; i++){
            pre[i] = nums[i-1] * pre[i-1];
        }

        //n-2 cuz we need to have a one value gap to multiply
        for(int i = n - 2; i >= 0; i--){
            post[i] = nums[i+1] * post[i+1];
        }

        for(int i = 0; i < n; i++){
            result[i] = post[i] * pre[i];
        }

        return result;
    }

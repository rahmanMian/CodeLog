//brute force --- solved out of order will get back to you
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        for(int i = 0; i < matrix.length; i++){
            int innerArrayLength = matrix[i].length;
            if(matrix[i][innerArrayLength - 1] < target){
                continue;
            }else{
                int j = 0;
                while(j < innerArrayLength){
                    if(matrix[i][j] == target){
                        return true;
                    }
                    j++;
                }
            }
        }

        return false;
    }
}

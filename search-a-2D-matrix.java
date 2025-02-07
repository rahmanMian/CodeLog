/*
BINARY SEARCH
O(log m * n) m is binary search for indivual matrix and n is looping through every matrix
Simple Binary Search while looping through the matrix
*/

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        for(int matrixNumber = 0; matrixNumber < matrix.length; matrixNumber++){
            int left = 0;
            int right = matrix[matrixNumber].length - 1;
            
            while(left <= right){
                  int mid = (left + right) / 2;
                if(matrix[matrixNumber][mid] == target){
                    return true;
                }else if (matrix[matrixNumber][mid] < target){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }
        }

        return false;
    }
}

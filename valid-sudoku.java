//optimal add row and col dupr 
// row/3 and col/3 will put these in sub boxes

class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();


        for(int row = 0; row < 9; row++){
         for(int col = 0; col < 9; col++){
              char value = board[row][col];
              if(value !=  '.'){
              if (!seen.add(value + "r" + row) || !seen.add(value + "c" + col) || !seen.add(value + "b" + row/3 + col/3)){
                return false;
              }
              }
         }
        }
        return true;
    }
}

// Brute Force shouldve used a hashset indeset
// class Solution {
//     public boolean isValidSudoku(char[][] board) {
//         //no dup rows
//         // no dup cols
//         //each 3x3 no dups
//         Map<Character, Integer> hashMap = new HashMap<>();

        
//          for (int row = 0; row < board.length; row++) { // Fixed the iteration over rows
//             hashMap.clear(); // Clear the map for each row
//             for (int col = 0; col < board[row].length; col++) { // Iterate over columns in the row
//                 char value = board[row][col];
//                 if (value != '.') { // Assuming '.' represents an empty space
//                     hashMap.put(value, hashMap.getOrDefault(value, 0) + 1);
//                     if (hashMap.get(value) > 1) {
//                         return false; // Duplicate found in the row
//                     }
//                 }
//             }
//         }

//           for (int col = 0; col < board[0].length; col++) { // Fixed the iteration over columns
//             hashMap.clear(); // Clear the map for each column
//             for (int row = 0; row < board.length; row++) { // Iterate over rows in the column
//                 char value = board[row][col];
//                 if (value != '.') { // Assuming '.' represents an empty space
//                     hashMap.put(value, hashMap.getOrDefault(value, 0) + 1);
//                     if (hashMap.get(value) > 1) {
//                         return false; // Duplicate found in the column
//                     }
//                 }
//             }
//            }

//          for (int boxRow = 0; boxRow < board.length;boxRow+= 3) { 
//             for(int boxCol = 0; boxCol < board[0].length;boxCol+=3){
//                   hashMap.clear();
//                 for (int row = boxRow; row < boxRow + 3; row++) {
//                     for (int col = boxCol; col < boxCol + 3; col++) {
//                         char value = board[row][col];
//                         if (value != '.') { // Assuming '.' represents an empty space
//                     hashMap.put(value, hashMap.getOrDefault(value, 0) + 1);
//                     if (hashMap.get(value) > 1) {
//                         return false; // Duplicate found in the column
//                     }
//                     }
//                     }
                    
//                 }
//             }
//         }

//         return true;
//     }

// }


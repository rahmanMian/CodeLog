/*an API request optimization system, a sequence of binary request codes, represented by requestSeq, consists of '0's and '1's. The system requires that this sequence be divided into non-overlapping segments of even length, where each segment contains only identical request codes (either all '1's or all '0's). Implement a function to calculate the minimum number of request code flips (changing '0' to '1' or '1' to '0') required to meet this requirement.

Input:

A string requestSeq consisting solely of the characters '0' and '1', representing the sequence of binary request codes.
Output:

An integer representing the minimum number of flips required to transform requestSeq into non-overlapping, even-length segments of identical request codes.
Example 1:

Input: "11010010"
Output: 2
Explanation: Flip two '1's to get "11110000", resulting in segments "1111" and "0000".
Example 2:

Input: "101011"
Output: 2
Explanation: Flip two '0's to get "111111", resulting in a single segment "111111".
Constraints:

The length of requestSeq is between 1 and 10⁵.*/


//BRUTE FROOCE -- BEST WAY IS THROUGH GREEDY OR DYNAMIC BUT IDK RN

public class RequestOptimizer {
    public static int minFlipsBruteForce(String requestSeq) {
        int n = requestSeq.length();
        if (n % 2 == 1) {
            return Integer.MAX_VALUE; // If the length is odd, it's impossible to split into even-sized segments
        }

        int minFlips = Integer.MAX_VALUE;

        // Try segment sizes of 2, 4, 6, ..., up to n
        for (int segmentSize = 2; segmentSize <= n; segmentSize += 2) {
            int flips = 0;

            // Process the string in chunks of segmentSize
            for (int i = 0; i < n; i += segmentSize) {
                if (i + segmentSize > n) break; // Skip if remaining characters are not enough for a full segment

                String segment = requestSeq.substring(i, i + segmentSize);
                int countZeros = 0, countOnes = 0;

                // Count occurrences of '0' and '1' in this segment
                for (char c : segment.toCharArray()) {
                    if (c == '0') countZeros++;
                    else countOnes++;
                }

                // Choose the minimum flips needed (either to all '0' or all '1')
                flips += Math.min(countZeros, countOnes);
            }

            minFlips = Math.min(minFlips, flips);
        }

        return minFlips;
    }

    public static void main(String[] args) {
        System.out.println(minFlipsBruteForce("11010010")); // Output: 2
        System.out.println(minFlipsBruteForce("101011"));   // Output: 2
    }
}

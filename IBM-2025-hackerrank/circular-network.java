/*
A circular network has n components represented as a string named components. Each component is either a 'Compute' ('C') unit or a 'Network' ('N') unit. The components are arranged in a circle, meaning the first component is adjacent to the last component.

Determine the minimum number of swaps needed to group all the Compute units together, and all the Network units together.

Example
components = "CNCN"

There are several possible solutions:

Swap indexes 1 and 2 to get 'CCNN'
Swap indexes 0 and 3 to get "NNCC"
Swap indexes 0 and 1 to get "NCCN"
Swap indexes 2 and 3 to get "CNNC"
The minimum number of moves is 1.

*TIPS
*We can swap any value, not just adjacent
*Loop through and count number of C's -> this will be our window size
*GOAL: Find a window of size C with the least amount N's so we can swap the remaining C's in
*Circular tip: Double the string so we can iterate Forward
*/



class Main {
    public static void main(String[] args) {
        System.out.println(minimumSwaps("CNCNCN")); // Expected: 1
        System.out.println(minimumSwaps("CCNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNC"));   // Expected: 1
        System.out.println(minimumSwaps("CCCCNNNN")); // Expected: 0
    }

    static int minimumSwaps(String s) {
        int n = s.length();
        int cCount = 0;

        // Count the number of 'C' units
        for (char ch : s.toCharArray()) {
            if (ch == 'C') cCount++;
        }

        // If all are 'C' or all are 'N', no swaps are needed
        if (cCount == 0 || cCount == n) return 0;

        // Create a circular array by doubling the string
        String doubled = s + s;
        int minSwaps = Integer.MAX_VALUE;
        int currentMisplaced = 0;

        // Count misplaced elements in the first window
        for (int i = 0; i < cCount; i++) {
            if (doubled.charAt(i) == 'N') currentMisplaced++;
        }
        minSwaps = currentMisplaced;

        // Sliding window to check all possible arrangements
        for (int i = 0; i < n; i++) {
            // Remove outgoing element
            if (doubled.charAt(i) == 'N') currentMisplaced--;
            // Add incoming element
            if (doubled.charAt(i + cCount) == 'N') currentMisplaced++;

            minSwaps = Math.min(minSwaps, currentMisplaced);
        }

        return minSwaps;
    }
}



// Java lacks built-in support for arbitrarily large integers in standard numerical operations (unlike Python).
// The modulo 1e9 + 7 is commonly used to prevent integer overflow while ensuring calculations remain efficient.
// Since Java long is limited to 64-bit precision, direct exponentiation could exceed this, requiring modular arithmetic.
// MOD is 1e9 + 7 to stop overflow
//EDGES IS E = (n * (n - 1)) / 2 is the number of edges in a graph
//2 ^ E is the number of graphs being able to form
class Main
{
    static final int MOD = (int)1e9 + 7; //
    
    // Function to return (x^y) % MOD 
    // in O(log(y)) 
    static long power(long base, long y)
    { 
        long result = 1; 
        while (y > 0) 
        { 
            if ((y & 1) != 0) /// chekcs if y is odd
                result = (result * base) % MOD; 
            base = (base * base) % MOD;   //%MOD is for overflow
            y /= 2; 
        } 
        return result; 
    } 
    
    // Function to return the count of distinct 
    // graphs possible with n vertices 
    static long countGraphs(int n) 
    { 
    
        // Maximum number of edges for a 
        // graph with n vertices 
        long x = n * (n - 1) / 2; 
    
        // Function to calculate 
        // (2^x) % mod 
        return power(2, x); 
    } 
    
    // Driver code 
    public static void main (String[] args) 
    { 
        int n = 5; 
    
        System.out.println(countGraphs(n)); 
    }
}

// This code is contributed by AnkitRai01

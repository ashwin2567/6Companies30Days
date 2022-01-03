/*
https://practice.geeksforgeeks.org/problems/ugly-numbers2254/1/
Ugly Numbers
Ugly numbers are numbers whose only prime factors are 2, 3 or 5.
The sequence 1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 15, … shows the first 11 ugly numbers. 
By convention, 1 is included. Write a program to find Nth Ugly Number.
*/

class Solution {
    /* Function to get the nth ugly number*/
    long getNthUglyNo(int n) {
        long[] dp = new long[n+1];
        dp[1] = 1;
        int p2 = 1;
        int p3 = 1;
        int p5 = 1;
        
        for(int i = 2; i <= n; i++)
        {
            long f2 = 2 * dp[p2];
            long f3 = 3 * dp[p3];
            long f5 = 5 * dp[p5];
            
            long min = Math.min(f2, Math.min(f3, f5));
            
            dp[i] = min;
            if(min == f2)
                p2++;
            if(min == f3)
                p3++;
            if(min == f5)
                p5++;
        }
        return dp[n];
    }
}

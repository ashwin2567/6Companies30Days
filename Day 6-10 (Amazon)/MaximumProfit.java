/*https://practice.geeksforgeeks.org/problems/maximum-profit4657/1*/
class Solution {
    public int maxProfit(int k, int[] prices) {
        int n = prices.length;
         if(k==0 || n==0)
            return 0;
        int dp[][]=new int[k+1][n];
        for(int t=1;t<=k;t++)
        {
            int max = Integer.MIN_VALUE;
            for(int d=1;d<n;d++)
            {
                max = Math.max(max, dp[t-1][d-1] - prices[d-1]);
                dp[t][d] = Math.max(dp[t][d-1], max+prices[d]);
            }
        }
        return dp[k][n-1];
    }
}

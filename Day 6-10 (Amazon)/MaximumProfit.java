/*https://practice.geeksforgeeks.org/problems/maximum-profit4657/1*/
class Solution {
    static int maxProfit(int k, int n, int a[]) {
        int dp[][]=new int[k+1][n+1];
        for(int i=0;i<n;i++)
        {
            dp[0][i] = 0;
        }
        for(int i=0;i<=k;i++)
        {
            dp[i][0] = 0;
        }
        
        for(int i=1;i<=k;i++)
        {
            int cn=Integer.MIN_VALUE;
            for(int j=1;j<n;j++)
            {
                cn = Math.max(cn, dp[i-1][j-1] - a[j-1]);
                int ans = Integer.MIN_VALUE;
                ans = Math.max(ans, a[j] + cn);
                dp[i][j] = Math.max(ans, dp[i][j-1]);
            }
        }
        return dp[k][n-1];
        
    }
}

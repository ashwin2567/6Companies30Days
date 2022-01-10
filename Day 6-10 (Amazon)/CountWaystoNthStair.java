class Solution
{
  Long countWays(int m)
    {
        if(m<=2)
            return (long)m;
        long dp[]=new long[m+1];
        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<=m;i++)
        {
            dp[i]=Math.min(dp[i-1]+1, dp[i-2]+1);
        }
        return dp[m];
    }    
}

class Solution{
    static int equalPartition(int N, int arr[])
    {
        int sum = 0;
        for(int i=0;i<N;i++)
            sum += arr[i];
        if(sum%2!=0)
            return 0;
        else
        {
            sum=sum/2;
            boolean dp[][]=new boolean[N+1][sum+1];
            for(int i=0;i<=N;i++)
                for(int j=0;j<=sum;j++)
                {
                    if(i==0)
                        dp[i][j]=false;
                    if(j==0)
                        dp[i][j]=true;
                }
            for(int i=1;i<=N;i++)
            {
                for(int j=1;j<=sum;j++)
                {
                    if(arr[i-1]<=j)
                    dp[i][j]= dp[i-1][j-arr[i-1]] || dp[i-1][j];
                    else
                    dp[i][j]=dp[i-1][j];
                }
            }
            if(dp[N][sum])
            return 1;
            else
            return 0;
        }
    }
}

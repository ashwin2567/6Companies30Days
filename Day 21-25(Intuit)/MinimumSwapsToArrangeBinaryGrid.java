class Solution {
    public int minSwaps(int[][] grid) {
        int n = grid.length;
        int list [] =new int[n];
        for(int i=0;i<n;i++)
        {
            int zeroes = 0;
            for(int j=n-1;j>=0;j--)
            {
                if(grid[i][j] != 0)
                    break;
                zeroes++;
            }
            list[i] = zeroes;
        }
        int numNeeded = n - 1;
        int ans = 0;
        while(numNeeded > 0)
        {
            boolean flag = false;
            for (int i = n - numNeeded - 1; i < n; i++)
            {
                if (list[i] >= numNeeded)
                {
                    System.out.println(list[i]);
                    int temp = list[i];
                    for (int k = i; k > n - numNeeded - 1; k--)
                        list[k] = list[k - 1];
                    list[n - numNeeded - 1] = temp;
                    flag = true;
                    ans += i - (n - numNeeded - 1);
                    break;
                }
            }
            if (!flag)
                return -1;
            numNeeded--;
        }
        return ans;
    }
}

class Solution {
    int lengthOfLongestAP(int[] nums, int n)
    {
        Map<Integer, Integer>[] dp = new HashMap[n];
        for (int i = 0; i < n; i++)
            dp[i] = new HashMap<>();

        int maxLen = 1;
        for (int i = 1; i < n; i++)
        {
            for (int j = 0; j < i; j++) 
            {
                int cd = nums[i] - nums[j];
                if (dp[j].containsKey(cd)) 
                {
                    dp[i].put(cd, dp[j].get(cd) + 1);
                } 
                else 
                {
                    dp[i].put(cd, 2);
                }
                maxLen = Math.max(maxLen, dp[i].get(cd));
            }
        }
        return maxLen;
    }
}

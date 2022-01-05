/*https://leetcode.com/problems/minimum-size-subarray-sum/submissions/*
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int count=Integer.MAX_VALUE;
        int sum=0;
        int i=0;int j=0;
        
        while(j<nums.length)
        {
            sum=sum+nums[j];
                while( sum >= target )
                {
                    count= Math.min(count, j-i+1);
                    sum = sum - nums[i];
                    i++;
                }
            j++;
        }
        return (count==Integer.MAX_VALUE)? 0: count;
        
    }
}

/*Given an array of integers and a number k, write a function that returns true if given array can be divided into pairs such that sum of every pair is divisible by k.
https://practice.geeksforgeeks.org/problems/array-pair-sum-divisibility-problem3257/1# */

class Solution {
    public boolean canPair(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i]%k, map.getOrDefault(nums[i]%k, 0)+1);
        }
        
        for(int val : nums)
        {
            int rem = val % k;
            int freq = map.get(rem);
            if(rem == 0 || 2 * rem == k)
            {
                if(freq%2!=0)
                    return false;
            }
            
            else
            {
                int complement= map.getOrDefault(k-rem, 0);
                if(freq != complement)
                    return false;
            }
        }
        return true;
    }
}

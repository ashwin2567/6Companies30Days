class Solution {
    public int splitArray(int[] nums, int m) {
        int max = 0;
        int sum = 0;
        for(int val : nums)
        {
            if(max < val)
                max = val;
            sum += val;
        }
        int lo = max;
        int hi = sum;
        
        if(m == nums.length)
            return max;
        
        int ans = 0;
        while(lo <= hi)
        {
            int mid = lo + (hi - lo)/2;
            if(isPossible(nums, mid, m))
            {
                ans = mid;
                hi = mid - 1;
            }
            else
                lo = mid + 1;            
        }
        return ans;
    }
    
    boolean isPossible(int[] arr, int mid, int m)
    {
        int nos = 1;
        int s = 0; 
        for(int i=0;i<arr.length;i++)
        {
            s = s + arr[i];
            if(s > mid)
            {
                i--;
                s =0;
                nos++;
            }
        }
        if(nos <= m)
            return true;
        else 
            return false;
    }
}

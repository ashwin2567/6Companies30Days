class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int val : weights)
        {
            max = Math.max(val, max);
            sum += val;
        }    
        if(days == weights.length)
            return max;
        
        int lo = max;
        int  hi = sum;
        int speed = Integer.MAX_VALUE;
        
        while(lo<=hi)
        {
            int sp = lo + (hi - lo) / 2;
            if(isPossible(weights,sp,days) == true)
            {
                speed = sp;
                hi = sp - 1;
            }
            else
            {
                lo = sp + 1;
            }
        }
        return speed;
    }
    public static boolean isPossible(int[] weights, int sp, int days)
    {
        int count = 0;
        int s = 0;
        for(int i=0;i< weights.length;i++)
        {
            s = s+weights[i];
            if(s>sp)
            {
                s=0;
                count++;
                i--;
            }
        }
        if(count + 1<= days)
            return true;
        else
            return false;
    }
}

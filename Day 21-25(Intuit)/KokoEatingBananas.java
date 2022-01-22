class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;
        for(int val : piles)
            max = Math.max(val, max);
        
        if(h == piles.length)
            return max;
        
        int lo = 0;
        int  hi = max;
        int speed = Integer.MAX_VALUE;
        
        while(lo <= hi)
        {
            int sp = lo + (hi - lo) / 2; 
            
            if(isPossible(piles,sp,h) == true)
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
    
    public boolean isPossible(int[] piles, int sp, int h)
    {
        int time = 0;
        
        for(int val : piles)
        {
            time = time + (int)Math.ceil(val*1.0/sp);
        }
        if(time <= h)
            return true;
        else
            return false;
    }
}

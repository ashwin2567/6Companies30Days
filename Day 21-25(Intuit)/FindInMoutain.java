class Solution {
    HashMap<Integer, Integer> map = new HashMap<>();
    MountainArray mountainArr;
    int getMountainVal(int index)
    {
        if(index<0 || index>=mountainArr.length())
            return -1;
        if(!map.containsKey(index))
            map.put(index, mountainArr.get(index));
        return map.get(index);
    }
    
    public int findInMountainArray(int target, MountainArray mountainArr) {
        this.mountainArr = mountainArr;
        int peak = findPeak(0, mountainArr.length()-1);
        int ans =Integer.MAX_VALUE;
        int lo=0;
        int hi=peak;
        while(lo<=hi)
        {
            int mid = lo+(hi-lo)/2;
            if(target == getMountainVal(mid))
            {
                return mid;
            }    
            else if(target > getMountainVal(mid))
                lo = mid+1;
            else
                hi = mid-1;
        }
         lo=peak+1;
         hi=mountainArr.length()-1;
        
        while(lo<=hi)
        {
            int mid = lo+(hi-lo)/2;
            System.out.println(mid);
            if(target == getMountainVal(mid))
            {
                return mid;
            }  
            else if(target < getMountainVal(mid))
                lo = mid+1;
            else
                hi = mid-1;
        }
        return ans != Integer.MAX_VALUE? ans:-1;
    }
    
    int findPeak(int lo, int hi)
    {
        int mid = lo + (hi - lo)/2;
        if(getMountainVal(mid) > getMountainVal(mid-1) && getMountainVal(mid) > getMountainVal(mid+1))
            return mid;
        if(getMountainVal(mid) > getMountainVal(mid-1) && getMountainVal(mid) < getMountainVal(mid+1))
            return findPeak(mid+1, hi);
        if(getMountainVal(mid) < getMountainVal(mid-1) && getMountainVal(mid) > getMountainVal(mid+1))
            return findPeak(lo, mid-1);
        return -1;
    }
}

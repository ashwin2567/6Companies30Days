class Solution
{
    static ArrayList<Long> square(int n, int x)
    {
        
        ArrayList<Long> arr = new ArrayList<>();
        arr.add((long)1);
        
        for(int i=2; (int)Math.pow(i,x)<=n;i++)
        {
            long val =  (long)Math.pow(i,x);
            arr.add(val);
        }
        
        return arr;
    }
    
    
    
    static long backtrack(ArrayList<Long> squares, int index, long currsum, int target,long[][]dp ){
        
        if(currsum==target)
        {
            
            return (long)1;
        }    
        
        if(currsum>target || index>=squares.size())
        {
            return (long)0;
        }
        
        if(dp[(int)currsum][index]!=-1)
        {
            return dp[(int)currsum][index];
        }
        
        long count = 0;
        
        count += backtrack(squares, index+1, currsum + squares.get(index), target,dp);
        count += backtrack(squares, index+1, currsum , target,dp);
        
        dp[(int)currsum][index] =count;
        
        return count%1000000007;
    }
    
    static long numOfWays(int n, int x)
    {
        
        
        ArrayList<Long> squares = square(n,x);
        long[][]dp = new long[n+1][squares.size()];
        
        for(long[]i: dp)
        {
            Arrays.fill(i,-1);
        }
        return backtrack(squares,0, 0,n,dp);
        
    }
}

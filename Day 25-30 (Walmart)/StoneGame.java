class Solution {
    public boolean stoneGame(int[] piles) {        
        int lo = 0;
        int hi = piles.length-1;
        int sum1 = 0;
        int sum2 = 0;
        for(int i=0;i<piles.length;i++)
        {
            if(i%2 == 0)//alice
            {
                if(piles[lo] > piles[hi])
                    sum1 += piles[lo++];
                else
                    sum1 += piles[hi--];
            }
            else
            {
                if(piles[lo] < piles[hi])
                    sum2 += piles[lo++];
                else
                    sum2 += piles[hi--];
            }
        }
        return sum1>sum2? true: false;
    }
}

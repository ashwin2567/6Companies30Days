class Solution {
    
    class Pair
    {
        int speed;
        int efficiency;
        Pair(int speed, int efficiency)
        {
            this.speed = speed;
            this.efficiency = efficiency;
        }
    }
    
    public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
        List<Pair> pq1 = new ArrayList<>();
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>((a,b)->
           {
                return a.speed - b.speed;
           });
        for(int i=0;i<n;i++)
        {
            Pair p = new Pair(speed[i], efficiency[i]);
            pq1.add(p);
        }
        pq1.sort((a,b)-> b.efficiency - a.efficiency);
        long sum=0;
        long res=0;
        for(Pair fast : pq1)
        {
            //Pair fast = pq1.poll();
            if(pq.size() == k)
            {
                Pair slow = pq.poll();
                sum -= slow.speed;
            }
            pq.add(fast);
            sum += fast.speed;
            long max=(sum * (long)fast.efficiency);
            res = Math.max(res, max);
        }
        return (int)(res%1000000007);
    }
}

class Solution {
    
    class Pair
    {
        int speed;
        int effeciency;
        Pair(int speed, int effeciency)
        {
            this.speed = speed;
            this.effeciency = effeciency;
        }
    }
    
    public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
        PriorityQueue<Pair> pq1 = new PriorityQueue<Pair>((a,b)->
           {
                return b.effeciency - a.effeciency;
           });
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>((a,b)->
           {
                return a.speed - b.speed;
           });
        for(int i=0;i<n;i++)
        {
            Pair p = new Pair(speed[i], efficiency[i]);
            pq1.offer(p);
        }
        
        long sum=0;
        long res=0;
        for(int i=0;i<n;i++)
        {
            Pair fast = pq1.poll();
            if(pq.size() == k)
            {
                Pair slow = pq.poll();
                sum -= slow.speed;
            }
            pq.add(fast);
            sum += fast.speed;
            long max=(sum * (long)fast.effeciency);
            res = Math.max(res, max);
        }
        return (int)(res%1000000007);
    }
}

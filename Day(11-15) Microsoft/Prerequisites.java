class Solution {
    public boolean isPossible(int n, int[][] prerequisites)
    {
        int[] edge = new int[n];
        
        Map<Integer, Set<Integer>> map = new HashMap<>();
        for(int i=0;i<n;i++)
            map.put(i, new HashSet<>());
        
        for(int [] pre : prerequisites)
        {
            int course = pre[0];
            int depcourse = pre[1];
            map.get(depcourse).add(course);
            edge[course]++;
        }
        
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<n;i++)
        {
            if(edge[i] == 0)
                q.offer(i);
        }
        
        List<Integer> order = new ArrayList<>();
        while(!q.isEmpty())
        {
            int size = q.size();
            while(size-- > 0)
            {
                int head = q.poll();
                if(edge[head] == 0)
                    order.add(head);
                for(Integer children : map.get(head))
                {
                    edge[children]--;
                    if(edge[children] == 0)
                        q.offer(children);
                }
            }
        }
        if(order.size() != n)
            return false;
        else
            return true;
    }
}

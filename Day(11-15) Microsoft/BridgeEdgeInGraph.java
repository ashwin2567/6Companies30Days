class Solution
{
    static int isBridge(int V, ArrayList<ArrayList<Integer>> adj,int c,int d)
    {
        boolean vis[] = new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        q.offer(c);
        
        vis[c] = true;
        adj.get(c).remove(new Integer(d));
        adj.get(d).remove(new Integer(c));
        while(!q.isEmpty()){
            int it = q.poll();
            for(Integer v: adj.get(it)){
                if(!vis[v]){
                    q.offer(v);
                    vis[v] = true;
                }
            }
        }
        if(vis[d])
            return 0;
        return 1;
    }
}

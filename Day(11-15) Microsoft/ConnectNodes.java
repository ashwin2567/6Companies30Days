class Solution
{
    public void connect(Node root)
    {
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty())
        {
            int size = q.size();
            while(size>0)
            {
                Node temp = q.poll();
                if(size-1 == 0)
                temp.nextRight = null;
                else
                temp.nextRight = q.peek();
                
                
                if(temp.left!=null)q.add(temp.left);
                if(temp.right!=null)q.add(temp.right);
                size--;
            }
        }
    }
}

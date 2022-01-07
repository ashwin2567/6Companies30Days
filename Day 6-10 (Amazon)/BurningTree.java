/*https://practice.geeksforgeeks.org/problems/burning-tree/1/#*/
class Solution
{
    /*class Node {
    	int data;
    	Node left;
    	Node right;
    
    	Node(int data) {
    		this.data = data;
    		left = null;
    		right = null;
    	}
    }*/
    
    public static int minTime(Node root, int start) 
    {
        HashMap<Node, Node> map = new HashMap<>();
        Node target = bfs(root, map, start);
        int max = findMax(map, target);
        return max;
    }
    
    static int findMax(HashMap<Node, Node> map, Node target)
    {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(target);
        HashMap<Node, Integer> visited = new HashMap<>();
        visited.put(target, 1);
        int max = 0;
        
        while(!queue.isEmpty())
        {
            int size = queue.size();
            int flag = 0;
            
            for(int i = 0;i < size;i++)
            {
                Node node = queue.poll();
                if(node.left != null && visited.get(node.left) == null)
                {
                    flag = 1;
                    visited.put(node.left, 1);
                    queue.offer(node.left);
                }
                if(node.right != null && visited.get(node.right) == null)
                {
                    flag = 1;
                    visited.put(node.right, 1);
                    queue.offer(node.right);
                }
                
                if(map.get(node) != null && visited.get(map.get(node)) == null)
                {
                    flag = 1;
                    visited.put(map.get(node), 1);
                    queue.offer(map.get(node));
                }
            }
            if(flag == 1)
                max++;
        }
        return max;
    }
    
    static Node bfs(Node root, HashMap<Node, Node> map, int target)
    {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        Node res = new Node(-1);
        
        while(!queue.isEmpty())
        {
            Node parent = queue.poll();
            if(parent.data == target)
                res = parent;
            if(parent.left != null)
            {
                map.put(parent.left, parent);
                queue.offer(parent.left);
            }
            if(parent.right != null)
            {
                map.put(parent.right, parent);
                queue.offer(parent.right);
            }
        }
        return res;
    }
}

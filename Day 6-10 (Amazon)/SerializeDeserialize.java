/* https://practice.geeksforgeeks.org/problems/serialize-and-deserialize-a-binary-tree/1/ */
class Tree 
{
    //Function to serialize a tree and return a list containing nodes of tree.
	public void serialize(Node root, ArrayList<Integer> list) 
	{
	   Stack<Node> stack = new Stack<>();
	   stack.add(root);
	   while(!stack.isEmpty())
	   {
	       Node temp = stack.pop();
	       if(temp == null)
	       list.add(-1);
	       else
	       {
	           list.add(temp.data);
               stack.push(temp.right);
               stack.push(temp.left);
	       }
	   }
	}
	static int t;
	//Function to deserialize a list and construct the tree.
    public Node deSerialize(ArrayList<Integer> list)
    {
        if(list.size()==0)
            return null;
        t = 0;
        return helper(list);
    }
    
    Node helper(ArrayList<Integer> list)
    {
        if(list.get(t)==-1)
            return null;
        Node root = new Node(list.get(t));
        t++;
        root.left = helper(list);
        t++;
        root.right = helper(list);
        return root;
    }
};

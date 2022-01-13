class Tree
{
    //Function to count number of subtrees having sum equal to given sum.
    static int count=0;
    int countSubtreesWithSumX(Node root, int X)
    {
        //int count=0;
        trav(root, X);
	    return count;
    }
    
    int  trav(Node root, int target)
    {
        if(root == null)
            return 0; 
        int sum = trav(root.left,target) + trav(root.right, target) + root.data;
        if(target ==sum )
        count++;
        //System.out.println(count);
        return sum;
    }
}

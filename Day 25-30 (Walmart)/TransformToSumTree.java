class Solution{
    public void toSumTree(Node root){
         func(root);         
    }
    int func(Node root)
    {
        if(root == null)
        {
            return 0;
        }
        if(root.left == null && root.right == null)
         {
             int temp = root.data;
             root.data = 0;
             return temp;
         }
         int a = root.data;
         root.data = func(root.left) + func(root.right);
         return root.data + a;
    }
}

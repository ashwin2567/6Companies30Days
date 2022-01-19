class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
       ArrayList<Integer> ans=new ArrayList<>();
       int max=arr[n-1];
       ans.add(max);
       for(int i=n-2;i>=0;i--)
       {
           if(max<=arr[i])
           {
               max=arr[i];
               ans.add(max);
           }
       }
       Collections.reverse(ans);
       return ans;
    }
}
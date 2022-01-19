class Solution
{
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        ArrayList<Integer> ans = new ArrayList<>();
        int left =0, right =0;
        int sum = 0;
        while(left<=right && right <=n)
        {
            if(sum<s && right <n)
            {
                sum = sum + arr[right];
            }
            else if(sum == s)
            {
                ans.add(left+1);
                ans.add(right);
                break;
            }
            else if(sum > s)
            {
                sum= sum - arr[left];
                left++;
                right--;
            }
            right++;
        }
        if(ans.size()==0)
        {
            ans.add(-1);
        }
        return ans;
    }
}

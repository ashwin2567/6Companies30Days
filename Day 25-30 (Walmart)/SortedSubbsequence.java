class Solution {
    ArrayList<Integer> find3Numbers(ArrayList<Integer> arr, int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        int small = Integer.MAX_VALUE, large = Integer.MAX_VALUE;
        int i;
        for (i = 0; i < n; i++)
        {
            if (arr.get(i) <= small)
                small = arr.get(i);//smallest numbber
            else if (arr.get(i) <= large)
                large = arr.get(i);//second smallest number
            else
                break;
        }
        if (i == n)
        {
            return ans;
        }
        for (int j = 0; j <= i; j++)
        {
            if (arr.get(j) < large)
            {
                small = arr.get(j);
                break;
            }
        }
        ans.add(small);
        ans.add(large);
        ans.add(arr.get(i));
        return ans;
    }
}

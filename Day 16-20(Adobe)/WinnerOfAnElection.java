class Solution
{
    //Function to return the name of candidate that received maximum votes.
    public static String[] winner(String arr[], int n)
    {
        HashMap<String, Integer> map = new HashMap<>();
        int maxValueInMap = 0;
        String winner = "";
        for(int i=0;i<n;i++)
        {
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
            String key  = arr[i];
            Integer val = map.get(arr[i]);
            if (val > maxValueInMap)
            {
                maxValueInMap = val;
                winner = key;
            }
            else if (val == maxValueInMap && winner.compareTo(key) > 0)
                winner = key;
        }
        String[] ans=new String[2];
        ans[0]=winner;
        ans[1]=Integer.toString(maxValueInMap);
        return ans;
        
    }
}

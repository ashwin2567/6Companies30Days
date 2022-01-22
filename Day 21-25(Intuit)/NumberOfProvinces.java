class Solution {
    public int findCircleNum(int[][] arr) {
        int n = arr.length;
        int count = 0;
        boolean visited[]=new boolean[n];
        for(int i=0;i<n;i++)
        {
            if(!visited[i])
            {
                func(arr, visited, i);
                count++;
            }    
        }
        return count;
    }
    
    public void func(int[][] arr, boolean visited[], int i)
    {
        for(int j=0;j<arr[0].length;j++)
        {
            if(arr[i][j] == 1 && !visited[j])
            {
                visited[j] = true;
                func(arr, visited, j);
            }
        }
    }
}

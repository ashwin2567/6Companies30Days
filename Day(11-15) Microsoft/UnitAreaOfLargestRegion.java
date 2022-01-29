class Solution
{
    int count =0;
    int max=0;
    public int findMaxArea(int[][] grid)
    {
        count=0;
        int n=grid.length;
        int m=grid[0].length;
        boolean visited[][] = new boolean[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j] == 1 && !visited[i][j])
                {
                    func(grid, visited, i, j);
                    count=0;
                }
            }
        }
        return max;
        
    }
    
    void func(int[][] grid, boolean[][] visited, int i, int j)
    {
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j] ==0 ||visited[i][j])
            return;
        visited[i][j] = true;
        count++;
        max=Math.max(count, max);
        func(grid, visited, i+1, j);
        func(grid, visited, i-1, j);
        func(grid, visited, i, j+1);
        func(grid, visited, i, j-1);
        func(grid, visited, i+1, j+1);
        func(grid, visited, i-1, j-1);
        func(grid, visited, i+1, j-1);
        func(grid, visited, i-1, j+1);
        
    }
}

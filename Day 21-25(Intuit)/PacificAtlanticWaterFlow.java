class Solution {
    int dir[][] = {{0,1},{1,0},{0,-1},{-1,0}};
    public  List<List<Integer>> pacificAtlantic(int[][] heights) {
        
        List<List<Integer>> list = new ArrayList<>();
        
        int row = heights.length;
        int col = heights[0].length;
        
        if(heights == null || row == 0 || col == 0)
            return list;
        
        
        boolean[][] pacific = new boolean[row][col];
        boolean[][] atlantic = new boolean[row][col];
        //DFS
        for(int i=0;i<row;i++)
        {
            dfs(heights, i, 0, Integer.MIN_VALUE, pacific);
            dfs(heights, i, col-1, Integer.MIN_VALUE, atlantic);
        }
        for(int i=0;i<col;i++)
        {
            dfs(heights, 0, i, Integer.MIN_VALUE, pacific);
            dfs(heights, row-1, i, Integer.MIN_VALUE, atlantic);
        }
        
        
        
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                if(pacific[i][j] && atlantic[i][j])
                    list.add(Arrays.asList(i,j));
            }
        }
        return list;        
    }
    
     void dfs(int[][] heights, int i, int j, int prev, boolean[][] ocean)
    {
        if(i<0 || i>=ocean.length || j<0 || j>=ocean[0].length)
            return;
        if(heights[i][j] < prev || ocean[i][j])
            return;
        ocean[i][j] = true;
        for(int[] d : dir)
        {
            dfs(heights, i + d[0], j+d[1], heights[i][j], ocean);
        }
    }
}

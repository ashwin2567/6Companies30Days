class Solution {
    public int orangesRotting(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        
        int minTime = 0;
        boolean[][] visited = new boolean[r][c];
        
        for(int i=0; i < r; i++) {
            for(int j=0; j < c; j++) {
                if(grid[i][j] == 1) {
                    int time = getMinTimeForFreshOrange(grid, i, j, r, c, 0, visited);
                    
                    if(time == -1) {
                        return -1;
                    }
                    
                    minTime = Math.max(minTime, time);
                }
            }
        }
        
        return minTime;
    }
    
    public int getMinTimeForFreshOrange(int[][] grid, int i, int j, int r, int c, int dist, boolean[][] visited) {
        if (i < 0 || j < 0 || i >= r || j >= c || grid[i][j] == 0) {
            return -1;
        }
        
        if(visited[i][j]) {
            return -1;
        }
        
        if (grid[i][j] == 2) {
            return dist;
        }
        
        visited[i][j] = true;
        int up = getMinTimeForFreshOrange(grid, i-1, j, r, c, dist + 1, visited);
        int left = getMinTimeForFreshOrange(grid, i, j-1, r, c, dist + 1, visited);
        int down = getMinTimeForFreshOrange(grid, i+1, j, r, c, dist + 1, visited);
        int right = getMinTimeForFreshOrange(grid, i, j+1, r, c, dist + 1, visited);
        
        visited[i][j] = false;
        
        if(up == -1 && left == -1 && down == -1 && right == -1) {
            return -1;
        }
        
        if(up == -1) {
            up = Integer.MAX_VALUE;
        }
        
        if(left == -1) {
            left = Integer.MAX_VALUE;
        }
        
        if(down == -1) {
            down = Integer.MAX_VALUE;
        }
        
        if(right == -1) {
            right = Integer.MAX_VALUE;
        }
        
        return Math.min(up, Math.min(left, Math.min(down, right)));
    }
}

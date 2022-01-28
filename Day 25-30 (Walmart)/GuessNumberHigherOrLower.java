public class Solution {
    public int getMoneyAmount(int n) {
        int[][] table = new int[n+1][n+1];
        return DP(table, 1, n);
    }    
    int DP(int[][] table, int start, int n){
        if(start >= n) 
            return 0;
        if(table[start][n] != 0) 
            return table[start][n];
        int res = Integer.MAX_VALUE;
        for(int i=start; i<=n; i++){
            int tmp = i + Math.max(DP(table, start, i-1), DP(table, i+1, n));
            res = Math.min(res, tmp);
        }
        table[start][n] = res;
        return res;
    }
}

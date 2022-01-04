/*Find total number of Squares in a N*N chessboard*/
class Solution {
    static Long squaresInChessBoard(Long N) {
        Long ans=0L;
       /* while(N>0)
        {
            ans=ans+N*N;
            N--;
        }
        //This commented solution will also work but in a TC of O(N). The other solution works in a TC of O(1).
        */
        ans=N*(N+1)*(2*N+1)/6;
        return ans;
    }
};

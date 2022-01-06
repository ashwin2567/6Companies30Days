/* Given an incomplete Sudoku configuration in terms of a 9x9  2-D square matrix(mat[][]).
The task to check if the current configuration is valid or not where a 0 represents an empty block.
https://practice.geeksforgeeks.org/problems/is-sudoku-valid4820/1/# */
class Solution{
    static int isValid(int mat[][]){
        HashSet set = new HashSet();
        
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(mat[i][j]!=0)
                {
                    if(!set.add("row"+i+mat[i][j]) || !set.add("col"+j+mat[i][j]) || !set.add("box"+(i/3)*3+j/3+mat[i][j]))
                        return 0;
                }
            }
        }
        return 1;
    }
}

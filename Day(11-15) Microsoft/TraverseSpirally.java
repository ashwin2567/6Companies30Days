class Solution
{
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        ArrayList<Integer> list = new ArrayList<>();
        int top = 0, left = 0, down = r - 1, right = c - 1;
        int dir = 0;
        while(top <= down && left <= right)
        {
            if(dir == 0)
            {
                for(int i=left;i<=right;i++)
                {
                    list.add(matrix[top][i]);
                }
                top++;
            }
            else if(dir == 1)
            {
                for(int i=top;i<=down;i++)
                {
                    list.add(matrix[i][right]);
                }
                right--;
            }
            else if(dir == 2)
            {
                for(int i=right;i>=left;i--)
                {
                    list.add(matrix[down][i]);
                }
                down--;
            }
            else if(dir == 3)
            {
                for(int i=down;i>=top;i--)
                {
                    list.add(matrix[i][left]);
                }
                left++;
            }
            dir = (dir+1)%4;
        }
        return list;
    }
}

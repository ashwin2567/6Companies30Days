 /*https://leetcode.com/problems/longest-mountain-in-array/  */
class Solution {
    public int longestMountain(int[] arr) {
        int n = arr.length;
        int ans = 0;
        for(int i = 1; i < n;i++)
        {
            int count = 1;
            int j = i;
            boolean isDecreasing = false;
          
            while(j < n && arr[j] > arr[j-1])
            {
                j++;
                count++;
            }
            
            while(i != j && j < n && arr[j] < arr[j-1])
            {
                j++;
                count++;
                isDecreasing = true;
            }
            
            if(i != j && isDecreasing && count >= 3)
            {
                ans = Math.max(ans, count);
                j--;
            }    
            i = j;
        }
        return ans;
    }
}

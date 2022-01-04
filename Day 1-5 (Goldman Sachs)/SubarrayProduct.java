/*Count the subarrays having product less than k
https://practice.geeksforgeeks.org/problems/count-the-subarrays-having-product-less-than-k1708/1/#
*/
class Solution {    
    public int countSubArrayProductLessThanK(long nums[], long n, long k)
    {
        long prod = 1;
        int count = 0;
        int left = 0;
        int right = 0;
        
        while( right < n)
        {
            prod = prod * nums[right];
            
            while( prod >= k)
            {
                prod = prod / nums[left];
                left++;
            }
            
            count += right - left + 1;
            
            right++;
        }
        return count;
    }
}

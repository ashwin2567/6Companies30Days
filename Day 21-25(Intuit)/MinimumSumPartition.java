class Solution
{
    static int min = Integer.MAX_VALUE;
	public int minDifference(int arr[], int n) 
	{ 
	    min = Integer.MAX_VALUE;
	   func(arr, 0, 0, 0);
	   return min;
	} 
	
	static void func(int arr[], int index, int sum1, int sum2)
	{
	    if(index == arr.length)
	    {
	        int diff = Math.abs(sum1 - sum2);
	        min = Math.min(min, diff);
	        return;
	    }
	    
	    func(arr, index + 1, sum1 + arr[index], sum2);
	    func(arr, index + 1, sum1, sum2 + arr[index]);
	}
}

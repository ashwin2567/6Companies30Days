/*
Given an unsorted array Arr of size N of positive integers. One number 
         'A' from     set {1, 2, …N} is missing and one number 'B' 
        occurs twice in array. Find these two numbers.
https://practice.geeksforgeeks.org/problems/find-missing-and-repeating2512/1/
*/
class Solve {
    int[] findTwoElement(int arr[], int n) {
        int i=0;
        int ans[]=new int[2];
        while(i<arr.length)
        {
            while(arr[i] != i+1)
            {
                
                int temp = arr[i];
                if(arr[i]==arr[temp-1])
                {
                    ans[0]=arr[i];
                    ans[1]=i+1;
                    break;
                }    
                else
                {
                    arr[i]=arr[temp-1];
                    arr[temp-1]=temp;
                }
            }
            i++;
        }
        
        return ans;
    }
}

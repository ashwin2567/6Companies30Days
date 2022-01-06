/* Given an array arr[] of size N and an integer K. Find the maximum for each and every contiguous subarray of size K.
https://practice.geeksforgeeks.org/problems/maximum-of-all-subarrays-of-size-k3101/1# */
class Solution
{
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        ArrayList<Integer> answer = new ArrayList<>();
        Deque<Integer> dq = new ArrayDeque<>();
        int i=0;
        int j=0;
        while(j<n)
        {
            while(!dq.isEmpty() && dq.peekLast()<arr[j])
                dq.pollLast();
            dq.offer(arr[j]);
            if(j - i + 1 < k)
                j++;
            else if(j - i + 1 == k)
            {
                answer.add(dq.peek());
                if(dq.peek() == arr[i])
                    dq.poll();
                i++;
                j++;
            }
        }
        return answer;
    }
}

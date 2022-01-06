class Solution {
    static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        Deque<Integer> dq = new ArrayDeque<>();
        int i = 0;
        int j = 0;
        while(j < n)
        {
            while(!dq.isEmpty() && dq.peekLast() < arr[j])
                dq.pollLast();
            dq.offer(arr[j]);
            
            if(j - i + 1 < k)
            {
                j++;
            }
            else if(j -i + 1 == k)
            {
                ans.add(dq.peek());
                if(arr[i] == dq.peek())
                    dq.poll();
                i++;
                j++;
            }
        }
        return ans;
    }
}

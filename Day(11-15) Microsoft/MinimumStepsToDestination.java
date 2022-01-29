class Solution{
    static int minSteps(int N){
        int steps=0;
        int sum=0;
        N=Math.abs(N);
        while(sum<N || (sum-N)%2!=0) {
            steps++;
            sum+=steps;
        }
        return steps;
    }
}

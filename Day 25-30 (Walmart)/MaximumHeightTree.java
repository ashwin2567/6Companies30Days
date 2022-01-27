class Solution{
    static int height(int N){
        int a = 1;
        int b = 1;
        int c = -2 * N;
        int d = 1 - (4 * a * c);
        float root = ( -b +  (float)Math.sqrt(d)) / (2 * a);
        return (int)Math.floor(root);
    }
}

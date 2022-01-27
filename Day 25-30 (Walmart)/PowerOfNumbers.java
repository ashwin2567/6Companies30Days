class Solution
{        
    long power(int a,int b)
    {
        long x=1, y=a; 
        long m=1000000007;
        while (b > 0) 
        {
            if (b%2 == 1) 
            {
                x = (x * y) % m; 
            }
        y = (y * y) % m;
        b /= 2;
    }
    return x % m;        
    }
}

class Solution
{
    String colName (long n)
    {
        String ans="";
        
        while(n>0)
        {
            int val = (int)((n-1) % 26);
            char ch = (char)(val + 65); //ASCII VALUE of A
            ans = ch + ans;
            n = (n-1) / 26;
        }
        return ans;
    }
}

/*
https://practice.geeksforgeeks.org/problems/total-decoding-messages1235/1/#
*/
class Solution
{
    public int CountWays(String s)
    {
        if(s.length() == 0 || s.charAt(0) == '0')
            return 0;
        if(s.length() == 1)
            return 1;
        long M = 1000000007;
        long count1 = 1;
        long count2= 1;
        for(int i= 1; i< s.length();i++)
        {
            int d = s.charAt(i) - '0';
            int dd = (s.charAt(i-1) - '0') * 10 + d;
            long count = 0;
            if(d > 0)
                count = count%M + count2%M;
            if(dd >= 10 && dd <=26)
                count = count%M + count1%M;
            count1 = count2%M;
            count2 = count%M;
        }
        long ans = count2%M;
        return (int)ans;
    }
}


class Solution {    
    static String max = "";    
    public static String findMaximumNum(String str, int k) {
        if (str.length() == 1)
        {
            return str;
        }        
        int i = 0;
        for (; i+1<str.length(); i++)
        {
            int a = (int)(str.charAt(i) - '0');
            int b = (int)(str.charAt(i+1) - '0');
            if (a < b)
            {
                break;
            }
        }
        if (i+1 == str.length())
        {
            return str;
        }        
        max = "";
        helper(str.toCharArray(), k);
        return max;
    }
    
    public static void helper(char ar[], int k)
    {        
        if (k == 0)
        {
            return;
        }
        int n = ar.length;
        for (int i=0; i<n-1; i++)
        {
            for (int j=i+1; j<n; j++)
            {
                if (ar[j] > ar[i])
                {
                    char temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;
 
                    String st = new String(ar);
                    if (max.compareTo(st) < 0)
                    {
                        max = st;
                    }
                    helper(ar, k-1);
                    temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;
                }
            }
        }
    }
}

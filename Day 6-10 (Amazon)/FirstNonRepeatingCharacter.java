class Solution
{
    public String FirstNonRepeating(String str)
    {
         int t=0;
        char ch = str.charAt(t++);
        String ans = ""+ch;
        int arr[] = new int[26];
        arr[ch-'a']++;
        
        
        for(int i = 1;i<str.length();i++)
        {
            char a = str.charAt(i);
            arr[a-'a']++;
            if(arr[ch-'a'] == 1)
                ans += ch;
            else
            {
                while(t <= i && arr[ch-'a'] != 1)
                    ch = str.charAt(t++);
                if(arr[ch-'a'] != 1)
                {
                    ans=ans+'#';
                    t--;
                }
                else
                    ans=ans+ch;
                
            }
        }
        return ans;
    }
}

class Solution
{
    //Function to find list of all words possible by pressing given numbers.
    static ArrayList <String> possibleWords(int a[], int N)
    {
        ArrayList<String> ans = new ArrayList<>();
        HashMap<Integer, String> map = new HashMap<>();
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");
        func(a, map, ans);
        return ans;
    }
    
    static void func(int arr[], HashMap<Integer, String> map, ArrayList<String> ans)
    {
        String str = map.get(arr[0]);
        int n=0;
        while(n<str.length())
        {
            ans.add(str.substring(n,n+1));
            n++;
        }
        for(int i=1;i<arr.length;i++)
        {
            ArrayList<String> temp = new ArrayList<>();
            int t=ans.size();
            int counter=0;
            while(counter < t)
            {
                temp.add(ans.get(0));
                ans.remove(0);
                counter++;
            }
            //int size=ans.size();
            String st = map.get(arr[i]);
            int m=0;
            
            
            for(int j=0;j<t;j++)
            { 
                m=0;
                while(m<st.length())
                {
               
                    String s=temp.get(j) +""+ st.substring(m,m+1);
                    ans.add(s);
                   m++;
                }
                
            }
        }
    }
}



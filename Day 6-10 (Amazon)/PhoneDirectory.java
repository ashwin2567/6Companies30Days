class Solution{
    static ArrayList<ArrayList<String>> displayContacts(int n, String contact[], String s)
    {
        Arrays.sort(contact);
        ArrayList<ArrayList<String>> list = new ArrayList<>();
        
        for(int i=0;i<s.length();i++)
        {
            String str=s.substring(0,i+1);
            ArrayList<String> ans = new ArrayList<>();
            for(int j=0;j<contact.length;j++)
            {
                String temp=contact[j];
                if(str.length() > temp.length())
                    continue;
                if(str.compareTo(temp.substring(0,i+1)) == 0)
                    ans.add(temp);
            }
            if(ans.size()==0)
            {
                ans.add("0");
            }
            list.add(ans);
        }
        return list;
    }
}

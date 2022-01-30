class Solution
{
    public static String findOrder(String [] dict, int n, int K)
    {
        HashMap<Character, Set<Character>> list = new HashMap<>();
        for(int i = 0;i<n-1;i++)
        {
            String w1 = dict[i];
            String w2 = dict[i+1];
            for(int j=0;j < Math.min(w1.length(),w2.length()); j++)
            {
                if(w1.charAt(j) != w2.charAt(j))
                {
                    Set<Character> set = list.getOrDefault(w1.charAt(j), new HashSet<Character>());
                    set.add(w2.charAt(j));
                    list.put(w1.charAt(j), set);
                    break;
                }
            }
        }
        boolean visited[]=new boolean[26];
        
        for (Map.Entry<Character, Set<Character>> entry : list.entrySet()) 
        {
            func(entry.getKey(), entry.getValue(), list, visited);          
        }
        String ans="";
        while(!stack.isEmpty())
        {
            ans=ans+stack.pop();   
        }
        return dict[0].charAt(0)+ans;
    }
    static Stack<Character> stack = new Stack<Character>();
    static void func(Character key, Set<Character> value, HashMap<Character, Set<Character>> list, boolean[] visited)
    {
        for(Character ch : value)
        {
            
            if(list.containsKey(ch))
            {
                func(ch, list.get(ch), list, visited);
            }
            if(visited[ch-'a'])
                return;
            stack.push(ch);
            
            visited[ch-'a']=true;
        }
    }
}

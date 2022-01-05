/* Given a pattern containing only I's and D's. I for increasing and D 
         for decreasing.Devise an algorithm to print the minimum number following
        that pattern.
        https://practice.geeksforgeeks.org/problems/number-following-a-pattern3126/1   */
class Solution{
    static String printMinNumberForPattern(String s){
        String ans="";
        int counter=1;
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='I')
            {
                stack.push(counter++);
                while(!stack.isEmpty())
                    ans=ans+(char)(stack.pop()+'0');
            }
            else if(s.charAt(i)=='D')
            {
                stack.push(counter++);
            }
        }
        stack.push(counter++);
        while(!stack.isEmpty())
                ans=ans+(char)(stack.pop()+'0');
        return ans;
    }
}



/*Given an array of strings, return all groups of strings that are anagrams.
The groups must be created in order of their appearance in the original array. 
https://practice.geeksforgeeks.org/problems/print-anagrams-together/1
*/

class Solution {
    public List<List<String>> Anagrams(String[] string_list) {
        HashMap<HashMap<Character, Integer>, List<String>> map=new HashMap<>();
        for(String str: string_list)
        {
            HashMap<Character, Integer> temp=new HashMap<>();
            for(int i=0;i<str.length();i++)
            {
                char ch=str.charAt(i);
                temp.put(ch, temp.getOrDefault(ch, 0)+1);
            }
            if(!map.containsKey(temp))
            {
                List<String> list=new ArrayList<>();
                list.add(str);
                map.put(temp, list);
            }
            else
            {
                List<String> list = map.get(temp);
                list.add(str);
            }
        }
        List<List<String>> answer=new ArrayList<>();
        for(List<String>  val:map.values())
        {
            answer.add(val);
        }
        return answer;
    }
}



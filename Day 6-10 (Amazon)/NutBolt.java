 /*https://practice.geeksforgeeks.org/problems/nuts-and-bolts-problem0431/1#
 Have written 2 diffrent solutions for this question, with and without hash */

class Solution {
    void matchPairs(char nuts[], char bolts[], int n) {
        String str="!#$%&*@^~";
        int index=0;
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(nuts[j] == str.charAt(i))
                {
                    char ch = nuts[index];
                    nuts[index] = nuts[j];
                    nuts[j] = ch;
                    
                    bolts[index] = nuts[index];
                    index++;
                    
                    if(index >= n)
                        break;
                }
            }
        }
    }
}

/*Solution 2*/
class Solution {
    void matchPairs(char nuts[], char bolts[], int n) {
    HashMap<Character, Integer> hash = new HashMap<>();
    String str="!#$%&*@^~";
    for (int i = 0; i < n; i++)
        hash.put(nuts[i], i);
    int p=0;
    for (int i = 0; i < 9; i++)
    {  
        if (hash.containsKey(str.charAt(i)))
        {
            nuts[p] = str.charAt(i);
            bolts[p++] = str.charAt(i);
        }
    }
    }
}

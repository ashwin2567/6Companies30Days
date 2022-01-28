class Solution {
    public boolean winnerOfGame(String colors) {
        
    if(colors.length() <=2)
    {
        return false; 
    }
    
    int[] triple = triplets(colors);
    return triple[0] > triple[1] ? true : false;
}


public int[] triplets(String colors)
{
    int tripleA = 0, tripleB = 0;
    
    for(int i = 1; i<colors.length()-1; i++)
    {
        if(colors.charAt(i-1) == 'A' && colors.charAt(i) == 'A' && colors.charAt(i+1) == 'A')
        {
            tripleA++;    
        }
        else if(colors.charAt(i-1) == 'B' && colors.charAt(i) == 'B' && colors.charAt(i+1) == 'B')
        {
            tripleB++;
        }
    }
    return new int[] {tripleA, tripleB};  
}
}

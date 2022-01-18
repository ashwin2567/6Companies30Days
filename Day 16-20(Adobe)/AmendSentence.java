class Solution{
    public String amendSentence(String str){
         String ans="";
         
         for(int i=0;i<str.length();i++)
         {
             if(str.charAt(i) >='A' && str.charAt(i)<='Z')
             {
                 char ch=(char)(str.charAt(i)+ 32);
                 if(i!=0)
                 ans=ans+" "+ch;
                 else
                 ans=ans+ch;
             }
             else
             {
                 ans=ans+str.charAt(i);
             }
         }
         return ans;
    }
}

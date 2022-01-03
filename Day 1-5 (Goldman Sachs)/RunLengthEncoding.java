/*
https://practice.geeksforgeeks.org/problems/run-length-encoding/1/
Run Length Encoding 
Given a string, Your task is to  complete the function encode that returns the run length 
encoded string for the given string.
Example: if the input string is “wwwwaaadexxxxxx”, then the function should return “w4a3d1e1x6″.
You are required to complete the function encode that takes only one argument the string which is to be encoded and returns the encoded string.
Input:
str = aaaabbbccc
Output: a4b3c3
*/

class GfG
 {
	String encode(String str)
	{
         int n=str.length();
         int count=0;
         String ans="";
         for(int i=0;i<n;i++)
         {
             while(++i<n && str.charAt(i-1)==str.charAt(i))
             {
                 count++;
             }
             ans=ans+str.charAt(i-1)+""+(count+1);
             count=0;
             i--;
         }
         return ans;
	}
	
 }

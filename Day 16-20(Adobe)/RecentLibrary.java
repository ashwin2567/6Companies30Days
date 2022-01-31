import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        System.out.println(mostRecent("10.1.1.1.4","10.5.1"));
     }
     
     static  String mostRecent(String s1, String s2)
     {
         int t = 0;
         String ans="";
         if(s1.length()==0) return s2;
         if(s2.length()==0) return s1;  
         List<String> list1=new ArrayList<>();
         List<String> list2=new ArrayList<>();
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)=='.')
            {
                list1.add(s1.substring(t,i));
                t=i+1;
            }
        }
        t=0;
        for(int i=0;i<s2.length();i++)
        {
            if(s2.charAt(i)=='.')
            {
                list2.add(s2.substring(t,i));
                t=i+1;
            }
        }
        for(int i=0;i<Math.min(list1.size(),list2.size());i++)
        {
            if(list1.get(i).compareTo(list2.get(i)) > 0)
            {
                ans=s1;
                break;
            }
            else if(list1.get(i).compareTo(list2.get(i)) < 0)
            {
                ans=s2;
                break;
            }
                
        }
        return ans;
     }
}

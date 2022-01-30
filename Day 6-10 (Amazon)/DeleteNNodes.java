class Solution
{
   static void linkdelete(Node head, int M, int N)
   {
       Node curr = head;
       int count =0;
       while(curr!=null && curr.next!=null )
       {
           count++;
           int x = N;
           if(count==M)
           {
               while(x>0)
               {
                   curr.next = curr.next.next;
                   if(curr.next==null)
                   {
                   return;
                   }
                   count=0;
                   x--;
                }
                x=N;
            }
            curr = curr.next;
        }
    }
}

/*
Find max 10 numbers in a list having 10M entries.
*/
/* This code will work with a million entries with a time complexity of O(n log k) which is bascially O(n log 10) */
import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        int arr[]={45,3,43,90, 67,38333 , 482, 991, 2424, 334, 3452, 589, 12, 15, 87, 27,36, 89, 65, 96, 12, 84, 23, 40, 60, 50, 64};
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int k=10;//here k=10, top 10 numbers
        for(int i=0;i<arr.length;i++)
        {
            pq.add(arr[i]);
            if(pq.size()>k)
            {
                pq.poll();
            }
        }
        for(int i=0;i<10;i++)
        {
            System.out.println(pq.poll());
        }
     }
}

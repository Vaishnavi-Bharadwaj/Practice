//cocbues Q2
/*
Given an array arr[] of integers, find out the difference between any two elements such that larger element appears after the smaller number in arr[].

Examples: If array is [2, 3, 10, 6, 4, 8, 1] then returned value should be 8 (Diff between 10 and 2). If array is [ 7, 9, 5, 6, 3, 2 ] then returned value should be 2 (Diff between 7 and 9)

Time Complexity: O(n^2)
Auxiliary Space: O(1)
 */
import java.util.*;
public class Maxdiff {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println(diff(a));
    }
    public static int diff(int[] arr)
    {
        ArrayList<Integer> list=new ArrayList<>();
        int maxdiff=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]<arr[j])
                {
                    maxdiff=arr[j]-arr[i];
                    list.add(maxdiff);
                }
                    
            }
        }
        Collections.sort(list);
        return list.get(list.size()-1);
    }
}

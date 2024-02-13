//cocubes Q9
/*
Write a function which returns the sum of elements whose frequency in the array is odd. Means find sum of elements whose Number of occurrences is odd  

Example:

Input:
15
arr=[1,1,2,2,2,3,4,4,5,5,5,5,6,7,7]

Output:
11

Explanation:
count of each element is as follows-
1–>2, 2–>3, 3–>1, 4–>2, 5–>4, 6–>1, 7–>2
Odd number of time occured elements are, 2,3,6 and its sum if 11
 */
import java.util.*;
public class OddOccurrences {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int result=getsumofkey(a);
        System.out.println(result);
    }
    public static int getsumofkey(int[] a)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<a.length;i++)
        {
            map.put(a[i],0);
        }
        for(int i=0;i<a.length;i++)
        {
            if(map.containsKey(a[i]))
            {
                int count=map.get(a[i]);
                count++;
                map.put(a[i],count);
            }
        }
        int sum=0;
        for(Map.Entry<Integer,Integer> i:map.entrySet()) //to get keys as well as values, entrySet is used which has 2 components to access keys and values: getKey() and getValue()
        {
           if(i.getValue()%2!=0) //checking if the value is odd
           {
                sum+=i.getKey(); //adding the corresponding key 
           }
        }
        return sum;
    }
}

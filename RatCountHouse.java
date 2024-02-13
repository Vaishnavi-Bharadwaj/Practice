//Accenture prev year coding round
/*Problem Description :
The function accepts two positive integers ‘r’ and ‘unit’ and a positive integer array ‘arr’ of size ‘n’ as its argument ‘r’ represents the number of rats present in an area, ‘unit’ is the amount of food each rat consumes and each ith element of array ‘arr’ represents the amount of food present in ‘i+1’ house number, where 0 <= i

Note:
Return -1 if the array is null
Return 0 if the total amount of food from all houses is not sufficient for all the rats.
Computed values lie within the integer range.
Example:

Input:
r: 7                                              Output: 
unit: 2                                             4
n: 8
arr: 2 8 3 5 7 4 1 2

Explanation:
Total amount of food required for all rats = r * unit= 7 * 2 = 14.

The amount of food in 1st houses = 2+8+3+5 = 18. Since, amount of food in 1st 4 houses is sufficient for all the rats. Thus, output is 4. */
import java.util.*;
public class RatCountHouse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int unit=sc.nextInt();
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int result=ratcount(r, unit, n, a);
        System.out.println(result);
    }
    public static int ratcount(int r,int unit,int n,int arr[])
    {
        int totalFood=r*unit;
        int sum=0;
        int count=0;
        if(arr.length==0)
            return -1;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            count++;
            if(sum>=totalFood)
                return count;
        }
        return 0;
    }
}

//Accenture prev year coding round
/*(Asked in Accenture OnCampus 11 Aug 2022, Slot 1)

You are given a function,
int findCount(int arr[], int length, int num, int diff);

The function accepts an integer array ‘arr’, its length and two integer variables ‘num’ and ‘diff’. Implement this function to find and return the number of elements of ‘arr’ having an absolute difference of less than or equal to ‘diff’ with ‘num’.
Note: In case there is no element in ‘arr’ whose absolute difference with ‘num’ is less than or equal to ‘diff’, return -1.

Example:
Input:

arr: 12 3 14 56 77 13
num: 13
diff: 2
Output:
3

Explanation:
Elements of ‘arr’ having absolute difference of less than or equal to ‘diff’ i.e. 2 with ‘num’ i.e. 13 are 12, 13 and 14 */
import java.util.*;
public class FindCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int a[]=new int[length];
        for(int i=0;i<length;i++)
        {
            a[i]=sc.nextInt();
        }
        int number=sc.nextInt();
        int diff=sc.nextInt();
        int result=findCount(a, length, number, diff);
        System.out.println(result);
    }
    public static int findCount(int arr[], int length, int num, int diff)
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(Math.abs(num-arr[i])<=diff)
            {
                count++;
            }
        }
        return count;
    }
}

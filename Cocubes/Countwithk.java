//cocubes Q14
/*Find the count of numbers in the array which has K digits in it.

Note: size of array and the value of K is always greater than zero.

Example:

Input:
arr=[10,22,3,4,1,6,7,8,5,33,4,99,100]
k=2

Output:
4

Explanation:
2 digit numbers are 10,22,33,99 */
import java.util.*;
public class Countwithk {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int count=0;
        for(int i=0;i<a.length;i++)
        {
            if(Integer.toString(a[i]).length()==k)
                count++;
        }
        System.out.println(count);
    }
}

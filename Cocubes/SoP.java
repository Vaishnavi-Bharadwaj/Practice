//cocubes Q15
/*Find SoP (sum of product). You were given with a integer n and you have to find sum of all products of i*j where 

i ranges from 1 to n, including both ranges
j is n/i  for every i
Find i*j for every iteration and sum them up to the final output

Example:

Input:
n=4

Output:
15

Explanation: 
i=1 , j=4/1=4 , i*j=4
i=2 , j=4/2=2, i*j=4
i=3,  j=4/3=1,  i*j=3
i=4,  j=4/4=1,  i*j=4

Output:
4+4+3+4=15 */
import java.util.*;
public class SoP {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int result=0;
        for(int i=1;i<=n;i++)
        {
            int j=n/i;
            int product=i*j;
            result+=product;
        }
        System.out.println(result);
    }
}

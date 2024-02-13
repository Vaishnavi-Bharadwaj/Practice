//cocubes Q8
/*Write a function which returns an integer based on some conditions. You were given with two integers as input say n and m

if n>m return (n*m)-(n-m)
if n<=m return (m%n)-(m+n)
Example:

Sample input:
n=10
m=18

Sample output:
-20

Explanation:
m%n=18%10=8 
m+n=28 
answer= 8-28=-20 */
import java.util.*;
public class Cocubes8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int result=compute(m,n);
        System.out.println(result);
    }
    public static int compute(int m,int n)
    {
        int value=0;
        if(n>m)
        {
            value=(n*m)-(n-m);
        }
        else if(n<=m)
        {
            value=(m%n)-(m+n);
        }
        return value;
    }
}

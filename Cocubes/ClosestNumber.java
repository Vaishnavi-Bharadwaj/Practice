//cocbues Q4
/*Given two integers n and m. The problem is to find the number closest to n and divisible by m. 
If there are more than one such number, then output the one having maximum absolute value. 
If n is completely divisible by m, then output n only. Time complexity of O(1) is required.

Constraints: m != 0

We find value of n/m. Let this value be q. Then we find closest of two possibilities. 
One is q * m other is (m * (q + 1)) or (m * (q – 1)) depending on whether one of the given two numbers is negative 
or not.

Algorithm:

closestNumber(n, m)
    Declare q, n1, n2
    q = n / m
    n1 = m * q

    if (n * m) > 0
        n2 = m * (q + 1)
    else
        n2 = m * (q - 1)

    if abs(n-n1) < abs(n-n2)
        return n1
    return n2 */
import java.util.*;

public class ClosestNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int res=closest(m,n);
        System.out.println(res);
    }

    public static int closest(int m,int n)
    {
        int q=n/m;
        int n1 = m * q;
        int n2=0;

        if((n * m) > 0) 
            n2 = m * (q + 1);
        else
            n2 = m * (q - 1);

        if(Math.abs(n-n1) < Math.abs(n-n2))
            return n1;
        return n2;
    }
}

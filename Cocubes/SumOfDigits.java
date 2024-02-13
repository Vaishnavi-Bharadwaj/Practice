//cocubes Q11
/*find the sum of the digits in a number until its sum is equal to single digit. Consider the below example for better understand

#testcase1:

Input:
123

Output:
6

Explanation:
1+2+3=6

#testcase2:

Input:
8448440710

Output:
4

Explanation:
=8+4+4+8+4+4+0+7+1+0
=40 =4+0
4 */
import java.util.*;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n = sc.nextLong();
        if(n%9==0)
            System.out.println(9);
        System.out.println(n%9);
    }
    
}

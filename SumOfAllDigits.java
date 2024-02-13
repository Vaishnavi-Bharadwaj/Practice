//codecraft
import java.util.*;
public class SumOfAllDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println("The sum of all the digits is "+findSum(n));
    }
    public static int findSum(int num)
    {
        int temp=num;
        int r,sum=0;
        int s=0;
        while(num!=0)
        {
            r=num%10;
            sum=(sum*10)+r;
            s+=sum;
            num=num/10;
        }
        return s%10;
    }
}

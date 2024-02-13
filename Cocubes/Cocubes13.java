//cocubes Q13
/*Return the count of numbers whose unit digit is end with the integer ‘k’ which is one of the input given to the function.

You were given with three inputs starting range , ending  range and the integer k.

Example:

Input: 
start=10
end=54
k=2

Output:
5

Explanation:
numbers with unit digit as 2 in the given range is 12,22,32,42,52 */
import java.util.*;
public class Cocubes13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int start=sc.nextInt();
        int end=sc.nextInt();
        int k=sc.nextInt();
        int count=0;
        for(int i=start;i<=end;i++)
        {
            if(i%10==k)
                count++;
        }
        System.out.println(count);
    }
}

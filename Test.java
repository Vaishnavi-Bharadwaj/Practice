import java.util.*;
public class Test {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num=1;
        int n=s.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if (i%2==1) 
                    System.out.print(num + " ");
                else 
                    System.out.print((num + i - j) + " ");
                num++;
            }
            System.out.println();
        }
    }
}

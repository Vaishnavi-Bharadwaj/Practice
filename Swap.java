//novigo interview question
//Swapping two numbers without using a temporary variable
import java.util.*;
public class Swap {
    public static void main(String[] args) {
        System.out.println("Enter two numbers");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println("Before Swapping:"+x+" "+y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.print("After Swapping:"+x+" "+y);
    }
}

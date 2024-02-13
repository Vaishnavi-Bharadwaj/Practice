//7EDGE
import java.util.*;
public class IncrementToNext {
    public static String nextChar(String str)
    {
        char[] ch=str.toCharArray();
        String s="";
        for(char i:ch)
        {
            if(Character.isLetter(i))
            {
                s+=(char)(i+1);
            }
        }
        return s;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        System.out.println(nextChar(a));
    }
}

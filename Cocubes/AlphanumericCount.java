//cocubes Q10
/*Write a function to return the count of  alphanumeric characters in a given string.
(Count number of alphabets and numerics in a string)

Example :

Input:
Hello World!123

Output:
13 */

import java.util.*;
import java.util.regex.*;
public class AlphanumericCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solve(str));
    }

    public static int solve(String str)
    {
        int count= 0;
        char[] str1 = str.toCharArray();
        for (int i = 0;i< str1.length; i++) 
        {
            if ((str1[i] >= 'A' && str1[i] <= 'Z')|| (str1[i] >= 'a' && str1[i] <= 'z') )
                count++;
            if(str1[i] >= '0' && str1[i] <= '9')
                count++;
        }
    
        return count;
    }
}

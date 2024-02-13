//cocubes Q5
/*Given a string consisting of only 0, 1, A, B, C where
A = AND
B = OR
C = XOR
Calculate the value of the string assuming no order of precedence and evaluation is done from left to right.

Constraints – The length of string will be odd. It will always be a valid string.
Example, 1AA0 will not be given as an input.

Examples:

Input: 1A0B1
Output : 1
1 AND 0 OR 1 = 1

Input : 1C1B1B0A0
Output : 0 */

import java.util.*;
public class AndOrXor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int res=0;
        for(int i=0;i<str.length()-1;i++)
        {
            if(str.charAt(i)=='A')
            {
                res=Character.getNumericValue(str.charAt(i-1)) & Character.getNumericValue(str.charAt(i+1));
            }
            else if(str.charAt(i)=='B')
            {
                res=Character.getNumericValue(str.charAt(i-1)) | Character.getNumericValue(str.charAt(i+1));
            }
            else if(str.charAt(i)=='C')
            {
                res=Character.getNumericValue(str.charAt(i-1)) ^ Character.getNumericValue(str.charAt(i+1));
            }
        }
        System.out.print(res);
    }
    
}

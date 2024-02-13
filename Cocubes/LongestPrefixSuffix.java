//cocubes Q3
/*
Given a string of character, find the length of longest proper prefix which is also a proper suffix.
Example:
S = abab
lps is 2 because, ab.. is prefix and ..ab is also a suffix.

Input:
First line is T number of test cases. 1<=T<=100.
Each test case has one line denoting the string of length less than 100000.

Expected time compexity is O(N).

Output:
Print length of longest proper prefix which is also a proper suffix.

Example:

Input:
2
abab
aaaa

Output:
2
2
 */
import java.util.*;
public class LongestPrefixSuffix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int length=lps(str);
        System.out.println(length);
        
    }
    public static int lps(String s)
    {
        int n=s.length();
        int j=0;
        int l=2;
        int i=1;
        while(i<n)
        {
            if(s.charAt(i)==s.charAt(j))
            {
                i++;
                j++;
                continue;
            }
            i=l;
            l++;
            j=0;
        }
        return j;
    }

}

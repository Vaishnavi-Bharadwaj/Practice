//SAP prev year questions
/*You’re given a string where multiple characters are repeated consecutively. You’re supposed to reduce the size of this string using mathematical logic given as in the example below :

Input :
aabbbbeeeeffggg

Output:
a2b4e4f2g3 */

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String res = "";
        
        int count = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {  
                count++;  
            } 
            else
            {
                res += str.charAt(i) + Integer.toString(count);
                count = 1; // Reset the count for the next character
            }   
        }
        
        // Add the last character and its count
        res += str.charAt(str.length()-1) + Integer.toString(count);
        res=res.replace(String.valueOf('1'), "");
        System.out.println(res);
    }

    
}

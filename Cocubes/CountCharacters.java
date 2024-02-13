//cocubes Q6
/*
Make a function which accepts a string as an argument that may contain repetitive characters. Implement the function to modify and return the input string, such that each character once, along with the count of consecutive occurrence. Do not append count if the character occurs only once.

Note – 

The string will only contain lowercase English Alphabets
If you have to manipulate the input string in place you cant use another string
Assumption – 
No character will occur consecutively more than 9 times.

Example – 

Input 
aaaaabbbccccccccdaa

Output
a4b3c8da2
 */
import java.util.*;
public class CountCharacters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int count=1;
        String res="";
        for(int i=0;i<str.length()-1;i++)
        {
            if(str.charAt(i)==str.charAt(i+1))
            {
                count++;
            }
            else
            {
                res+=str.charAt(i)+Integer.toString(count);
                count=1;
            }
                
        }
        res+=str.charAt(str.length()-1)+Integer.toString(count);
        res=res.replace(String.valueOf('1'), "");
        System.out.println(res);
    }
    
}

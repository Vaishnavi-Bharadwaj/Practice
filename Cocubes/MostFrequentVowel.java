//cocubes Q12
/*In English alphabet a,e,i,o,u are called as vowels. Write a function to return the most frequent vowel used in the given input string.

Note: All characters are lower case English alphabets

Example:

Input:
abeabutiedcia

Output:
a

Explanation:
a occured 3 times */
import java.util.*;
public class MostFrequentVowel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int[] count={0,0,0,0,0}; //to store the count of the vowels
        String str="aeiou";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a')
                count[0]++;
            else if(s.charAt(i)=='e')
                count[1]++;
            else if(s.charAt(i)=='i')
                count[2]++;
            else if(s.charAt(i)=='o')
                count[3]++;
            else if(s.charAt(i)=='u')
                count[4]++;
        }
        int largest=0; //checking using index value
        for(int i=1;i<count.length;i++)
        {
            if(count[i]>count[largest])
                largest=i;
        }
        System.out.println(str.charAt(largest)); 
        
    }
}

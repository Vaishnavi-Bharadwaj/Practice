//SAP prev year questions
/*Write a program to find the nth largest and nth smallest item in the array and print them in the same line.

Input Format
The first line has the following –
Size of array, value of n
2nd line has the array

Output Format
Nth largest and nth smallest respectively

Input :                                 Output :
6 3                                       3 4
1 2 3 4 5 6 */

import java.util.*;
public class KthLargestSmallest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int arr[]=new int[m];
        for(int i=0;i<m;i++)
            arr[i]=sc.nextInt();
        Arrays.sort(arr);
        System.out.print(arr[n-1]+" "+arr[m-n]);
    }
}

//Accenture prev year coding round
//take n as input size and insert the elements into the array
//Divide the array into 2 sub arrays with the elements in at the odd indices in one array and the elements in at the even indices in another array
//find the second largest elements of the two sub arrays and find their sum and print the sum. 
import java.util.*;
public class SumOfEvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int mainMat[]=new int[n];
        for(int i=0;i<n;i++)
        {
            mainMat[i]=sc.nextInt();
        }
        ArrayList<Integer> evenlist=new ArrayList<>();
        ArrayList<Integer> oddlist=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
                evenlist.add(mainMat[i]);
            else    
                oddlist.add(mainMat[i]);
        }
        Collections.sort(evenlist);
        Collections.sort(oddlist);
        int secondlargestEven=0;
        int secondlargestOdd=0;
        int sum=0;
        if(evenlist.size()!=1 && oddlist.size()!=1)
        {
            secondlargestEven=evenlist.get(evenlist.size()-2);
            secondlargestOdd=oddlist.get(oddlist.size()-2);
            sum=secondlargestEven+secondlargestOdd;
        }
        System.out.println(sum);   
        
    }
}

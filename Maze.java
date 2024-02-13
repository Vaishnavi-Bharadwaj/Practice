import java.util.*;
public class Maze {
   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int[][] arr=new int[n][n];
      for(int i=0;i<n;i++)
      {
         for(int j=0;j<n;j++)
         {
            arr[i][j]=sc.nextInt();
         }
      }
      if(destination(arr, n))
         System.out.println("Morris can reach");
      else
         System.out.println("Morris cannot reach");
   } 
   public static int destination(int[][] arr,int i,int j,int n,int m)
   {
      if(i==(n-1)&&j==(m-1))
         return 1;
      if(i>=n || j>=m)
         return 0;
      else
         return destination(arr, i+1, j)+destination(arr, i, j+1);
   }
}

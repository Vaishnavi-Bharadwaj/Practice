//UniCourt
import java.util.*;
public class FindOccurrences {
    public static void initializeMap(int[] list1,HashMap<Integer,Integer> map)
    {
        //HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<list1.length;i++) 
        {
            map.put(list1[i], 0); //put the elements of the list1 into the hashmap
        }
    }
    public static Map findOccurrence(int[] list2, HashMap<Integer,Integer> map) 
    {
        for(int j=0;j<list2.length;j++) 
        {
            if(map.containsKey(list2[j])) //traverse through list2 and check if the map contains the elements in list2
            {
                int existing_count = map.get(list2[j]); //get the count of the current element from list2
                existing_count++; //increment the count
                map.put(list2[j], existing_count); //put the count of the element back to the hashmap
            }
        }
        return map;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=sc.nextInt();
        int[] list1=new int[n];
        int[] list2=new int[n];
        for(int i=0;i<n;i++)
        {
            list1[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            list2[i]=sc.nextInt();
        }
        initializeMap(list1,map);
        System.out.println(findOccurrence(list2,map));
    }
}

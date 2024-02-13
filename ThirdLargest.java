//7EDGE
import java.util.*;
public class ThirdLargest {
    public static void main(String[] args) {
        String str[]={"before","after","hello","world"};
        String thirdlargeString=thirdLargest(str);
        System.out.println(thirdlargeString);
    }
    public static String thirdLargest(String[] str)
    {
        if(str.length<=3)
            return str[str.length-1];
        List<String> list=Arrays.asList(str);
        Collections.sort(list,Collections.reverseOrder());
        return list.get(2);

    }
}

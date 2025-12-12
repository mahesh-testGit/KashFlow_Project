import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NewProgram1 {
    public static void main(String[] args) {

       int[] array1  = {1,5,2,6,4,5,6,8,8,7,7,5};

       Map<Integer,Integer> map=new HashMap<Integer,Integer>();

       for(int i=0;i<array1.length;i++)
       {
           if(map.containsKey(array1[i]))
           {
               map.put(array1[i],array1[i]+1);
           }
           else
           {
               map.put(array1[i],1);
           }
       }

       for(Map.Entry<Integer,Integer> entry:map.entrySet())
       {
           if(entry.getValue()>1)
           {
               System.out.println(entry.getKey()+""+entry.getValue());
           }
       }

    }
}

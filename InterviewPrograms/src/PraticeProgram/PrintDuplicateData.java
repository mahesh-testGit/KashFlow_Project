package PraticeProgram;

import java.util.HashMap;
import java.util.Map;

public class PrintDuplicateData {
    public static void main(String[] args) {
        String str="welecome to java amy welecome to my java";
        Map<Character,Integer> map=new HashMap<Character,Integer>();
       char[] tochararray=str.toCharArray();
        for (char ch:tochararray)
        {
            if(map.containsKey(ch))
            {
                map.put(ch,map.get(ch)+1);
            }
            else
            {
                map.put(ch,1);
            }
        }
        for(Map.Entry<Character,Integer> entry: map.entrySet())
        {
            if(entry.getValue()>1)
            {
                System.out.println(entry.getKey()+""+entry.getValue());
            }
        }
    }
}

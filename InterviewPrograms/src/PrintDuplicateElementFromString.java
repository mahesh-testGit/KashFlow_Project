import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PrintDuplicateElementFromString
{
    public static void main(String[] args) {

        printDuplicateCharacters("Welcome");
    }
    public static void printDuplicateCharacters(String str)
    {

        char word[]=str.toCharArray();
        Map<Character,Integer> charMap=new HashMap<Character,Integer>();

        for(Character ch:word)
        {
            if(charMap.containsKey(ch))
            {
                charMap.put(ch,charMap.get((ch)+1));
            }
            else {
                charMap.put(ch, 1);
            }
        }

     //   Set<Map.Entry<Character,Integer>> entrySet=charMap.entrySet();

        for (Map.Entry<Character,Integer> entry:charMap.entrySet())
        {
            if(entry.getValue()>1)
            {
                System.out.println(entry.getKey()+":"+entry.getValue());
            }
        }
    }
}

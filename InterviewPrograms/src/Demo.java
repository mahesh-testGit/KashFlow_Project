import java.util.HashMap;
import java.util.Map;

public class Demo {
    public static void countDuplicateCharacters(String str) {

        // Creating a HashMap containing char
        // as a key and occurrences as a value
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        // Converting given string into
        // a char array
        char[] charArray = str.toCharArray();

        // Checking each character
        // of charArray
        for (char c : charArray) {

            if (map.containsKey(c)) {

                // If character is present
                // in map incrementing it's
                // count by 1
                map.put(c, map.get(c) + 1);
            } else {

                // If character is not present
                // in map putting this
                // character into map with
                // 1 as it's value.
                map.put(c, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry :
                map.entrySet()) {

            if (entry.getValue() > 1) {
                System.out.println(entry.getKey()
                        + " : "
                        + entry.getValue());
            }
        }
    }
        // Driver Code

        public static void main(String[] args)
        {
            // Given String str
            String str = "geeksforgeeks";

            // Function Call
            countDuplicateCharacters(str);
        }
}

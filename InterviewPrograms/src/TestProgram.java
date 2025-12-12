import java.util.HashMap;
import java.util.Map;

public class TestProgram {
    public static void main(String[] args) {

        String[] words = "This is interview question".split(" ");

        String rev = "";
        for (int i = words.length - 1; i >= 0; i--) {
            rev += words[i] + " ";
        }
        System.out.println(rev);
    }
}

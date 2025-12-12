public class MyTestProgram {
    public static void main(String[] args) {

        String[] str="This is Mahesh".split(" ");

        String output="";

        for(int i=0;i<str.length;i++)
        {
            String word=str[i];

            String reverse="";

            for(int j=word.length()-1;j>=0;j--)
            {
                reverse=reverse+word.charAt(j);
            }

            output=output+reverse+" ";

        }

        System.out.print(output);
    }
}

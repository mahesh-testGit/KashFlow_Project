package PraticeProgram;

public class TestProgram {
    public static void main(String[] args) {
        String str="Programming";
        StringBuilder sb1=new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            int index=str.indexOf(ch,i+1);

            if(index==-1)
            {
                sb1.append(ch);
            }
        }
        System.out.println(sb1);

    }
}

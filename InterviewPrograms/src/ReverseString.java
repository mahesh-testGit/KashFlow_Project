public class ReverseString
{
    public static void main(String[] args)
    {
     String name="Hi Welecome to JAVA";
     for (int i=name.length()-1;i>=0;i--)
     {
         char ch=name.charAt(i);
         System.out.print(ch);
     }
    }
}

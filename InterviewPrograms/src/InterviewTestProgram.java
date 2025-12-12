 class A
{
    void printA()
    {
        System.out.println("Print A value");
    }
}

class B extends A
{
    void printB()
    {
        System.out.println("Print B value");
    }
}

public class InterviewTestProgram {

    public static void main(String[] args) {

        A a= new B();

        a.printA();

        B b=new B();

        b.printB();

        A a1=new A();

        a1.printA();







    }
}

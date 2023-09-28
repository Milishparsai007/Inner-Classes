
abstract class My
{
    abstract public void show();

}

class Outer2
{
    public void display()
    {
//        My m=new My()
//        {
//            public void show()
//            {
//                System.out.println("Hello world");
//            }
//        };
//        m.show();

        new My(){public void show(){System.out.println("Hello world");}}.show(); //this an anonymous object with anonymous class.
    }
}

public class AnonymousClass {
}

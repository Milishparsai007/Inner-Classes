
class Outer1{
    public void display()
    {
        class Inner1
        {
            public void show()
            {
                System.out.println("Hello");
            }
        }

//        Inner1 i=new Inner1();
//        i.show();
        new Inner1().show(); //this is an anonymous object which is having no name still it will be created and the method will be called.
    }
}

public class LocalInner {
    public static void main(String[] args) {
        Outer1 o = new Outer1();
        o.display();
    }
}

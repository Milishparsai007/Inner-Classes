
class Outer
{
    int x=10;
//    Inner i=new Inner();
    class Inner
    {
        int y=20;
        void InnerDisplay()
        {
            System.out.println(x+" "+y);
        }
    }

    void OuterDisplay()
    {
        Inner in=new Inner();  //creating an pbject of inner class to acces members of inner class i.e., y and Innerdispaly
        in.InnerDisplay();
        System.out.println(in.y);
//        i.InnerDisplay();   //we can also create object of inner class before declaring inner class. here object of inner class
//        having reference as i is created before declaring inner class.
//        System.out.println(i.y);
    }
}

public class InnerClasses {
    public static void main(String[] args) {
        Outer o=new Outer();
        o.OuterDisplay(); //this will call the outerdisplay method and this method will in return create an object of inner class
//        and then the method innerdisplay will be called.

        //for creating an object of inner class in another class we use following:
        Outer.Inner inner=new Outer().new Inner();
        inner.InnerDisplay();
        System.out.println(inner.y);
    }
}
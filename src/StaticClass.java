
class Outer3
{
    int x=10;
    static int y=20;
    static class Inner3
    {
        public void display()
        {
//            System.out.println(x+""+y);  it is an error because static inner class can only access static member of outer class.
            System.out.println(y);
        }
    }


}

public class StaticClass {
    public static void main(String[] args) {
        Outer3.Inner3 i =new Outer3.Inner3();
        i.display();

    }
}

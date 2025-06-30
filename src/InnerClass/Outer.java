package InnerClass;

public class Outer
{
    int x = 20;
    public class Inner
    {
        int z = 80;
        public void Display()
        {
            System.out.println(x+" "+z);
        }
    }
    Inner i = new Inner();
    public void Display()
    {
        i.Display();
        System.out.println(i.z);
    }
}

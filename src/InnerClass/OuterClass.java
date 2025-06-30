package InnerClass;

public class OuterClass
{
    public void Display()
    {
        class Inner
        {
            public void Show()
            {
                System.out.println("Inner Class");
            }
        }
        Inner i = new Inner();
        i.Show();
    }
}

package OOPS;
class add{
    int num1 ;
    int num2 ;
    add()
    {
        num1=1;
        num2=2;
    }
    add(int a, int b)
    {
        num1=a;
        num2=b;
    }
}
public class ConstructorExample {
    public static void main(String[] args) {
     add obj = new add();
     System.out.println("No args Constructor : "+obj.num1+ " "+obj.num2);
     add obj2 = new add(2,6);
     System.out.println("parameterised constructor : "+obj2.num1+" "+obj2.num2 );
    }
}

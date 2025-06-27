package BasicProgramming;
//swaping of two number
public class Program1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 8;
        System.out.println("Swapping with using third variable");
        System.out.println("before swaping a : "+a+"  b : "+b);
        int temp = a;
        a=b;
        b=temp;
        System.out.println("after swaping a : "+a+"  b : "+b);
        //without temp variable
        int x = 10;
        int y = 20;
        System.out.println();
        System.out.println("Swapping without using third variable");
        System.out.println("before swaping x : "+x+"  y : "+y);
        x = x+y;
        y = x-y;
        x = x-y;
        System.out.println("after swapping x : "+x+"  y : "+y);

    }
}

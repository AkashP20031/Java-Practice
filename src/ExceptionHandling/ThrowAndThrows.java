package ExceptionHandling;

import java.util.Scanner;

public class ThrowAndThrows {

    static int area(int l, int b) throws Exception
    {
        if(l<0 || b<0)
        {
            throw new Exception("the length and breadth are not be 0");
        }
        else
            return l*b;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length and breadth to calculate area : ");
        int l = sc.nextInt();
        int b =sc.nextInt();
        System.out.println(area(l,b));
    }
}

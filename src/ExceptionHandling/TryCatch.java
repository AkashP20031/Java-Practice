package ExceptionHandling;

import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the two number to divide : ");
        a = sc.nextInt();
        b = sc.nextInt();
        try {
            c=a/b;
            System.out.println(c);
        }
        catch (ArithmeticException e)
        {
            System.out.println("not divide by 0");
        }
    }
}

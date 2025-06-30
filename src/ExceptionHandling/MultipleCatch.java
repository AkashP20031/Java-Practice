package ExceptionHandling;

import java.util.Scanner;

public class MultipleCatch {
    public static void main(String[] args) {
        int div;
        int[] arr = {10,20,30,0};
        try {
            div = arr[2]/arr[1];
            System.out.println(div);
            System.out.println(arr[6]);
        }catch (ArithmeticException e)
        {
            System.out.println("not divide by 0");
        }catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Index out of boundary ");
        }
        System.out.println("Bye");
    }
}

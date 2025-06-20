package ExceptionHandling;

public class NestedTryBlock {
    public static void main(String[] args) {
        int div;
        int[] arr = {10,20,30,0};
        try {
            div = arr[2]/arr[1];
            System.out.println(div);
            try {
                System.out.println(arr[6]);
            }catch (ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Index out of boundary ");
            }
        }catch (ArithmeticException e)
        {
            System.out.println("not divide by 0");
        }
        System.out.println("out of tyr catch block");
    }
}

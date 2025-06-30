package Methods;

import java.util.Scanner;

public class Challenge1 {

    public int max(int a, int b)
    {
        return Math.max(a, b);
    }
    public static int maxmum(int a, int b)
    {
        return Math.max(a, b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        //without static
        Challenge1 c = new Challenge1();
        System.out.println("maximum no = "+c.max(num1,num2));
        //with static
        System.out.println("maximum no = "+ maxmum(num1,num2));
    }
}

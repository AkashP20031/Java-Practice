package BasicProgramming;

import java.util.Scanner;

//fibonacci series
public class Program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to generate the series : ");
        int n = sc.nextInt();
        int n1 = 0, n2 = 1, sum;
        System.out.println("The Fibonacci series : ");
        System.out.print(n1+" "+n2);
        for (int i = 2; i<=n; i++)
        {
            sum = n1 + n2;
            n1 = n2;
            n2 = sum;
            System.out.print(" " +sum);
        }
    }
}

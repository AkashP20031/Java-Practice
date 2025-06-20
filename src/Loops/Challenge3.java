package Loops;

import java.util.Scanner;

public class Challenge3 {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 1;
        for (int i=1;i<=num;i++)
        {
            sum = sum * i ;

        }
        System.out.println("Factorial of "+num+" : " + sum);
    }
    }


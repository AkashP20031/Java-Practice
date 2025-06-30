package Conditions;

import java.util.Scanner;

public class Challenge1 {
    public static void main(String[] args) {
        System.out.println("***********To find Odd or Even no********");
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num%2==0)
        {
            System.out.println(num + " is Even Number");
        }
        else
        {
            System.out.println(num + " is Odd number");
        }
    }
}

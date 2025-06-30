package Conditions;

import java.util.Scanner;

public class Challenge2 {
    public static void main(String[] args) {
        System.out.println("***********To check the person is young or not********");
        System.out.println("Enter the age : ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age<=18)
        {
            System.out.println("The person is young");
        }
        else if(age<=60)
        {
            System.out.println("The person is Adult");
        }
        else
        {
            System.out.println("The person is old");

        }
    }
}

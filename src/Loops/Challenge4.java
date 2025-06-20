package Loops;

import java.util.Scanner;

public class Challenge4 {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev = num;
        int rem = 0;
        while(num>0) {
            int dig = num % 10;
            rem = rem *10 + dig;
            num = num/10;
        }
        System.out.println("Reverse of the  Number : " + rem);
        if(rev == rem)
        {
            System.out.println("is palindrome");
        }
        else
        {
            System.out.println("is not palindrome");
        }

    }

}

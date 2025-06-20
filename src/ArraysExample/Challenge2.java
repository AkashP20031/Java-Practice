package ArraysExample;

import java.util.Scanner;

public class Challenge2 {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8};
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int n : a)
        {
            if(num == n)
            {
                System.out.println("The element is found");
            }
        }
    }
}

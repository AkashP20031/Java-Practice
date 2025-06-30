package BasicArrayPrograms;
//To find the even and odd number in an array
public class Program2 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9};
        System.out.println("The Even Numbers in an Array : ");
        for (int i : a) {
            if (i % 2 == 0) {
                System.out.print(" "+i);
            }
        }
        System.out.println();
        System.out.println("The Odd Numbers in an Array : ");
        for (int j : a)
        {
            if(j%2 != 0)
            {
                System.out.print(" "+j);
            }
        }
    }
}

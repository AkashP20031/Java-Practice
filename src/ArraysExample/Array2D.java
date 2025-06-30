package ArraysExample;

public class Array2D {
    public static void main(String[] args) {
        int[][] a = {{2,3,5,8},{3,6,5,7}};
        for(int i = 0; i<a.length ;i++)
        {
            for (int j = 0; j<a[i].length;j++)
            {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        for (int[] x : a) {
            for (int y : x) {
                System.out.print(y);
            }
            System.out.println();
        }
    }
}

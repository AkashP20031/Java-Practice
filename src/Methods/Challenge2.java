package Methods;

public class Challenge2 {
    public void update(int[] a)
    {
        a[0] = 25;
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        Challenge2 c = new Challenge2();
        c.update(a);
        for (int x: a)
        {
            System.out.println(x);
        }
    }
}

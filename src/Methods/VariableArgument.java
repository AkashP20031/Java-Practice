package Methods;

public class VariableArgument {

    public static void show(int ...A)
    {
        for (int x : A)
        {
            System.out.print(x+ " ");
        }
        System.out.println();
    }
    public static void show(String ...name)
    {
        for (String n : name)
        {
            System.out.print(n+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        show(1,2,3);
        show(1);
        show(8,7,6,5,4,7,4,5);
        show(1,2,2,4,5,6);
        show("akash","nandan","tejas","manju");
        show("akash");
        show("abs","cvb","asd","scc","sasd","adD");
    }
}

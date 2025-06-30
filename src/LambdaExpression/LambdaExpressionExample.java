package LambdaExpression;

import java.util.ArrayList;
import java.util.List;

interface MyLambda
{
    void add(int x, int y);
}

public class LambdaExpressionExample {
    public static void main(String[] args) {
        MyLambda m = (x,y)->{
            System.out.println(x+y);
        } ;
        m.add(2,3);
        ArrayList<Integer> arrayList= new ArrayList<>(List.of(2,4,3,5));
        arrayList.forEach(System.out::print);
    }
}

package OOPS.Polymorphism.overloading;

public class overloading {
    public static void main(String[] args) {
        overload obj = new overload();
        System.out.println(obj.add(1,2));
        System.out.println(obj.add(1.2f,2.3f));
        System.out.println(obj.add(5,6,7));
        System.out.println(obj.add(5,3,4,5));
    }
}

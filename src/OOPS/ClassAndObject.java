package OOPS;

class circle {
    private static final double pi = 3.14;
    private final double radius;
    circle(double radius)
    {
        this.radius = radius;
    }
    public void diameter()
    {
        System.out.println("Diameter of circle : "+(radius*2));
    }
    public void area()
    {
        System.out.println("Area of circle : "+(pi*(radius*radius)));
    }
}

public class ClassAndObject {
    public static void main(String[] args) {
        circle c = new circle(5);
        c.area();
        c.diameter();
    }
}

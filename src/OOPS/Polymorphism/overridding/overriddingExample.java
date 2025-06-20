package OOPS.Polymorphism.overridding;

public class overriddingExample {
    public static void main(String[] args) {
        Animal c = new Cat();
        c.sound();
        Animal d = new Dog();
        d.sound();
    }
}

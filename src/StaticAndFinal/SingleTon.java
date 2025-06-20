package StaticAndFinal;

public class SingleTon {
    public static void main(String[] args) {
        CoffeeMachine c1 = CoffeeMachine.getInstance();
        c1.getCoffee();
    }
}

package StaticAndFinal;

public class CoffeeMachine
{
    private int milkQt;
    private int waterQt;
    private int coffeeQt;
    private int sugarQt;

    static private CoffeeMachine coffee = null;
    private CoffeeMachine()
    {
        milkQt=2;
        waterQt=1;
        coffeeQt=2;
        sugarQt=1;
    }
    public void getCoffee()
    {
        System.out.println("Milk Qt : " +milkQt + "\nCoffee Qt : " + coffeeQt+ "\nWater Qt : " +waterQt+ "\nSugar Qt : " +sugarQt  );
    }
    static CoffeeMachine getInstance()
    {
        if(coffee == null)
            return new CoffeeMachine();
        return coffee;
    }

}

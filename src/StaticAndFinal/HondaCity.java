package StaticAndFinal;

public class HondaCity
{
    public static int price = 1000000;
    public static double onRoadPrice(String city)
    {
        switch (city)
        {
            case "delhi": return price+price*0.1;
            case "karnataka": return price+price*0.09;
            case "mumbai" : return price+price*0.12;
            default: return price+price*0.06;
        }
    }
}

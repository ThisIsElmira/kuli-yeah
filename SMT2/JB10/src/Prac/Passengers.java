package JB10.src.Prac;

public class Passengers
{
    String name, cityOrigin, cityDestination;
    int ticketAmount, price;

    Passengers(String name, String cityOrigin, String cityDestination, int ticketAmount, int price)
    {
        this.name = name;
        this.cityOrigin = cityOrigin;
        this.cityDestination = cityDestination;
        this.ticketAmount = ticketAmount;
        this.price = price;
    }
}

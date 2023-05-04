package Assg;

public class Ticket
{
    String airlines, destination, origin;
    int price;

    Ticket(String a, String dest, String origin, int price)
    {
        airlines = a;
        destination = dest;
        this.origin = origin;
        this.price = price;
    }

    void print()
    {
        System.out.println("Airlines = " + airlines);
        System.out.println("Destination = " + destination);
        System.out.println("Origin = " + origin);
        System.out.println("Price = " + price);
    }
}

public class Item
{
    String name;
    int unitPrice, qty;

    Item(String nm, int up, int qt)
    {
        name = nm;
        unitPrice = up;
        qty = qt;
    }

    int calculateTotalPrice()
    {
        return unitPrice*qty;
    }

    int calculateDisc()
    {
        if (unitPrice*qty > 100_000)
        {
            unitPrice = (int) (unitPrice * 0.1);
        }
        else if (unitPrice*qty >= 50_000 && unitPrice*qty <= 100_000)
        {
            unitPrice = (int) (unitPrice * 0.05);
        }
        return unitPrice;
    }

    int calculateFinalPrice()
    {
        unitPrice = calculateTotalPrice() - (calculateDisc());
        return unitPrice;
    }

    public void printFinalPrice()
    {
        System.out.println("Name = " + name);
        System.out.println("Price = " + unitPrice);
        System.out.println("Quantity = " + qty);
        System.out.println("Total Price = " + calculateTotalPrice());
        System.out.println("Discount = " + calculateDisc());
        System.out.println("Final Price = " + calculateFinalPrice());
    }
}
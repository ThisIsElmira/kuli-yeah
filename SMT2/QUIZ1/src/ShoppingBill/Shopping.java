package QUIZ1.src.ShoppingBill;

public class Shopping
{
    String billId, customerId, customerName, date, couponCode; //declare the things
    double[] price = new double[4]; //declare price
    int deliveryDistance; //declare distance

    public Shopping()
    {}

    public double gift10(double[] price)
    {
        int priceTotal = 0;
        for (int i = 0; i < price.length; i++)
        {
            priceTotal += price[i];
        }
        return priceTotal*0.9;
    }

    public double gift15(double[] price)
    {
        int priceTotal = 0;
        for (int i = 0; i < price.length; i++)
        {
            priceTotal += price[i];
        }
        return priceTotal*0.85;
    }

    public double gift17(double[] price)
    {
        int priceTotal = 0;
        for (int i = 0; i < price.length; i++)
        {
            priceTotal += price[i];
        }
        return priceTotal*0.83;
    }

    public double calcShippingCost()
    {
        double cost = deliveryDistance * 1000;
        for (int i = 0; i < price.length; i++)
        {
            if (price[i] > 75000)
            {
                cost = cost * 0.95;
            }
        }
        return cost;
    }

    public int calcTotalPayment()
    {
        int priceTotal = 0;
        for (int i = 0; i < price.length; i++)
        {
            priceTotal += price[i];
        }
        return priceTotal;
    }
}

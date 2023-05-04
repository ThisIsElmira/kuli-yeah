package ShoppingBill;

public class ShoppingMain
{
    static Shopping[] shoppingArray = new Shopping[5];
    static double totalPrice = 0;
    public static double biggestTotalPayment()
    {
        double big = 0;
        for(int i = 0; i < shoppingArray.length; i++)
        {
            if (totalPrice > big)
            {
                big = totalPrice;
            }
        }
        return big;
    }

    public static double calcDiscount()
    {
        double count = 0, total = 0;
        for (int i = 0; i < 2; i++)
        {
            if (shoppingArray[i].couponCode == "GIFT10")
            {
                count = shoppingArray[i].calcTotalPayment() - shoppingArray[i].gift10(shoppingArray[i].price);
            }
            if (shoppingArray[i].couponCode == "GIFT15")
            {
                count = shoppingArray[i].calcTotalPayment() - shoppingArray[i].gift15(shoppingArray[i].price);
            }
            if (shoppingArray[i].couponCode == "GIFT17")
            {
                count = shoppingArray[i].calcTotalPayment() - shoppingArray[i].gift17(shoppingArray[i].price);
            }
            total = total + count;
        }
        return total;
    }
    public static void main(String[] args)
    {

        shoppingArray[0] = new Shopping();
        shoppingArray[0].billId = "1";
        shoppingArray[0].customerId = "1";
        shoppingArray[0].customerName = "Sugeng";
        shoppingArray[0].date = "25/02/2022";
        shoppingArray[0].price = new double[]{10000, 20000, 30000, 40000};
        shoppingArray[0].couponCode = "GIFT10";
        shoppingArray[0].deliveryDistance = 20;

        shoppingArray[1] = new Shopping();
        shoppingArray[1].billId = "2";
        shoppingArray[1].customerId = "2";
        shoppingArray[1].customerName = "Radiator";
        shoppingArray[1].date = "16/05/2022";
        shoppingArray[1].price = new double[]{77000, 80000, 20000, 40000};
        shoppingArray[1].couponCode = "GIFT17";
        shoppingArray[1].deliveryDistance = 50;

        shoppingArray[2] = new Shopping();
        shoppingArray[2].billId = "3";
        shoppingArray[2].customerId = "3";
        shoppingArray[2].customerName = "Eko";
        shoppingArray[2].date = "12/12/2022";
        shoppingArray[2].price = new double[]{90000, 40000, 20000, 80000};
        shoppingArray[2].couponCode = "GIFT17";
        shoppingArray[2].deliveryDistance = 8;

        shoppingArray[3] = new Shopping();
        shoppingArray[3].billId = "4";
        shoppingArray[3].customerId = "4";
        shoppingArray[3].customerName = "Gunadarma";
        shoppingArray[3].date = "17/08/2022";
        shoppingArray[3].price = new double[]{50000, 20000, 40000, 70000};
        shoppingArray[3].couponCode = "GIFT15";
        shoppingArray[3].deliveryDistance = 17;

        shoppingArray[4] = new Shopping();
        shoppingArray[4].billId = "5";
        shoppingArray[4].customerId = "5";
        shoppingArray[4].customerName = "Pierro";
        shoppingArray[4].date = "06/09/2022";
        shoppingArray[4].price = new double[]{100000, 80000, 50000, 20000};
        shoppingArray[4].couponCode = "GIFT10";
        shoppingArray[4].deliveryDistance = 13;

        for (int i = 0; i < 5; i++)
        {
            System.out.println("Total payment for bill ID no. " + shoppingArray[i].billId + " and customer ID no. " + shoppingArray[i].customerId + " is " + shoppingArray[i].customerName + " at " + shoppingArray[i].date + " is " + shoppingArray[i].calcTotalPayment());
            System.out.print("The Coupon Code used is " + shoppingArray[i].couponCode);
            if (shoppingArray[i].couponCode == "GIFT10")
            {
                System.out.println(" and the price after discount is " + shoppingArray[i].gift10(shoppingArray[i].price));
                System.out.println("The Shipping Cost for " + shoppingArray[i].deliveryDistance + "km is " + shoppingArray[i].calcShippingCost() + " and the total Price to be paid is " + (shoppingArray[i].gift10(shoppingArray[i].price)+shoppingArray[i].calcShippingCost()));
                totalPrice = shoppingArray[i].gift10(shoppingArray[i].price)+shoppingArray[i].calcShippingCost();
            }
            else if (shoppingArray[i].couponCode == "GIFT15")
            {
                System.out.println(" and the price after discount is " + shoppingArray[i].gift15(shoppingArray[i].price));
                System.out.println("The Shipping Cost for " + shoppingArray[i].deliveryDistance + "km is " + shoppingArray[i].calcShippingCost() + " and the total Price to be paid is " + (shoppingArray[i].gift15(shoppingArray[i].price)+shoppingArray[i].calcShippingCost()));
                totalPrice = shoppingArray[i].gift15(shoppingArray[i].price)+shoppingArray[i].calcShippingCost();
            }
            else if (shoppingArray[i].couponCode == "GIFT17")
            {
                System.out.println(" and the price after discount is " + shoppingArray[i].gift17(shoppingArray[i].price));
                System.out.println("The Shipping Cost for " + shoppingArray[i].deliveryDistance + "km is " + shoppingArray[i].calcShippingCost() + " and the total Price to be paid is " + (shoppingArray[i].gift17(shoppingArray[i].price)+shoppingArray[i].calcShippingCost()));
                totalPrice = shoppingArray[i].gift17(shoppingArray[i].price)+shoppingArray[i].calcShippingCost();
            }
            System.out.println("");

        }

        System.out.println("The biggest total payment is " + biggestTotalPayment());

        double count = 0;
        for (int i = 0; i < 2; i++)
        {
            count = count + shoppingArray[i].gift17(shoppingArray[i].price);
        }
        System.out.println("Average for shopping bill that has 17% discount is " + count/2);
        System.out.println("Total Discount for all bill is " + calcDiscount());
    }
}

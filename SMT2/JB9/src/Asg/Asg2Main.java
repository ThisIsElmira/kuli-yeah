package Asg;

public class Asg2Main
{
    public static void main(String[] args)
    {
        Asg2System system = new Asg2System(8);

        int[] ID = {1, 2, 3, 4, 5, 6, 7, 8};
        String[] date = {"1 January 2069", "10 January 2069", "27 January 2069", "2 February 2069", "7 February 2069", "10 February 2069", "22 February 2069", "30 February 2069"};
        int[] quantity = {5, 8, 2, 1, 7, 2, 3, 4};
        double[] price = {100_000, 150_000, 87_000, 120_000, 56_000, 45_000, 120_000, 69_000};

        for (int i = 0; i < system.size; i++)
            System.out.println(ID[i] + " " + date[i] + " " + quantity[i] + " " + price[i]);

        System.out.println();

        for (int i = 0; i < system.size; i++)
        {
            Asg2 receipts = new Asg2(ID[i], quantity[i], date[i], price[i]);
            system.push(receipts);
        }

        int voucherReceipts = 5;
        system.print(voucherReceipts);
    }
}

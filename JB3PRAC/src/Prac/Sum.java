package Prac;
import java.util.Scanner;

public class Sum
{
    public int elemen;
    public double profit[];
    public double total;

    public Sum(int element)
    {
        elemen = element;
        profit = new double[elemen];
        total = 0;
    }

    double totalBF(double arr[])
    {
        for (int i = 0; i < elemen; i++)
        {
            total = total + arr[i];
        }
        return total;
    }

    double totalDC(double arr[], int l, int r)
    {
        if (l == r)
            return arr[l];
        else if (l<r)
        {
            int mid = (l + r) / 2;
            double lsum = totalDC(arr, l, mid-1);
            double rsum = totalDC(arr, mid+1, r);
            return lsum+rsum+arr[mid];
        }
        return 0;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("===================================================");
        System.out.println("Program for Calculating Total Profits");
        System.out.println("Input the Number of Months : ");
        int totalElement = sc.nextInt();
        Sum sm = new Sum(totalElement);
        sm.elemen = totalElement;

        System.out.println("===================================================");
        for (int i = 0; i < sm.elemen; i++)
        {
            System.out.print("Input the profit of the month to - " + (i+1) + " = ");
            sm.profit[i] = sc.nextDouble();
        }

        System.out.println("===================================================");
        System.out.println("Algoritma Brute Force");
        System.out.println("Total profits of the company for " + sm.elemen + " month is = " + sm.totalBF(sm.profit));
        System.out.println("===================================================");
        System.out.println("Algoritma Divide Conquer");
        System.out.println("Total profits of the company for " + sm.elemen + " month is = " + sm.totalDC(sm.profit, 0, sm.elemen-1));
    }
}

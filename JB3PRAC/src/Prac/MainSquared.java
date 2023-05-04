package Prac;
import java.util.Scanner;
public class MainSquared
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("===================================================");
        System.out.print("Input the number of elements you want to count : ");
        int element = sc.nextInt();

        Squared[] png = new Squared[element];
        for (int i = 0; i < element; i++)
        {
            png[i] = new Squared();
            System.out.print("Input the value to be squared to-" + (i+1)+ " : ");
            png[i].num = sc.nextInt();
            System.out.print("Input the squared value to-" + (i+1) + " : ");
            png[i].squared = sc.nextInt();
        }

        System.out.println("===================================================");
        System.out.println("Result with Brute Force Squared");
        for (int i = 0; i < element; i++)
        {
            System.out.println("Value " + png[i].num + " squared " + png[i].squared + " is: " + png[i].squaredBF(png[i].num, png[i].squared));
        }
        System.out.println("===================================================");
        System.out.println("Results with Divide and Conquer squared");
        for (int i = 0; i < element; i++)
        {
            System.out.println("Value " + png[i].num + " squared " + png[i].squared + " is: " + png[i].squaredDC(png[i].num, png[i].squared));
        }
    }
}

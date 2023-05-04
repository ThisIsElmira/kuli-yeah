import java.util.Scanner;
public class Assignment2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double save = 1_000_000;
        System.out.print("input number of month: ");
        int month = sc.nextInt();
        double total = 0;
        for (int i = 0; i <= month; i++)
        {
            total = save + ((save * 0.02) * i);
        }
        System.out.println("Total saves after " + month + " month is " + total);
    }
}

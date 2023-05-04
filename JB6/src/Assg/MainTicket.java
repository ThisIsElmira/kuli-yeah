package Assg;
import java.util.Scanner;

public class MainTicket
{
    public static void main(String[] args)
    {
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        TicketService data = new TicketService();
        int n = 5;

        for(int i = 0; i < n; i++)
        {
            System.out.println("====================");
            System.out.print("Airlines = ");
            String air = s2.nextLine();
            System.out.print("Destination = ");
            String des = s2.nextLine();
            System.out.print("Origin = ");
            String ori = s2.nextLine();
            System.out.print("Price = ");
            int prc = s1.nextInt();

            Ticket t = new Ticket(air, des, ori, prc);
            data.add(t);
        }

        System.out.println("====================");
        System.out.println("Unsorted ticket list: ");
        System.out.println("====================");
        data.displayAll();

        System.out.println("Sorted price ascending list");
        System.out.println("====================");
        data.selectionSort();
        data.displayAll();

        System.out.println("Sorted price descending list");
        System.out.println("====================");
        data.bubbleSort();
        data.displayAll();
    }
}

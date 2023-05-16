package JB11.AsgNo4and5;

import JB10.src.Prac.Passengers;
import JB10.src.Prac.PassengersQueue;

import javax.print.attribute.standard.QueuedJobCount;
import java.util.Scanner;

public class Main
{
    public static void menu()
    {
        System.out.println("Choose menu: ");
        System.out.println("1. Queue");
        System.out.println("2. Dequeue");
        System.out.println("3. Check all queue");
        System.out.println("===========================");
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert maximum queue : ");
        int max = sc.nextInt();
        QueueLinkedList link = new QueueLinkedList(max);

        int choose;
        do
        {
            menu();
            choose = sc.nextInt();
            switch (choose)
            {
                case 1:
                    System.out.print("Name: ");
                    String nm = sc.next();
                    sc.nextLine();
                    System.out.print("Address: ");
                    String addr = sc.next();
                    sc.nextLine();
                    System.out.print("Customer Account Number: ");
                    int can = sc.nextInt();
                    Node cust = new Node(nm, addr, can);
                    sc.nextLine();
                    link.enqueue(cust);
                    break;
                case 2:
                    Passengers data = queuePassenger.dequeue();
                    if (!"".equals(data.name) && !"".equals(data.cityOrigin) && !"".equals(data.cityDestination) && !"".equals(data.ticketAmount) && !"".equals(data.price)) System.out.println("Data removed : " + data.name + " " + data.cityOrigin + " " + data.cityDestination + " " + data.ticketAmount + " " + data.price);
                    break;
                case 3:
                    queuePassenger.print();
                    break;
            }
        }
        while(choose <= 3 && choose >= 1);
    }
    }
}

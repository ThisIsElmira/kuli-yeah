package JB10.src.Prac;

import java.util.Scanner;

public class PassengersMain
{
    public static void menu()
    {
        System.out.println("Choose menu: ");
        System.out.println("1. Queue");
        System.out.println("2. Dequeue");
        System.out.println("3. Check first queue");
        System.out.println("4. Check all queue");
        System.out.println("5. Clear queue");
        System.out.println("6. Check last queue");
        System.out.println("===========================");
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert maximum queue : ");
        int max = sc.nextInt();
        PassengersQueue queuePassenger = new PassengersQueue(max);

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
                    System.out.print("City origin: ");
                    String cOrg = sc.next();
                    sc.nextLine();
                    System.out.print("City Destination: ");
                    String cDes = sc.next();
                    sc.nextLine();
                    System.out.print("Ticket Amount: ");
                    int ticket = sc.nextInt();
                    System.out.print("Price: ");
                    int price = sc.nextInt();
                    Passengers p = new Passengers(nm, cOrg, cDes, price, ticket);
                    sc.nextLine();
                    queuePassenger.enqueue(p);
                    break;
                case 2:
                    Passengers data = queuePassenger.dequeue();
                    if (!"".equals(data.name) && !"".equals(data.cityOrigin) && !"".equals(data.cityDestination) && !"".equals(data.ticketAmount) && !"".equals(data.price)) System.out.println("Data removed : " + data.name + " " + data.cityOrigin + " " + data.cityDestination + " " + data.ticketAmount + " " + data.price);
                    break;
                case 3:
                    queuePassenger.peek();
                    break;
                case 4:
                    queuePassenger.print();
                    break;
                case 5:
                    queuePassenger.clear();
                    break;
                case 6:
                    queuePassenger.peekRear();
                    break;
            }
        }
        while(choose <= 6 && choose >= 1);
    }
}

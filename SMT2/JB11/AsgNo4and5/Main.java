package JB11.AsgNo4and5;
import java.util.Scanner;

public class Main
{
    static Scanner sc = new Scanner(System.in);
    public static Customer newCustomer()
    {
        System.out.print("Name: ");
        String nm = sc.next();
        sc.nextLine();
        System.out.print("Address: ");
        String addr = sc.next();
        sc.nextLine();
        System.out.print("Customer Account Number: ");
        String can = sc.next();
        sc.nextLine();

        return new Customer(nm, addr, can);
    }
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
        Queue q = new Queue();

        int choose;
        do
        {
            menu();
            choose = sc.nextInt();
            switch (choose)
            {
                case 1:
                    q.enqueue(newCustomer());
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    q.print();
                    break;
            }
        }
        while(choose <= 3 && choose >= 1);
    }
}

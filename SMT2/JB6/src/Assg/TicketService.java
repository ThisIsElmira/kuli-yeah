package Assg;

public class TicketService
{
    Ticket tickets[] = new Ticket[5];
    int index;

    void add(Ticket t)
    {
        if (index < tickets.length)
        {
            tickets[index] = t;
            index++;
        }
        else
        {
            System.out.println("The ticket list is full-filled");
        }
    }

    void displayAll()
    {
       for (Ticket t: tickets)
       {
           t.print();
           System.out.println("====================");
       }
    }

    void bubbleSort()
    {
        for (int i = 0; i< tickets.length-1; i++)
        {
            for (int j = 1; j < tickets.length-i; j++)
            {
                if (tickets[j].price > tickets[j-1].price)
                {
                    Ticket temp = tickets[j];
                    tickets[j] = tickets[j-1];
                    tickets[j-1] = temp;
                }
            }
        }
    }

    void selectionSort()
    {
        for (int i = 0; i < tickets.length-1; i++)
        {
            int indexMin = i;
            for (int j = i+1; j < tickets.length; j++)
            {
                if (tickets[j].price < tickets[indexMin].price)
                {
                    indexMin = j;
                }
            }
            Ticket temp = tickets[indexMin];
            tickets[indexMin] = tickets[i];
            tickets[i] = temp;
        }
    }
}

package JB10.src.Prac;

public class PassengersQueue
{
    int max, size, front, rear;
    Passengers[] Q;

    PassengersQueue(int max)
    {
        this.max = max;
        create();
    }

    void create()
    {
        Q = new Passengers[max];
        size = 0;
        front = rear - 1;
    }

    boolean isFull()
    {
        return size == max;
    }

    boolean isEmpty()
    {
        return size == 0;
    }

    void enqueue(Passengers data)
    {
        if(isFull()) System.out.println("Queue is already full");
        else
        {
            if (isEmpty()) front = rear = 0;
            else
            {
                if (rear == max -1) rear = 0;
                else rear++;
            }
            Q[rear] = data;
            size++;
        }
    }

    Passengers dequeue()
    {
        Passengers data = new Passengers("", "", "", 0, 0);
        if(isEmpty()) System.out.println("Queue is still empty");
        else
        {
            data = Q[front];
            size--;
            if(isEmpty()) front = rear = -1;
            else
            {
                if (front == max - 1) rear = 0;
                else front++;
            }
        }
        return data;
    }

    void print()
    {
        if (isEmpty()) System.out.println("Queue is still empty");
        else
        {
            int i = front;
            while(i != rear)
            {
                System.out.println(Q[i].name + " " + Q[i].cityOrigin + " " + Q[i].cityDestination + " " + Q[i].ticketAmount + " " + Q[i].price);
                i = (i + 1) % max;
            }
            System.out.println(Q[rear].name + " " + Q[rear].cityOrigin + " " + Q[rear].cityDestination + " " + Q[rear].ticketAmount + " " + Q[rear].price);
//            System.out.println(Q[i] + " ");
            System.out.println("Element amount : " + size);
        }
    }

    void peekRear()
    {
        if (!isEmpty()) System.out.println("The last element : " + Q[rear].name + " " + Q[rear].cityOrigin + " " + Q[rear].cityDestination + " " + Q[rear].ticketAmount + " " + Q[rear].price);
        else System.out.println("Queue is still empty");
    }

    void peek()
    {
        if (!isEmpty()) System.out.println("The first element : " + Q[front].name + " " + Q[front].cityOrigin + " " + Q[front].cityDestination + " " + Q[front].ticketAmount + " " + Q[front].price);
        else System.out.println("Queue is still empty");
    }

    void clear()
    {
        if (!isEmpty())
        {
            front = rear = -1;
            size = 0;
            System.out.println("Queue has been cleared successfully");
        }
        else System.out.println("Queue is still empty");
    }
}

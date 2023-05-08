package JB10.src.Prac;

public class Queue
{
    int max, size, front, rear;
    int[] Q;

    Queue(int max)
    {
        this.max = max;
        create();
    }

    void create()
    {
        Q = new int[max];
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

    void enqueue(int data)
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

    int dequeue()
    {
        int data = 0;
        if(isEmpty()) System.out.println("Queue is still empty");
        else
        {
            data = Q[front];
            size--;
            if(isEmpty()) front = rear = -1;
            else
            {
                if (front == max - 1);
                else front++;
            }
        }
        return data;
    }

    void peek()
    {
        if (!isEmpty()) System.out.println("The first element : " + Q[front]);
        else System.out.println("Queue is still empty");
    }

    void print()
    {
        if (!isEmpty()) System.out.println("Queue is still empty");
        else
        {
            int i = front;
            while(i != rear)
            {
                System.out.println(Q[i] + " ");
                i = (i + 1) % max;
            }
            System.out.println(Q[i] + " ");
            System.out.println("Element amount : " + size);
        }
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

package Asg;

public class Asg2System
{
    int size, top;
    Asg2[] data;

    Asg2System(int size)
    {
        this.size = size;
        data = new Asg2[size];
        top = -1;
    }

    boolean isFull()
    {
        return top == size - 1;
    }

    void push(Asg2 dt)
    {
        if (!isFull())
        {
            top++;
            data[top] = dt;
        }
        else System.out.println("Stack is already Full!");
    }

    void print(int limit)
    {
        System.out.printf("last %d data: \n", limit);
        for (int i = top; i >= (size - limit); i--)
        {
            System.out.println(data[i].ID + " " + data[i].date + " " + data[i].quantity + " " + data[i].price);
        }
    }
}

package Asg;

public class Asg1
{
    int size, top;
    char[] data;

    Asg1(int size)
    {
        this.size = size;
        data = new char[size];
        top = -1;
    }

    boolean isFull()
    {
        return top == size - 1;
    }

    void push(char dt)
    {
        if (!isFull())
        {
            top++;
            data[top] = dt;
        }
        else System.out.println("Stack is already Full!");
    }

    void print()
    {
        System.out.println("Result: ");
        for (int i = top; i >= 0; i--) System.out.print(data[i]);
    }
}

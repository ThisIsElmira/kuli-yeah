package JB9.src.Prac;

public class Stack
{
    int size, top;
    int[] data;

    Stack(int size)
    {
        this.size = size;
        data = new int[size];
        top = -1;
    }

    boolean isEmpty()
    {
        return top == -1;
        // if (top == -1) return true;
        // else return false;
    }

    boolean isFull()
    {
        return top == size - 1;
    }

    void push(int dt)
    {
        if(!isFull())
        {
            top++;
            data[top] = dt;
        }
        else
        {
            System.out.println("Stack is Full");
        }
    }

    void pop()
    {
        if(!isEmpty())
        {
            int x = data[top];
            top--;
            System.out.println("Remove data: " + x);
        }
    }

    void peek()
    {
        System.out.println("Top element : " + data[top]);
    }

    void print()
    {
        System.out.println("Stack content: ");
        for (int i = top; i >- 0; i--)
        {
            System.out.println(data[i] + " ");
        }
        System.out.println("");
    }

    void clear()
    {
        if(!isEmpty())
        {
            for (int i = top; i >= 0; i--) top--;
            System.out.println("Stack is now empty");
        }
        else System.out.println("Failed! Stack is still empty");
    }
}

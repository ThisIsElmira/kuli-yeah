package JB11.AsgNo4and5;

public class Queue
{
    private LinkedList LL = new LinkedList();
    void enqueue(Customer data)
    {
        LL.addLast(data);
    }

    Customer dequeue()
    {
        Customer data = LL.getData(0);
        LL.removeFirst();
        return data;
    }

    void print()
    {
        Node temp = LL.head;
        while (temp != null)
        {
            temp.data.print();
            temp = temp.next;
        }
    }
}

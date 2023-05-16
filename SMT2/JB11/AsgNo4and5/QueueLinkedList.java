package JB11.AsgNo4and5;

public class QueueLinkedList
{
    int max, size, front, rear;
    Node head, tail;

    QueueLinkedList(int max)
    {
        this.max = max;
        create();
    }

    boolean isEmpty()
    {
        return head == null;
    }

    void create()
    {
        size = 0;
        front = rear - 1;
    }

    void print()
    {
        if(!isEmpty())
        {
            Node tmp = head;
            System.out.println("Queued Linked list content:");
            while (tmp != null)
            {
                System.out.println(tmp.data);
                tmp = tmp.next;
            }
            System.out.println();
        }
        else System.out.println("Queue is empty!");
    }

    void enqueue(Node input)
    {
        Node ndInput = new Node(input, null);
        if(isEmpty())
        {
            head = ndInput;
            tail = ndInput;
        }
        else
        {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    void dequeue()
    {
        if(isEmpty()) System.out.println("Queued Linked list is empty, cannot remove a data");
        else if(head == tail) head = tail = null;
        else
        {
            Node temp = head;
            while (temp.next != tail) temp = temp.next;
            temp.next = null;
            tail = temp;
        }
    }
}

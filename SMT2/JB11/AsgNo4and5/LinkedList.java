package JB11.AsgNo4and5;

public class LinkedList
{
    Node head, tail;

    boolean isEmpty()
    {
        return head == null;
    }

    void print()
    {
        if(!isEmpty())
        {
            Node tmp = head;
            System.out.print("Linked list content: \t");
            while (tmp != null)
            {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println();
        }
        else System.out.println("Linked list is empty!");
    }

    void addLast(Customer input)
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

    void removeFirst()
    {
        if (isEmpty()) System.out.println("Linked list is empty, cannot remove a data");
        else if (head == tail) head = tail = null;
        else head = head.next;
    }

    Customer getData(int index)
    {
        Node tmp = head;
        for (int i = 0; i < index; i++) tmp = tmp.next;
        return tmp.data;
    }
}

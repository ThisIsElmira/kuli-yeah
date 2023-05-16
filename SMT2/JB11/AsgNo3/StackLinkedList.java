package JB11.AsgNo3;

public class StackLinkedList
{
    int size, top;
    Node head, tail;

    StackLinkedList(int size)
    {
        this.size = size;
        top = -1;
    }

    boolean isEmpty()
    {
        return head == null;
    }


    void push(String input)
    {
        Node ndInput = new Node(input, null);
        if (isEmpty())
        {
            top++;
            head = ndInput;
            tail = ndInput;
        }
        else
        {
            ndInput.next = head;
            head = ndInput;
        }
    }

    void print()
    {
        System.out.println("Stack content: ");
        if(!isEmpty())
        {
            Node tmp = head;
            while (tmp != null)
            {
                System.out.println(tmp.data);
                tmp = tmp.next;
            }
            System.out.println();
        }
        else System.out.println("Linked list is empty!");
    }
}

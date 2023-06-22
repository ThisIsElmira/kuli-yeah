package JB15.Asg;

public class DoubleLinkedList<TData>
{
    Node<TData> head;
    int size;

    public DoubleLinkedList()
    {
        head = null;
        size = 0;
    }

    boolean isEmpty()
    {
        return size == 0;
    }

    void addFirst(TData item)
    {
        if(isEmpty()) head = new Node(null, item, null);
        else
        {
            Node<TData> newNode = new Node<TData>(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    int size()
    {
        return size;
    }

    void clear()
    {
        head = null;
        size = 0;
    }

    void removeFirst() throws Exception
    {
        if (isEmpty()) throw new Exception("Linked list is still empty, can't remove");
        if (size == 1)
        {
            removeLast();
            return;
        }

        head = head.next;
        head = null;
        size--;
    }

    void removeLast() throws Exception
    {
        if (isEmpty()) throw new Exception("Linked list is still empty, can't remove");
        if (head.next == null)
        {
            head = null;
        }
        else
        {
            Node<TData> current = head;
            while (current.next.next != null) current = current.next;
            current.next = null;
        }
        size--;
    }

    void remove(int index) throws Exception
    {
        if (isEmpty() || index >= size) throw new Exception("Index value is out of bound");

        if (index == 0)
        {
            removeFirst();
            return;
        }

        Node<TData> current = head;
        int i = 0;
        while (i < index - 1)
        {
            current = current.next;
            i++;
        }
        current.next = current.next.next;
        size--;
    }

    TData get(int index) throws Exception
    {
        if (isEmpty()) throw new Exception("Linked list is still empty");
        Node<TData> tmp = head;
        for (int i = 0; i < index; i++) tmp = tmp.next;
        return tmp.data;
    }

    int search(TData data)
    {
        if (isEmpty()) return -1;

        Node<TData> current = head;
        int i = 0;
        while (current != null)
        {
            if (current.data == data) return i;
            i++;
            current = current.next;
        }
        return -1;
    }
}

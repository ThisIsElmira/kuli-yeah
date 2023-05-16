package JB11.Asg;

public class ThisIsASSignment<TData>
{
    Node<TData> head;
    Node<TData> tail;
   public boolean isEmpty()
   {
       return head == null;
   }

   public void print()
   {
       if(!isEmpty())
       {
           Node<TData> tmp = head;
           System.out.println("Linked List Content: \t");
           while (tmp != null)
           {
               System.out.print(tmp.value + "\t");
               tmp = tmp.next;
           }
           System.out.println();
       }
       else System.out.println("Linked list is empty");
   }

   public void addFirst(TData input)
   {
       Node<TData> ndInput = new Node<TData>(input, null);
       if (isEmpty())
       {
           head = ndInput;
           tail = ndInput;
       }
       else
       {
           ndInput.next = head;
           head = ndInput;
       }
   }

    public void addLast(TData input)
    {
        Node<TData> ndInput = new Node<TData>(input, null);
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

    public TData getData(int index)
    {
        Node<TData> tmp = head;
        for (int i = 0; i < index; i++) tmp = tmp.next;
        return tmp.value;
    }

    public void removeFirst()
    {
        if (isEmpty()) System.out.println("Linked list is empty");
        else if (head == tail) head = tail = null;
        else head = head.next;
    }

    public void removeLast()
    {
        if (isEmpty()) System.out.println("Linked list is empty");
        else if (head == tail) head = tail = null;
        else
        {
            Node<TData> temp = head;
            while (temp.next == null) temp = temp.next;
            temp.next = null;
            tail = temp;
        }
    }
}

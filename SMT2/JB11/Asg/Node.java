package JB11.Asg;

public class Node<TData>
{
    public TData value;
    public Node<TData> next;

    public Node(TData value)
    {
        this.value = value;
        this.next = null;
    }

    public Node(TData value, Node<TData> next)
    {
        this.value = value;
        this.next = next;
    }
}

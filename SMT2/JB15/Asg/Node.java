package JB15.Asg;

public class Node<TData>
{
    public TData data;
    public Node<TData> prev, next;

    public Node(Node<TData> prev, TData data, Node<TData> next)
    {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}

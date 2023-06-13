package JB12.Asg2;

public class Node
{
    public int data;
    public Node prev, next;

    public Node(Node prev, int data, Node next)
    {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}

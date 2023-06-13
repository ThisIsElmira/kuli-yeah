package JB12.Asg1;

public class Node
{
    int data;
    Node prev, next;

    Node(Node prev, int data, Node next)
    {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}

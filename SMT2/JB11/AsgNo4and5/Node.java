package JB11.AsgNo4and5;

public class Node
{
    String data, name, addr;
    Node next;
    int can;

    public Node(String data, Node next)
    {
        this.data = data;
        this.next = next;
    }

    public Node(String name, String addr, int can)
    {
        this.name = name;
        this.addr = addr;
        this.can = can;
    }
}

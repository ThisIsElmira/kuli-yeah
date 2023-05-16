package JB11.AsgNo3;

public class Main
{
    public static void main(String[] args)
    {
        StackLinkedList stk = new StackLinkedList(8);
        stk.push("Bahasa");
        stk.push("Android");
        stk.push("Komputer");
        stk.push("Basis Data");
        stk.push("Matematika");
        stk.push("Algoritma");
        stk.push("Statistika");
        stk.push("Multimedia");
        stk.print();
    }
}

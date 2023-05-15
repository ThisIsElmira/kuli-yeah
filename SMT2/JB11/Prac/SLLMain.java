package JB11.Prac;

public class SLLMain
{
    public static void main(String[] args)
    {
        SingleLinkedList singLL = new SingleLinkedList();
        singLL.print();
        singLL.addFirst(890);
        singLL.print();
        singLL.addLast(760);
        singLL.print();
        singLL.addFirst(700);
        singLL.print();
        singLL.insertAfter(700, 999);
        singLL.print();
        singLL.insertAt(3, 833);
        singLL.print();

        //activities number 2 start from here
        System.out.println("=========================");

        System.out.println("Data in 1st index : " + singLL.getData(1));
        System.out.println("Data 3 is in index : " + singLL.indexOf(760));
        System.out.println("Index of 890: " + singLL.indexOf(890));
        singLL.remove(999);
        singLL.print();
        singLL.removeAt(0);
        singLL.print();
        singLL.removeFirst();
        singLL.print();
        singLL.removeLast();
        singLL.print();
    }
}
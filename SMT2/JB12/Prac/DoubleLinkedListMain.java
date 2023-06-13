package JB12.Prac;

public class DoubleLinkedListMain
{
    public static void main(String[] args) throws Exception {
        DoubleLinkedLists dll = new DoubleLinkedLists();
        dll.print();
        System.out.println("Size : " + dll.size);
        System.out.println("==================================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size : " + dll.size);
        System.out.println("==================================");
        dll.add(40, 1);
        dll.print();
        System.out.println("Size : " + dll.size);
        System.out.println("==================================");
        dll.clear();
        dll.print();
        System.out.println("Size : " + dll.size);
        dll.addLast(50);
        dll.addLast(40);
        dll.addLast(10);
        dll.addLast(20);
        dll.print();
        System.out.println("Size : " + dll.size);
        System.out.println("==================================");

        //act 2 starts from here
        dll.removeFirst();
        dll.print();
        System.out.println("Size : " + dll.size);
        System.out.println("==================================");
        dll.removeLast();
        dll.print();
        System.out.println("Size : " + dll.size);
        System.out.println("==================================");
        dll.remove(1);
        dll.print();
        System.out.println("Size : " + dll.size);

        //addon
        dll.clear();

        //act 3 starts from here
        dll.print();
        System.out.println("Size : " + dll.size);
        System.out.println("==================================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size : " + dll.size);
        System.out.println("==================================");

        dll.add(40, 1);
        dll.print();
        System.out.println("Size : " + dll.size);
        System.out.println("==================================");
        System.out.println("Data in the head of linked list is : " + dll.getFirst());
        System.out.println("Data in the tail of linked list is : " + dll.getLast(0));
        System.out.println("Data in the 1st index linked list is : " + dll.get(1));
    }
}

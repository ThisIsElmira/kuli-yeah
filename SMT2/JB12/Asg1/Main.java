package JB12.Asg1;

import java.util.Scanner;

public class Main
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        DoubleLinkedLists dll = new DoubleLinkedLists();
        int menu, data, index;
        do
        {
            System.out.println("=========================================");
            System.out.println("Data manipulation with Double Linked List");
            System.out.println("=========================================");
            System.out.println("1. Add First");
            System.out.println("2. Add Tail");
            System.out.println("3. Add Data in nth index");
            System.out.println("4. Remove first");
            System.out.println("5. Remove Last");
            System.out.println("6. Remove data by index");
            System.out.println("7. Print");
            System.out.println("8. Search Data");
            System.out.println("9. Sort Data");
            System.out.println("10. Exit");
            System.out.println("=========================================");
            menu = sc.nextInt();
            switch (menu)
            {
                case 1:
                    System.out.println("Insert Data in Head position");
                    data = sc.nextInt();
                    dll.addFirst(data);
                    break;
                case 2:
                    System.out.println("Insert Data in Tail position");
                    data = sc.nextInt();
                    dll.addLast(data);
                    break;
                case 3:
                    System.out.println("Insert Data");
                    System.out.print("Data node : ");
                    data = sc.nextInt();
                    System.out.print("In index : ");
                    index = sc.nextInt();
                    dll.add(data, index);
                    break;
                case 4:
                    System.out.println("Removed First Data (" + dll.getFirst() + ")");
                    dll.removeFirst();
                    break;
                case 5:
                    System.out.println("Removed Last Data (" + dll.getLast(0));
                    dll.removeLast();
                    break;
                case 6:
                    System.out.println("Remove Data");
                    System.out.print("In Index : ");
                    index = sc.nextInt();
                    dll.remove(index);
                    break;
                case 7:
                    dll.print();
                    break;
                case 8:
                    System.out.print("Search Data : ");
                    int search = sc.nextInt();
                    int pos = dll.sequentialSearch(search);
                    if (pos == -1) System.out.println("Data: " + search + " isn't found");
                    else System.out.println("Data: " + search + " found at index-" + pos);
                    break;
                case 9:
                    System.out.println("Sort Data");
                    dll.bubbleSort();
                    System.out.println("Print Data :");
                    dll.print();
            }
        }
        while (menu != 10);
    }
}
